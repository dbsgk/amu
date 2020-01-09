package board;

import java.util.ArrayList;
import java.util.Calendar;

//BoradDTO�� ��Ʈ�� �ؼ� ��ü�� viewer�� �����ִ� controllerŬ����

public class BoardController {
	
	private ArrayList<BoardDTO> list;
	private int currentNumber;//���������� �ۼ��� �۹�ȣ

	public BoardController() {
		list = new ArrayList<BoardDTO>();
		
		BoardDTO b1 = new BoardDTO();
		b1.setId(1);
		b1.setTitle("�Խñ�1");
		b1.setWriterId(1);
		b1.setContent("�Խñ�1�ǳ���");
		// Ķ������ ��¥ǥ���ϴ� Ŭ����
		// �Ϲ� �����ڷ� ���� �ʱ�ȭ�ϴ°��� �ƴ϶�
		// Ķ������ getInstance��� static method�� �̿��ؼ�
		// ���糯¥�� �ʱ�ȭ.
		Calendar cal = Calendar.getInstance();
		b1.setWrittenDate(cal);
		b1.setUpdatedDate(cal);

		BoardDTO b2 = new BoardDTO();
		b2.setId(2);
		b2.setTitle("�Խñ�2");
		b2.setWriterId(2);
		b2.setContent("�Խñ�2�ǳ���");
		b2.setWrittenDate(cal);
		b2.setUpdatedDate(cal);

		BoardDTO b3 = new BoardDTO();
		b3.setId(3);
		b3.setTitle("�Խñ�3");
		b3.setWriterId(1);
		b3.setContent("�Խñ�3�ǳ���");
		b3.setWrittenDate(cal);
		b3.setUpdatedDate(cal);

		list.add(b1);
		list.add(b2);
		list.add(b3);

	}
	
	//���� ����Ǿ��ִ� ��� ���� �����ִ� method
	//����ü��Ϲ�ȯ
	public ArrayList<BoardDTO> selectAll(){
		//������ζ�� �����ͺ��̽��� ����ؼ�
		//�����ͺ��̽��� �Խñ� ���̺� ������ �� �ܾ�ͼ�
		//ArrayList�� ��Ƽ� return����� ������
		//�츮�� field�� �ִ� list�������ش�.
		return list;
	}
	
	//����ڰ� ������ ���� �ϳ��� �����ִ� method
	public BoardDTO select(int id) {
		//�����ͺ��̽��� ��û�� ����������
		//���� �츮�� null�� �ȸ�����൵ ������
		//�츮�� �����ͺ��̽��� �ƴϱ⶧����
		//������ ���ؼ�
		//�ش� �� ��ȣ�� �����ϴ� ��ȣ���� Ȯ���ϰ�
		//�������� ������ null�� �������ش�.
		BoardDTO b = new BoardDTO();
		b.setId(id);

		if (list.indexOf(b) == -1) {
			return null;
		} else {
			return list.get(list.indexOf(b));
		}
	}
	
	//����ڰ� �Խñ� �ۼ� ��û�� ������
	//BoardDTO ��ü�� �޾Ƽ� �츮 list�� �߰��ϴ� method
	public int insert(BoardDTO b) {
		currentNumber++;
		b.setId(currentNumber);
		b.setWrittenDate(Calendar.getInstance());//�ۼ���¥
		b.setUpdatedDate(Calendar.getInstance());//������¥
		list.add(b);
		return currentNumber;
	}
	
	//����ڰ� �Խñ� ���� ��û�� ������
	//BoradDTO ��ü�� �޾Ƽ� �츮 list���� �ٲ��ִ� �޼ҵ�
	public void update(BoardDTO b) {
		//�츮�� ���⼭�� �ش� ��ġ�� ��Ҹ� b�� �ٲٴ� 
		//list.set�� ����� ���̴�. ������ set�� �ε�����ȣ�� �ʿ��ϴ�
		//�츮�� �� ��û�� ���������� �̹� b�� id��ȣ�� �ֱ� ������ 
		//indexOf�� ������ �� �ִ�.
		int index = list.indexOf(b);
		//�츮�� ���޹��� b�� id�� ������
		//content(����)�� Ʋ���� �ִ�.
		//������ �츮�� BoardDTO�� �����س��� equals �޼ҵ��
		//id�� üũ�ϱ� ������
		//indexOf�� �����ϸ� �����ִ� ���� index��ȣ�� �˼� �ִ�.
		b.setUpdatedDate(Calendar.getInstance());
		
		list.set(index, b);
		
	}
	
	//����ڰ� �� ������û�� ������
	//list���� remove�޼ҵ带 �����Ѵ�.
	public void delete(BoardDTO b) {
		list.remove(b);
		
	}

	public ArrayList<BoardDTO> selectByWriterId(int writerId) {
		ArrayList<BoardDTO> writerIdList = new ArrayList<BoardDTO>();
		for(BoardDTO b: list) {
			if(b.getWriterId()== writerId) {
				writerIdList.add(b);
			}
		}
		return writerIdList;
	}
	
}
