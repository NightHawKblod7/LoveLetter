
import javax.swing.JFrame;
public class KeyListener extends JFrame{
	private static final int WIDTH = 1600;
	private static final int HEIGHT = 960;
	
	public KeyListener(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		add(new MouseListenerPanel());
		setVisible(true);
	}
}
