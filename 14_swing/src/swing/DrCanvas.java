package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

public class DrCanvas extends Canvas {
	private MsPaint mp;
	private int count;
	private Vector<ShapeDTO> shape;

	public DrCanvas(MsPaint mp) {
		this.mp = mp;
		setBackground(new Color(220, 180, 255));

	}

	@Override
	public void paint(Graphics g) {
		//for(int i=1;i<vX1.size();i++){
		if (mp.getFill().isSelected()) {// 채우기
			setForeground(mp.col);
			if (mp.drawType.getText() == "선")
				g.drawLine(mp.x1, mp.y1, mp.x2, mp.y2);
			else if (mp.drawType.getText() == "원")
				g.fillOval(mp.x1, mp.y1, mp.x2 - mp.x1, mp.y2 - mp.y1);
			else if (mp.drawType.getText() == "사각형")
				g.fillRect(mp.x1, mp.y1, mp.x2 - mp.x1, mp.y2 - mp.y1);
			else if (mp.drawType.getText() == "둥근사각형")
				g.fillRoundRect(mp.x1, mp.y1, mp.x2 - mp.x1, mp.y2 - mp.y1, mp.z1, mp.z2);

		} else {
			setForeground(mp.col);
			if (mp.drawType.getText() == "선")
				g.drawLine(mp.x1, mp.y1, mp.x2, mp.y2);
			else if (mp.drawType.getText() == "원")
				g.drawOval(mp.x1, mp.y1, mp.x2 - mp.x1, mp.y2 - mp.y1);
			else if (mp.drawType.getText() == "사각형")
				g.drawRect(mp.x1, mp.y1, mp.x2 - mp.x1, mp.y2 - mp.y1);
			else if (mp.drawType.getText() == "둥근사각형")
				g.drawRoundRect(mp.x1, mp.y1, mp.x2 - mp.x1, mp.y2 - mp.y1, mp.z1, mp.z2);
		}
//}
		repaint();
	}

	public void update(Graphics g) {
		paint(g);
	}

}