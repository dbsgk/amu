package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrCanvas_t extends Canvas {
	private MsPaint_t msPaint;

	public DrCanvas_t(MsPaint_t msPaint) {
		this.msPaint = msPaint;
		this.setBackground(new Color(255,225,255));
	}
	
	@Override
	public void paint(Graphics g) {
		//ÁÂÇ¥
		int x1 = Integer.parseInt(msPaint.getX1T().getText().trim());
		int y1 = Integer.parseInt(msPaint.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint.getZ2T().getText().trim());
		//»ö
		switch(msPaint.getCombo().getSelectedIndex()) {//combo.getSelectedIndex():ÀÎµ¦½º±¸ÇÔ(1)	 or combo.getSelectedItem():±Û¾¾±¸ÇÔ("»¡°£»ö")
		case 0: g.setColor(new Color(255,0,0)); break;
		case 1: g.setColor(new Color(255,127,39)); break;
		case 2: g.setColor(new Color(255,242,0)); break;
		case 3: g.setColor(new Color(0,176,0)); break;
		case 4: g.setColor(new Color(0,128,255)); break;
		case 5: g.setColor(new Color(0,0,160)); break;
		case 6: g.setColor(new Color(128,0,255)); break;
		}
		//µµÇü
		int xMin = Math.min(x1, x2); 
		int yMin = Math.min(y1, y2); 
		
		
		
		if(msPaint.getFill().isSelected()) {//Ã¤¿öÁø µµÇü
			if(msPaint.getLine().isSelected())
				g.drawLine(x1, y1, x2, y2);
			else if(msPaint.getCircle().isSelected())
				g.fillOval(xMin, yMin, Math.abs(x2-x1),Math.abs(y2-y1));
			else if(msPaint.getRect().isSelected())
				g.fillRect(xMin, yMin, Math.abs(x2-x1),Math.abs(y2-y1));
			else if(msPaint.getRoundRect().isSelected())
				g.fillRoundRect(xMin, yMin, Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			else if(msPaint.getPen().isSelected())
				g.drawLine(x1, y1, x2, y2);
		}else {//ºó µµÇü
			if(msPaint.getLine().isSelected())
				g.drawLine(x1, y1, x2, y2);
			else if(msPaint.getCircle().isSelected())
				g.drawOval(xMin, yMin, Math.abs(x2-x1), Math.abs(y2-y1));
			else if(msPaint.getRect().isSelected())
				g.drawRect(xMin, yMin, Math.abs(x2-x1), Math.abs(y2-y1));
			else if(msPaint.getRoundRect().isSelected())
				g.drawRoundRect(xMin, yMin, Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			else if(msPaint.getPen().isSelected())
				g.drawLine(x1, y1, x2, y2);
		}
		
		
	}//paint

}
















