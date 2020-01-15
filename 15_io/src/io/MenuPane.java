package io;

import java.awt.Container;

import javax.swing.JMenu;
import javax.swing.JMenuBar;//����,����,���� �� ������ JMenu��� ��
//���� : ���θ����, ����, ����, ������
//���� : �߶󳻱�, ���� , �ٿ��ֱ�
//���� - �̰� ����
//��ư Menu �ȿ� �ִ� �͵��� JMenuItem
import javax.swing.JMenuItem;

public class MenuPane extends JMenuBar{ //menu�� �������� �־�� �� ���� ���ϱ� ��ӹ޾ƾ���
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	
	public MenuPane() {
		fileM = new JMenu("����");
		editM = new JMenu("����");
		viewM = new JMenu("����");
		
		newM = new JMenuItem("���θ����");
		openM = new JMenuItem("����");
		saveM = new JMenuItem("����");
		exitM = new JMenuItem("������");
		
		cutM = new JMenuItem("�߶󳻱�");
		copyM = new JMenuItem("����");
		pasteM = new JMenuItem("�ٿ��ֱ�");
		
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.add(exitM);
		
		editM.add(cutM);
		editM.add(copyM);
		editM.add(pasteM);
		
		add(fileM);
		add(editM);
		add(viewM);
		
		//����Ű
		//Alt+X �߶󳻱�
		//Alt+C ����
		//Alt+V �ٿ��ֱ�
		
	}
	public static void main(String[] args) {
		new MenuPane();
	}
	public JMenu getFileM() {
		return fileM;
	}
	public JMenu getEditM() {
		return editM;
	}
	public JMenu getViewM() {
		return viewM;
	}
	public JMenuItem getNewM() {
		return newM;
	}
	public JMenuItem getOpenM() {
		return openM;
	}
	public JMenuItem getSaveM() {
		return saveM;
	}
	public JMenuItem getExitM() {
		return exitM;
	}
	public JMenuItem getCutM() {
		return cutM;
	}
	public JMenuItem getCopyM() {
		return copyM;
	}
	public JMenuItem getPasteM() {
		return pasteM;
	}
	
	
}
