package io_;

import javax.swing.JTable;


public interface Score {
	
	public void input(ScoreDTO dto);
	public void print(JTable table);
	public void search(JTable table);
	public void tot_desc(); //����
	public void save();
	public void load();

}
