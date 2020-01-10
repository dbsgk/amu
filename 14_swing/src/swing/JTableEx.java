package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableEx extends JFrame{
	JTable table;
	JTableModel model;//사용자 모델정의 클래스
	public JTableEx() {
		model = new JTableModel();
		table = new JTable(model);
		add(new JScrollPane(table));//스크롤 생성
		
		setBounds(200,200,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//dialog떠야하는 곳에선 못씀.
		//창끝내기 ( windowAdapter.windowClosing)
	}
	public static void main(String[] args) {
		new JTableEx();
	}
}
class JTableModel extends AbstractTableModel{//java.swing의 추상클래스
	Object[][] data = {{"Nari","마루치",new Integer(1234),"옆집친구"},
			{"ㅒ","마루치",new Integer(1234),"옆집친구"},
			{"Nari","마루치",new Integer(1234),"옆집친구"},
			{"Nari","마루치",new Integer(1234),"옆집친구"}
	};
	
	String[] name = {"아이디", "이름","비밀번호","구분"};//필드명 들
	
	@Override
	public int getRowCount() {//열의수
		return data.length;
	}

	@Override
	public int getColumnCount() {//행의수
		return name.length;
		
	}
	public boolean isCellEditable(int r, int c) {
		return(c!=0)? true:false;
	}
	@Override
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}
	public String getColumeName(int c) {
		return name[c];
		
	}
	public void setValuAt(Object obj, int r, int c) {//필드값 변경
		data[r][c]=obj;
	}
	
}
