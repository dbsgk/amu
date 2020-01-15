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
	private Score score;//������ �θ� ������ �ڽĲ�.
	private JTable table;
	public ScoreForm() {
		
		//�� ���� 
		hakL = new JLabel("�й�");
		nameL = new JLabel("�̸�");
		korL = new JLabel("����");
		engL = new JLabel("����");
		mathL = new JLabel("����");
		
		//�ؽ�Ʈ�ʵ� ����
		hakT = new JTextField(30);
		nameT = new JTextField(30);
		korT = new JTextField(30);
		engT = new JTextField(30);
		mathT = new JTextField(30);
		
		//��ư ���� 
		inputB = new JButton("�Է�"); 
		printB = new JButton("���"); 
		searchB = new JButton("�й��˻�"); 
		rankB = new JButton("����"); 
		saveB = new JButton("��������"); 
		loadB = new JButton("�����б�"); 
		
		output = new JTextArea(25,35);
		//��ư �г� ���� 
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
		
		score = new ScoreImpl();//������ �θ� ������ �ڽĲ�.
		
		//���� �� �г� 
		JPanel lP = new JPanel(new GridLayout(5,1,3,1));
		lP.add(p1); lP.add(p2);
		lP.add(p3); lP.add(p4);
		lP.add(p5);
		
		table = new JTable();
		JScrollPane scroll = new JScrollPane();
		
		//���� �ؽ�Ʈ ��������
		JPanel taP = new JPanel();
		taP.add(output);
		taP.add(scroll);
		
		//�����̳� ���� 
		Container con = this.getContentPane();
		con.add("South", buttonP);
		con.add("West", lP);
		con.add("East", taP);
	
		setBounds(200,200,800,400);
		setVisible(true);
		event();
	}
	// �̺�Ʈ ó�� 
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
			dto.calc();//����, ��� ���
			score.input(dto);
			JOptionPane.showMessageDialog(this, "��ϿϷ�!!");
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
