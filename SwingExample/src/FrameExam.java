import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameExam {
	JFrame frame = new JFrame("AA");
	JButton button = new JButton();
	
	public void createFrame(){
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		FrameExam frameExam = new FrameExam();
		frameExam.createFrame();
	}
}
