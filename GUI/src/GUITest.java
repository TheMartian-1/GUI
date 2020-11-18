import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {

	private static final int HEIGHT = 400;
	private static final int WIDTH = 400;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Dark Wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at code monkeys");

	}

}
