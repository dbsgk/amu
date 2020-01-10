package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableEx extends JFrame{
	JTable table;
	JTableModel model;//����� ������ Ŭ����
	public JTableEx() {
		model = new JTableModel();
		table = new JTable(model);
		add(new JScrollPane(table));//��ũ�� ����
		
		setBounds(200,200,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//dialog�����ϴ� ������ ����.
		//â������ ( windowAdapter.windowClosing)
	}
	public static void main(String[] args) {
		new JTableEx();
	}
}
class JTableModel extends AbstractTableModel{//java.swing�� �߻�Ŭ����
	Object[][] data = {{"Nari","����ġ",new Integer(1234),"����ģ��"},
			{"��","����ġ",new Integer(1234),"����ģ��"},
			{"Nari","����ġ",new Integer(1234),"����ģ��"},
			{"Nari","����ġ",new Integer(1234),"����ģ��"}
	};
	
	String[] name = {"���̵�", "�̸�","��й�ȣ","����"};//�ʵ�� ��
	
	@Override
	public int getRowCount() {//���Ǽ�
		return data.length;
	}

	@Override
	public int getColumnCount() {//���Ǽ�
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
	public void setValuAt(Object obj, int r, int c) {//�ʵ尪 ����
		data[r][c]=obj;
	}
	
}
