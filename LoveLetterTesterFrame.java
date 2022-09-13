import javax.swing.JFrame;
public class LoveLetterTesterFrame extends JFrame{
	private static final int WIDTH = 3000;
	private static final int HEIGHT = 2700;
	
	public LoveLetterTesterFrame(String title) {
		super(title);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new LoveLetterTesterPanel());
		setVisible(true);
	}
}
