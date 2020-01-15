package io_;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreForm extends JFrame implements ActionListener{
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField  hakT, nameT, korT, engT, mathT;
	private JButton inputB, printB, searchB, rankB, saveB, loadB;
	private JTextArea output;
	private Score score;//접근은 부모가 생성은 자식꺼.
	private JTable table;
	public ScoreForm() {
		
		//라벨 생성 
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");
		
		//텍스트필드 생성
		hakT = new JTextField(30);
		nameT = new JTextField(30);
		korT = new JTextField(30);
		engT = new JTextField(30);
		mathT = new JTextField(30);
		
		//버튼 생성 
		inputB = new JButton("입력"); 
		printB = new JButton("출력"); 
		searchB = new JButton("학번검색"); 
		rankB = new JButton("순위"); 
		saveB = new JButton("파일저장"); 
		loadB = new JButton("파일읽기"); 
		
		output = new JTextArea(25,35);
		//버튼 패널 생성 
		JPanel buttonP = new JPanel(new GridLayout(1,6,5,3));
		buttonP.add(inputB);
		buttonP.add(printB);
		buttonP.add(searchB);
		buttonP.add(rankB);
		buttonP.add(saveB);
		buttonP.add(loadB);
		
		
		JPanel p1 = new JPanel();
		p1.add(hakL);p1.add(hakT);
		JPanel p2 = new JPanel();
		p2.add(nameL);p2.add(nameT);
		JPanel p3 = new JPanel();
		p3.add(korL);p3.add(korT);
		JPanel p4 = new JPanel();
		p4.add(engL);p4.add(engT);
		JPanel p5 = new JPanel();
		p5.add(mathL);p5.add(mathT);
		
		score = new ScoreImpl();//접근은 부모가 생성은 자식꺼.
		
		//왼쪽 라벨 패널 
		JPanel lP = new JPanel(new GridLayout(5,1,3,1));
		lP.add(p1); lP.add(p2);
		lP.add(p3); lP.add(p4);
		lP.add(p5);
		
		table = new JTable();
		JScrollPane scroll = new JScrollPane();
		
		//우측 텍스트 에어리어생성
		JPanel taP = new JPanel();
		taP.add(output);
		taP.add(scroll);
		
		//컨테이너 생성 
		Container con = this.getContentPane();
		con.add("South", buttonP);
		con.add("West", lP);
		con.add("East", taP);
	
		setBounds(200,200,800,400);
		setVisible(true);
		event();
	}
	// 이벤트 처리 
	public void event(){
		inputB.addActionListener(this); 
		printB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inputB) {
			ScoreDTO dto = new ScoreDTO(hakT.getText(), nameT.getText(), Integer.parseInt(korT.getText().trim()), Integer.parseInt(engT.getText().trim()), Integer.parseInt(mathT.getText().trim()));
			dto.calc();//총점, 평균 계산
			score.input(dto);
			JOptionPane.showMessageDialog(this, "등록완료!!");
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
		}else if(e.getSource()==printB) {
			score.print(table);
			
		}else if(e.getSource()==searchB) {
			score.search(table);
			
		}else if(e.getSource()==rankB) {
			score.tot_desc();
			
		}else if(e.getSource()==saveB) {
			score.save();
			
		}else if(e.getSource()==loadB) {
			score.load();
			
		}
		
	}
	
	
	
	
}
