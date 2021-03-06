package interface_1;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExit implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {//이건 닫고나서 메모리정리 등 사후처리
		
	}

	@Override
	public void windowClosing(WindowEvent e) {//윈도우 창닫기버튼누르면 호출
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);//프로그램 강제 종료 
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

}
