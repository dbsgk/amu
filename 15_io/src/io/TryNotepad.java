package io;

//종료 다이얼로그가 든다(반드시 JFrame위에 뜬다.)
//다이얼로그에서 '취소'를 누르면 JFrame창이 그냥 떠있다.
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class TryNotepad extends JFrame implements ActionListener, KeyListener {
	private JTextArea area;
	private MenuPane menu;
	private File file, newFile;

	public TryNotepad() {
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		area.setFont(new Font("고딕체", Font.BOLD, 18));

		menu = new MenuPane();
		this.setJMenuBar(menu);

		//
		add("Center", scroll);
		setBounds(500, 400, 600, 500);
		setTitle("간단 메모장");
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		area.addKeyListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (area.getText().length() != 0) {
					int result = JOptionPane.showConfirmDialog(TryNotepad.this, "저장하시겠습니까?", "메모장",
							JOptionPane.YES_NO_CANCEL_OPTION);// (띄울위치, 메시지, 팝업메시지창의 타이틀, 선택지)
					System.out.println("1번");
					if (result == JOptionPane.YES_OPTION) {
						// 파일 저장
						System.out.println("yes");
						saveDialog();
						fileWrite();
						System.exit(0);
					} else if (result == JOptionPane.NO_OPTION) {
						System.out.println("no");
						System.exit(0);
					} // no
					else {
					}
				} // if
				else {
					System.exit(0);
				}
			}// windowClosing
		});

	}// const

	public static void main(String[] args) {
		new TryNotepad().event();
//		
//		String abc = "abc";
//		System.out.println(abc);

	}// main

	public void event() {
		// 여기서 이벤트 처리; 이벤트 처리할거 너무 많아서 분리함.
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
	}// event

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getNewM()) {
			area.setText("");
		} else if (e.getSource() == menu.getOpenM()) {
			openDialog();// 열기 다이얼로그
			fileRead();// 파일 읽기
		} else if (e.getSource() == menu.getSaveM()) {
			saveDialog();
			fileWrite();
		} else if (e.getSource() == menu.getExitM()) {
			// System.exit(0);

			int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);// (띄울위치,
																													// 메시지,
																													// 팝업메시지창의
																													// 타이틀,
																													// 선택지)
			if (result == JOptionPane.YES_OPTION) {
				// 파일 저장
				if (area.getText().length() != 0) {
					saveDialog();
					fileWrite();
				}
				System.exit(0);
			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		} else if (e.getSource() == menu.getCutM()) {
			area.cut();
		} else if (e.getSource() == menu.getCopyM()) {
			area.copy();
		} else if (e.getSource() == menu.getPasteM()) {
			area.paste();
		}
	}// actionPerfomed

	private void saveDialog() {
		file = null;
		JFileChooser chooser = new JFileChooser();
		int result1 = chooser.showSaveDialog(this);
		if (result1 == JFileChooser.APPROVE_OPTION) { // APPROVE_OPTION은 숫자1
			// 선택한 경로와 파일명이 필요
			file = chooser.getSelectedFile();
		}
	}// saveDialog

	private void fileWrite() {
		// newFile = new File("newFile.txt");//저장한 이름 아까 그 fileChooser에서 불러와야하는데 일단 이렇게
		if (file == null)
			return;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			String data = area.getText();

			bw.write(data);
//			FileWriter fw = new  FileWriter(newFile);
//			fw.write(area.getText());
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// fileWrite

	private void openDialog() {
		// 열기 다이얼로그
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);

		// File file = null;
		if (result == JFileChooser.APPROVE_OPTION) { // APPROVE_OPTION은 숫자1
			// 선택한 경로와 파일명이 필요
			file = chooser.getSelectedFile();
		}
		JOptionPane.showMessageDialog(this, file);
	}// openDialog

	private void fileRead() {
		// 파일 읽기
		if (file == null)
			return;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.readLine();// 아까 한글자 int형으로 읽어올때는 마지막 값이 -1이었는데
							// 이건 한 줄 단위로 읽어오니까 마지막 값은 null이다.
			String line;
			while ((line = br.readLine()) != null) {
				// area.setText(line); setText는 다 덮어써서 마지막 줄만 남음
				area.append(line + "\n");// 엔터값을 못 읽어오니까 라인읽어올때마다 뒤에 \n넣어주게끔..
			}
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// fileRead

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		KeyStroke userKey = KeyStroke.getKeyStroke(e.getKeyChar(), e.getModifiers());
		KeyStroke copyKey = KeyStroke.getKeyStroke('c', InputEvent.ALT_MASK);
		KeyStroke pasteKey = KeyStroke.getKeyStroke('v', InputEvent.ALT_MASK);
		KeyStroke cutKey = KeyStroke.getKeyStroke('z', InputEvent.ALT_MASK);
		if (e.getSource() == area) {

			if (userKey == copyKey) {
				area.copy();
			}
			if (userKey == cutKey) {
				area.cut();
			}
			if (userKey == pasteKey) {
				area.paste();
			}

		}

	}
}// class
