import javax.swing.JFrame;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class MouseListenerPanel extends JPanel implements MouseListener {
	private BufferedImage one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen,
	sixteen, seventeen, eighteen, nineteen, twenty, twentyOne, twentyTwo, choice;
	private ArrayList<BufferedImage> list;
	public MouseListenerPanel() {
		try {
			one  = ImageIO.read(new File("spy.jpg"));
			two  = ImageIO.read(new File("guard.jpg"));
			three  = ImageIO.read(new File("baron.jpg"));
			four  = ImageIO.read(new File("priest.jpg"));
			five  = ImageIO.read(new File("handmaid.jpg"));
			six  = ImageIO.read(new File("prince.jpg"));
			seven  = ImageIO.read(new File("chancellor.jpg"));
			eight  = ImageIO.read(new File("king.jpg"));
			nine  = ImageIO.read(new File("countess.jpg"));
			ten  = ImageIO.read(new File("princess.jpg"));
			eleven  = ImageIO.read(new File("back.jpg"));
		}
		catch(Exception e) {
			System.out.println("e");
			return;
		}
		list = new ArrayList<BufferedImage>();
		list.add(one); list.add(one);
		list.add(two); list.add(two); list.add(two); list.add(two); list.add(two); list.add(two);
		list.add(three); list.add(three);
		list.add(four); list.add(four);
		list.add(five); list.add(five);
		list.add(six); list.add(six);
		list.add(seven); 
		list.add(eight);
		list.add(nine);
		list.add(ten);
		Collections.shuffle(list);
		choice = list.get(0);
		addMouseListener(this);
	}
	
	public void addNotify() {
		super.addNotify();
		requestFocus();
	}
	
	public void paint(Graphics g) {
		g.drawImage(eleven, 0, 0, getWidth()/5, getHeight()/2, null);
		g.drawImage(choice,  400,  0,  getWidth()/5,  getHeight()/2, null); 
	}
	
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(e.getButton()== e.BUTTON1) {
			if(x >= 0 && y >= 0 &&
					x <= getWidth()/5 && y <= getHeight()/2)
				choice = list.get(0);
		}
		repaint();
		list.remove(0);
	}
	
}
	