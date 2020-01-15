package io;

//���� ���̾�αװ� ���(�ݵ�� JFrame���� ���.)
//���̾�α׿��� '���'�� ������ JFrameâ�� �׳� ���ִ�.
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
		area.setFont(new Font("���ü", Font.BOLD, 18));

		menu = new MenuPane();
		this.setJMenuBar(menu);

		//
		add("Center", scroll);
		setBounds(500, 400, 600, 500);
		setTitle("���� �޸���");
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		area.addKeyListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (area.getText().length() != 0) {
					int result = JOptionPane.showConfirmDialog(TryNotepad.this, "�����Ͻðڽ��ϱ�?", "�޸���",
							JOptionPane.YES_NO_CANCEL_OPTION);// (�����ġ, �޽���, �˾��޽���â�� Ÿ��Ʋ, ������)
					System.out.println("1��");
					if (result == JOptionPane.YES_OPTION) {
						// ���� ����
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
		// ���⼭ �̺�Ʈ ó��; �̺�Ʈ ó���Ұ� �ʹ� ���Ƽ� �и���.
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
			openDialog();// ���� ���̾�α�
			fileRead();// ���� �б�
		} else if (e.getSource() == menu.getSaveM()) {
			saveDialog();
			fileWrite();
		} else if (e.getSource() == menu.getExitM()) {
			// System.exit(0);

			int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?", "�޸���", JOptionPane.YES_NO_CANCEL_OPTION);// (�����ġ,
																													// �޽���,
																													// �˾��޽���â��
																													// Ÿ��Ʋ,
																													// ������)
			if (result == JOptionPane.YES_OPTION) {
				// ���� ����
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
		if (result1 == JFileChooser.APPROVE_OPTION) { // APPROVE_OPTION�� ����1
			// ������ ��ο� ���ϸ��� �ʿ�
			file = chooser.getSelectedFile();
		}
	}// saveDialog

	private void fileWrite() {
		// newFile = new File("newFile.txt");//������ �̸� �Ʊ� �� fileChooser���� �ҷ��;��ϴµ� �ϴ� �̷���
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
		// ���� ���̾�α�
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);

		// File file = null;
		if (result == JFileChooser.APPROVE_OPTION) { // APPROVE_OPTION�� ����1
			// ������ ��ο� ���ϸ��� �ʿ�
			file = chooser.getSelectedFile();
		}
		JOptionPane.showMessageDialog(this, file);
	}// openDialog

	private void fileRead() {
		// ���� �б�
		if (file == null)
			return;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.readLine();// �Ʊ� �ѱ��� int������ �о�ö��� ������ ���� -1�̾��µ�
							// �̰� �� �� ������ �о���ϱ� ������ ���� null�̴�.
			String line;
			while ((line = br.readLine()) != null) {
				// area.setText(line); setText�� �� ����Ἥ ������ �ٸ� ����
				area.append(line + "\n");// ���Ͱ��� �� �о���ϱ� �����о�ö����� �ڿ� \n�־��ְԲ�..
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
