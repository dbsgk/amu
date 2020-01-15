package io_;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ScoreImpl implements Score {
	private ArrayList<ScoreDTO> list; 
	
	
	public ScoreImpl() {
		list = new ArrayList<ScoreDTO>();
	}

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
		System.out.println("����Ʈ�� ũ��"+list.size());
	}

	@Override
	public void print(JTable table) {
		output.setText("");
		for(ScoreDTO dto: list) {
			output.append(dto.toString()+"\n");
		}//for
	}
	public void print(JTextArea output) {
		output.setText("");
		for(ScoreDTO dto: list) {
			output.append(dto.toString()+"\n");
		}//for
	}

	@Override
	public void search(JTable table) {
		String hak = JOptionPane.showInputDialog(null, "�й��� �Է��ϼ���");
		if(hak==null ||hak.equals(""))return;
		int sw=0;
		for(ScoreDTO dto: list) {
			if(hak.equals(dto.getHak())) {
				sw=1;
			}
		}//for
		if(sw==0)JOptionPane.showMessageDialog(null,"��ġ�ϴ� ����� �����ϴ�.");
	}//search

	@Override
	public void tot_desc() {
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
			
			@Override
			public int compare(ScoreDTO dto1, ScoreDTO dto2) {
				return dto1.getTot() < dto2.getTot() ? 1: -1;
			}
		};
	}

	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);//��ġ��� �ָ��ϸ� �� null������ ��.
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//������ ��ο� ���ϸ�
		}
		if(file == null)return;
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			
			for(ScoreDTO dto: list) {
				oos.writeObject(dto);
			}
			oos.writeInt(list.size());
			oos.close();
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void load() {
		//���� ���̾�α�
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);//��ġ��� �ָ��ϸ� �� null������ ��.
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//������ ��ο� ���ϸ�
		}
		if(file == null)return;
		
		list.clear();//�ʱ�ȭ
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			
			for(int i=0;i<ois.readInt();i++) {
				try {
				ScoreDTO dto = (ScoreDTO)ois.readObject();
				list.add(dto);
				}catch(EOFException e) {
					break;
				}
			}
			ois.close();
		} catch (IOException | ClassNotFoundException  e) {
			e.printStackTrace();
		}
	}

}
