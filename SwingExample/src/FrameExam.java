import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameExam {
	
	private JFrame frame = new JFrame("AA");
	private JButton button = new JButton();
	private JPanel panel = new JPanel();
	
	private final int width = 600;
	private final int height = 600;
	
	
	public void createFrame(){
		frame.add(button);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createPanel(){
		JLabel label = new JLabel("LABLE");
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args){
		FrameExam frameExam = new FrameExam();
		frameExam.createPanel();
		frameExam.createFrame();
	}
}
