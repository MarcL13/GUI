import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIInput {

	public static void main(String[] args)
	{
		JFrame box = new JFrame();
		box.setBounds(400,300,450,250);
		box.setVisible(true);
		
		
		JTextField askNum = new JTextField();
		askNum.setBounds(100,80,200,50);
		box.add(askNum);
		
	
		
		
		
		box.setLayout(null);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
