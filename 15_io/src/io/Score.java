package io;

import javax.swing.JTextArea;

//tot_desc ����

public interface Score {
	public void input(ScoreDTO dto);
	public void print(JTextArea output);
	public void search(JTextArea output);
	public void tot_desc(); //����(�������� �����ű��)
	public void save();//����
	public void load();//����
}
