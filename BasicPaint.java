import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {
	    public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(2000, 500);
		f.setVisible(true);
	}
}
  
class MyPanel extends JPanel {
	Font f1;
	    public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		f1 = new Font("Dialog", Font.BOLD, 20);

	}
  
	    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	g.drawLine(10,10 , 150, 150);
	int xPoints[]={10,150,10,150};
	int yPoints[]={250,390,390,250};
	g.drawPolyline(xPoints, yPoints, xPoints.length);
	g.drawRect(200,10,200,140);
	g.fillRect(200,250,200,140);
	Color fg3D = Color.lightGray;
	g.setColor(fg3D);
	g.draw3DRect(450,10,200,140,true);
	g.fill3DRect(450, 250, 200, 140, true);
	Color fg = Color.black;
	g.setColor(fg);
	g.drawRoundRect(700,10,200,140,100,70);
	g.fillRoundRect(700, 250, 200, 140, 100,70);
	g.drawOval(950	, 10, 200, 140);
	g.fillOval(950, 250, 200, 140);
	g.drawArc(1200	, 10, 200, 140, 110, 90);
	g.fillArc(1200, 250, 200, 140, 110, 90);
	int xpoint1[]={1450,1650,1450,1650};
	int ypoint1[]={10,150,150,10};
	int ypoint2[]={250,390,390,250};
	g.drawPolygon(xpoint1,ypoint1,xpoint1.length);
	g.fillPolygon(xpoint1, ypoint2, xpoint1.length);
	g.setFont(f1);
	g.drawString("drawLine()", 10, 180);
	g.drawString("drawPolyLine()", 10, 420);
	g.drawString("drawRect()", 200 , 180);
	g.drawString("fillRect()", 200, 420);
	g.drawString("draw3DRect()", 450, 180);
	g.drawString("fill3DRect()", 450, 420);
	g.drawString("drawOval()", 950, 180);
	g.drawString("fillOval()", 950, 420);
	g.drawString("drawArc()", 1200, 180);
	g.drawString("fillArc()", 1200, 420);
	g.drawString("drawPolygon()", 1450, 180);
	g.drawString("fillPolygon()", 1450, 420);
	g.drawString("drawRoundRect()", 700, 180);
	g.drawString("fillRoundRect()", 700, 420);

	}
}
