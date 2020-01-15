package io;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreForm extends JFrame implements ActionListener{
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakF, nameF, korF, engF, mathF;
	private JButton inputB, outputB, searchB, rankB, saveB, loadB;
	private ScoreImpl si;
	private JTextArea area;
	
	
	public ScoreForm() {
		hakL = new JLabel("학번");nameL = new JLabel("이름");korL = new JLabel("국어");engL = new JLabel("영어");mathL = new JLabel("수학");
		hakF = new JTextField(10);nameF = new JTextField();korF = new JTextField();engF = new JTextField();mathF = new JTextField();
		inputB = new JButton("입력");outputB = new JButton("출력");searchB = new JButton("검색");rankB = new JButton("순위");saveB = new JButton("저장");loadB = new JButton("불러오기");
		si = new ScoreImpl();
//		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 1, 10, 35));
		p1.add(hakL); p1.add(nameL);
		p1.add(korL); p1.add(engL);
		p1.add(mathL);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5, 1, 10, 35));
		p2.add(hakF); p2.add(nameF);
		p2.add(korF); p2.add(engF);
		p2.add(mathF);

		JPanel p3 = new JPanel(new GridLayout(1, 6, 6, 10));
		p3.add(inputB); p3.add(outputB);
		p3.add(searchB); p3.add(rankB);
		p3.add(saveB); p3.add(loadB);

		area = new JTextArea();
//		add(area);
		//x,y,엑스길이 와이 길이
//		p1.setBounds(5, 10, 30, 280);
//		p2.setBounds(35, 10, 240, 280);
//		p3.setBounds(10, 325, 572, 30);
//		area.setBounds(300, 10, 280, 300);
		
		JScrollPane scroll = new JScrollPane(area);
//		taP.add(scroll);
		JPanel scrollP = new JPanel();
		scrollP.setLayout(new BorderLayout());
		scrollP.add("Center",scroll);
		
		Container c = this.getContentPane();
		JPanel p_left = new JPanel();
		p_left.add(p1);p_left.add(p2);  
		
		c.add("West", p_left);
//		c.add(p2);
		c.add("Center", scrollP);
		c.add("South", p3);


		setBounds(500, 200, 600, 400);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JPanel inputP = new JPanel();
//		inputP.setLayout(new GridLayout(1,2));
//		inputP.add(hakL);
//		inputP.add(hakF);
//		inputP.add(hakL);
//		inputP.add(hakF);
//		inputP.add(hakL);
//		inputP.add(hakF);
//		inputP.add(hakL);
//		inputP.add(hakF);
//		
//		JPanel outputP = new JPanel();
//		JPanel buttonP = new JPanel();
//		buttonP.setLayout(new FlowLayout());
//		buttonP.add(inputB);
//		buttonP.add(outputB);
//		buttonP.add(searchB);
//		buttonP.add(rankB);
//		buttonP.add(saveB);
//		buttonP.add(loadB);
//		
//		//Container con = new Container();
//		add("West", inputP);
//		//con.add("East", outputP);
//		add("South",buttonP);
//		setBounds(500,500,500,400);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트
		inputB.addActionListener(this);
		outputB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}
	public static void main(String[] args) {
		new ScoreForm();
	}//main
	@Override
	public void actionPerformed(ActionEvent e) {
		ScoreDTO dto;
		if(e.getSource()==inputB) {
			dto = new ScoreDTO(hakF.getText(), nameF.getText(), Integer.parseInt(korF.getText()), Integer.parseInt(engF.getText()), Integer.parseInt(mathF.getText()));
			si.input(dto);
			hakF.setText("");
			nameF.setText("");
			korF.setText("");
			engF.setText("");
			mathF.setText("");
		}//scoreDTO 인자로 넣기
		else if(e.getSource()==outputB) {area.setText("");si.print(area);}
		else if(e.getSource()==searchB) {area.setText("");si.search(area);}
		else if(e.getSource()==rankB) {area.setText("");si.tot_desc();si.print(area);}
		else if(e.getSource()==saveB) {si.save();}
		else if(e.getSource()==loadB) {si.load();si.print(area);}
	}//actionPerformed
}//class
