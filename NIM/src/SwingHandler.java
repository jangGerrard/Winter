import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingHandler implements ActionListener{
	
	JFrame frame = new JFrame("AA");
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JComboBox combo;
	
	public SwingHandler(){

		frame = new JFrame("Frame");
		button = new JButton("Button");
		frame.setLayout(new FlowLayout());
	    JLabel l = new JLabel("Label");
    	l.setToolTipText("HEllo");
    	getHeapCount();
		frame.add(button);
		frame.add(l);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
	
	public void getHeapCount(){
		List<String> lists = new ArrayList<String>();
		for(int i = 0 ; i < 5; i++){
			lists.add(( (char)('a' + i) )+"");
		}
		
		Object[] temp =  lists.toArray();
		combo = new JComboBox(temp);
		combo.addActionListener((actionEvent)->{
			//0번 부터니깐.
			Manager.numOfHeap = combo.getSelectedIndex() + 1;
			
			for(int i  = 1 ; i <= Manager.maps.size(); i++){ //max count of heap is 5;
				String name = (char)('1' + i-1)+"";
				Heap heap = new Heap( name , (2*i+1));
				Manager.maps.put(name, heap);
			}
			combo.setSelectedIndex(0);
			
			
			//frame.dispose();
		});
		
		frame.add(combo);
	}
	
	public void createComboBox(){
		
		List<String> lists = new ArrayList<String>();
		for(int i = 0 ; i < Manager.maps.size(); i++){
			lists.add(( (char)('a' + i) )+"");
		}
		
		Object[] temp =  lists.toArray();
		combo = new JComboBox(temp);
		combo.setSelectedIndex(0);
		combo.addActionListener(this);
		frame.add(combo);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("actionPerformed");
	}
	
	public static void main(String[] args){
		SwingHandler swingHandler =  new SwingHandler();
		//swingHandler.
		
	}

	public void beforeGetCount() {
		frame.dispose();
	}
	
	
	
}
