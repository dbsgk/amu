package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2_t extends JFrame implements ActionListener {
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addB,deleteB;
	
	public void insert() {
		//�����߰�
		//�Ȱ��� ���̵� ������ "�ߺ��� ���̵�" �Դϴ�.
		String id = JOptionPane.showInputDialog(this,"���̵� �Է�");
		if(id==null)return;
		for(int i=0;i<model.getRowCount();i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "������� ���̵��Դϴ�.");
				return;
			}
		}//for
		String name = JOptionPane.showInputDialog(this,"�̸��� �Է��Ͻÿ�");
		String pwd = JOptionPane.showInputDialog(this,"��й�ȣ�� �Է��Ͻÿ�");
		String tel = JOptionPane.showInputDialog(this,"��ȭ��ȣ�� �Է��Ͻÿ�");
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);
		
		JOptionPane.showMessageDialog(this, "��ϿϷ�");
		model.addRow(v);
	}//insert
	public void delete() {
		//�̸��� �Է¹޾Ƽ� ����. �Ȱ����� ��� ����.
		//���� �̸��� ������ �޼��� ���̾�α� ����� "ã�� �̸��� �����ϴ�."
		String delName = JOptionPane.showInputDialog(this,"������ �̸��� �Է��Ͻÿ�");
		int sw=0;
		for(int i=0;i<model.getRowCount();i++) {
			if(delName.equals(list.get(i).getName())){
				model.removeRow(i);
				sw=1;
			}
		}//for
		if(sw==0)JOptionPane.showMessageDialog(this, "ã�� �̸��� �����ϴ�.");
	}//delete
	
	public JTableEx2_t() {
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong","ȫ�浿","111","010-123-1234"));
		list.add(new PersonDTO("song","������","486","010-486-4866"));
		
		//����
		vector = new Vector<String>();
		vector.addElement("���̵�");
		vector.addElement("�̸�");
		vector.addElement("��й�ȣ");
		vector.addElement("�ڵ���");
		
		model = new DefaultTableModel(vector,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return (column!=0)? true:false;
			}
		};//vector��� Ÿ��Ʋ ��������Ű�, ������ ���� 0��(����ִ� ���� ����)
	
		//������
		for(PersonDTO dto: list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());
			
			model.addRow(v);
		}
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		addB = new JButton("�߰�");
		deleteB = new JButton("����");
		
		Panel p =new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(addB);
		p.add(deleteB);
		
		Container con = this.getContentPane();
		con.add("Center",scroll);
		con.add("South",p);
		

		addB.addActionListener(this);
		deleteB.addActionListener(this);
		
		setBounds(200,200,500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//const
	public static void main(String[] args) {
		JTableEx2_t jt2 = new JTableEx2_t();
	}//main
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addB)insert();
		else if(e.getSource()==deleteB)delete();
	}
}//class
