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

public class JTableEx2 extends JFrame implements ActionListener {
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addB,deleteB;
	
	public void insert() {
		//정보추가
		//똑같은 아이디가 있으면 "중복된 아이디" 입니다.
		Loop: while(true) {
			String id = JOptionPane.showInputDialog(this,"아이디를 입력하시오");//this하면 프레임 위에 뜨고, null하면 프레임 밖에 뜸.
			if(id==null)return;
			for(int i=0;i<list.size();i++) {
				if(id.equals(list.get(i).getId())) {
					JOptionPane.showMessageDialog(this, "중복된 아이디 입니다.");
					continue Loop;
				}
			}//for
			String name = JOptionPane.showInputDialog(this,"이름을 입력하시오");
			String pwd = JOptionPane.showInputDialog(this,"비밀번호를 입력하시오");
			String tel = JOptionPane.showInputDialog(this,"전화번호를 입력하시오");
			
			list.add(new PersonDTO(id,name,pwd,tel));
			
			
			Vector<String> v = new Vector<String>();
			
			v.add(id);
			v.add(name);
			v.add(pwd);
			v.add(tel);
			
			model.addRow(v);break;
			
		}//while
	}//insert
	public void delete() {
		//이름을 입력받아서 삭제. 똑같으면 모두 삭제.
		//만약 이름이 없으면 메세지 다이얼로그 띄워서 "찾는 이름이 없습니다."
		String delName = JOptionPane.showInputDialog(this,"삭제할 이름을 입력하시오");
		if(delName==null)return;
		int count=0;
		for(int i=0;i<model.getRowCount();i++) {
			if(delName.equals(list.get(i).getName())){
				model.removeRow(i);count++;
				i--;
			}
		}//for
		if(count==0)JOptionPane.showMessageDialog(this, "찾는 이름이 없습니다.");
	}//delete
	
	public JTableEx2() {
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong","홍길동","111","010-123-1234"));
		list.add(new PersonDTO("song","송윤하","486","010-486-4866"));
		
		//제목
		vector = new Vector<String>();
		vector.addElement("아이디");
		vector.addElement("이름");
		vector.addElement("비밀번호");
		vector.addElement("핸드폰");
		
		model = new DefaultTableModel(vector,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return (column!=0)? true:false;
			}
		};//vector라는 타이틀 집어넣을거고, 데이터 행이 0개(비어있는 행의 개수)
	
		//데이터
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
		
		addB = new JButton("추가");
		deleteB = new JButton("삭제");
		
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
		JTableEx2 jt2 = new JTableEx2();
	}//main
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addB)insert();
		else if(e.getSource()==deleteB)delete();
	}
}//class
