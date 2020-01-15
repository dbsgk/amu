package io;

import javax.swing.JTextArea;

//tot_desc 순위

public interface Score {
	public void input(ScoreDTO dto);
	public void print(JTextArea output);
	public void search(JTextArea output);
	public void tot_desc(); //순위(총점으로 순위매기기)
	public void save();//저장
	public void load();//열기
}
