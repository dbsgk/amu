package io;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreForm2 extends JFrame implements ActionListener{
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakF, nameF, korF, engF, mathF;
	private JButton inputB, outputB, searchB, rankB, saveB, loadB;
	private ScoreImpl si;
	private JTextArea output;
	
	public ScoreForm2() {
		hakL = new JLabel("�й�");nameL = new JLabel("�̸�");korL = new JLabel("����");engL = new JLabel("����");mathL = new JLabel("����");
		hakF = new JTextField();nameF = new JTextField();korF = new JTextField();engF = new JTextField();mathF = new JTextField();
		inputB = new JButton("�Է�");outputB = new JButton("���");searchB = new JButton("�˻�");rankB = new JButton("����");saveB = new JButton("����");loadB = new JButton("�ҷ�����");
		si = new ScoreImpl();
		output = new JTextArea();
		
		hakF.setPreferredSize(new Dimension(60, 15));
		nameF.setPreferredSize(new Dimension(60, 15));
		korF.setPreferredSize(new Dimension(60, 15));
		engF.setPreferredSize(new Dimension(60, 15));
		mathF.setPreferredSize(new Dimension(60, 15));
		
		JPanel inputP = new JPanel();
		inputP.setLayout(new GridLayout(5,2));
		inputP.add(hakL);
		inputP.add(hakF);
		inputP.add(nameL);
		inputP.add(nameF);
		inputP.add(korL);
		inputP.add(korF);
		inputP.add(engL);
		inputP.add(engF);
		inputP.add(mathL);
		inputP.add(mathF);
		
		JPanel outputP = new JPanel();
		outputP.setLayout(new BorderLayout());
		outputP.add(output);
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new FlowLayout());
		buttonP.add(inputB);
		buttonP.add(outputB);
		buttonP.add(searchB);
		buttonP.add(rankB);
		buttonP.add(saveB);
		buttonP.add(loadB);
		
		//Container con = new Container();
		add("West", inputP);
		add("Center", outputP);
		add("South",buttonP);
		setBounds(500,500,500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ
		inputB.addActionListener(this);
		outputB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}
	public static void main(String[] args) {
		new ScoreForm2();
	}//main
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inputB) {si.input(new ScoreDTO());}//scoreDTO ���ڷ� �ֱ�
//		else if(e.getSource()==outputB) {si.output(new JTextArea());}
//		else if(e.getSource()==searchB) {si.search(new );}
		else if(e.getSource()==rankB) {si.tot_desc();}
		else if(e.getSource()==saveB) {si.save();}
		else if(e.getSource()==loadB) {si.load();}
	}//actionPerformed
}//class
