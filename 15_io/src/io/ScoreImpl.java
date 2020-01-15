package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ScoreImpl implements Score{
	ScoreForm sf;
	ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
	}

	@Override
	public void print(JTextArea output) {
		//dto list�� output���� print �ϰڴ�.
		output.append("�й� �̸� ���� ���� ���� ���� ���\n");
		//output.append("�й�\t�̸�\t����\t����\t����\t����\t���");
		for(ScoreDTO data : list) {
			output.append(data.getHak()+" "+data.getName()
			+" "+data.getKor()+" "+data.getEng()
			+" "+data.getMath()+" "+data.getTot()+" "+data.getAvg());
			output.append("\n");
		}
//		for(ScoreDTO data : list) {
//			output.append(data.getHak()+"\t"+data.getName()
//			+"\t"+data.getKor()+"\t"+data.getEng()
//			+"\t"+data.getMath()+"\t"+data.getTot()+"\t"+data.getAvg());
//			output.append("\n");
//		}
	}

	@Override
	public void search(JTextArea output) {
		//�̸��� �Է¹޴� dialog ����
		//���� �̸��� list�� ������ output�� print
		String searchName = JOptionPane.showInputDialog("�̸��� �Է����ּ���");
		output.append("�й� �̸� ���� ���� ���� ���� ���\n");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(searchName)) {
				output.append(list.get(i).getHak()+" "+list.get(i).getName()
				+" "+list.get(i).getKor()+" "+list.get(i).getEng()
				+" "+list.get(i).getMath()+" "+list.get(i).getTot()+" "+list.get(i).getAvg());
				output.append("\n");
			}
		}
		
	}

	@Override
	public void tot_desc() {
		Collections.sort(list,Collections.reverseOrder());
	}

	@Override
	public void save() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Score.txt"));
			for(ScoreDTO data : list) {
				oos.writeObject(data);
			}
			oos.writeObject(null);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void load() {
		//������ �޾Ƽ� syso
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Score.txt"));
			ScoreDTO dto = (ScoreDTO) ois.readObject();
			while(ois.readObject()!=null) {
				list.add(dto);
			}
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
