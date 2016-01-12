import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class MyFrame extends JFrame {
	public MyFrame() {
		
		JLabel lblNewLabel = new JLabel("West Label");
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Center Label");
		getContentPane().add(lblNewLabel_1, BorderLayout.CENTER);
	}

	private static final long serialVersionUID = -2122161377842820073L;
	
	
}
