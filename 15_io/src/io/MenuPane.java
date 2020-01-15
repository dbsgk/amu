package io;

import java.awt.Container;

import javax.swing.JMenu;
import javax.swing.JMenuBar;//파일,편집,보기 이 세개를 JMenu라고 함
//파일 : 새로만들기, 열기, 저장, 끝내기
//편집 : 잘라내기, 복사 , 붙여넣기
//보기 - 이건 생략
//암튼 Menu 안에 있는 것들이 JMenuItem
import javax.swing.JMenuItem;

public class MenuPane extends JMenuBar{ //menu는 프레임이 있어야 그 위에 띄우니까 상속받아야함
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	
	public MenuPane() {
		fileM = new JMenu("파일");
		editM = new JMenu("편집");
		viewM = new JMenu("보기");
		
		newM = new JMenuItem("새로만들기");
		openM = new JMenuItem("열기");
		saveM = new JMenuItem("저장");
		exitM = new JMenuItem("끝내기");
		
		cutM = new JMenuItem("잘라내기");
		copyM = new JMenuItem("복사");
		pasteM = new JMenuItem("붙여넣기");
		
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
		
		//단축키
		//Alt+X 잘라내기
		//Alt+C 복사
		//Alt+V 붙여넣기
		
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
