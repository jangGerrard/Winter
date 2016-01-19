import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameExtnd extends JFrame {

	private static final long serialVersionUID = -6444238120080394145L;

	public FrameExtnd() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

		JPanel panel = new JPanel();
		JLabel label = new JLabel("LABEL");
		JLabel label1 = new JLabel("LABEL1");

		JLabel label2 = new JLabel("LABEL2");
		JLabel label3 = new JLabel("LABEL3");
		JLabel label4 = new JLabel("LABEL4");
		JLabel label5 = new JLabel("LABEL5");
		JLabel label6 = new JLabel("LABEL6");
		JButton button = new JButton("Button");

		button.addActionListener(e -> {
			label.setText("button is clicked");
		});

		panel.add(label);
		panel.add(label1);
		// label1.setLocation(200,200);
		System.out.println("label1 : " + label1.getLocation());
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);

		panel.add(button);
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		FrameExtnd f = new FrameExtnd();
	}
}
