package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrCanvas extends Canvas {
	private MsPaint mp;
	public DrCanvas(MsPaint mp) {
		this.mp = mp;
		setBackground(new Color(220,180,255));
		
	}
	@Override
	public void paint(Graphics g) {
		if (mp.getFill().isSelected()) {
			setForeground(mp.col);
	         if (mp.getLine().isSelected())
	            g.drawLine(mp.x1, mp.y1, mp.x2, mp.y2);
	         else if (mp.getCircle().isSelected())
	            g.fillOval(mp.x1, mp.y1,  mp.x2-mp.x1, mp.y2-mp.y1);
	         else if (mp.getRect().isSelected())
	            g.fillRect(mp.x1, mp.y1, mp.x2-mp.x1, mp.y2-mp.y1);
	         else if (mp.getRoundRect().isSelected())
	            g.fillRoundRect(mp.x1, mp.y1, mp.x2-mp.x1, mp.y2-mp.y1, 50, 50);

	      } else { 
				setForeground(mp.col);
	    	  if (mp.getLine().isSelected())
		            g.drawLine(mp.x1, mp.y1, mp.x2, mp.y2);
		         else if (mp.getCircle().isSelected())
		            g.drawOval(mp.x1, mp.y1,  mp.x2-mp.x1, mp.y2-mp.y1);
		         else if (mp.getRect().isSelected())
		            g.drawRect(mp.x1, mp.y1, mp.x2-mp.x1, mp.y2-mp.y1);
		         else if (mp.getRoundRect().isSelected())
		            g.drawRoundRect(mp.x1, mp.y1, mp.x2-mp.x1, mp.y2-mp.y1, 50, 50);
	      } 
	
		repaint();
	}
	public void update(Graphics g) {
		paint(g);
	}
	
	
}
