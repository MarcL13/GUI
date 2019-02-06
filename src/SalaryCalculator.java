import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300,200,350,300);
		myFrame.setVisible(true);
		myFrame.setLayout(null);
		
		JLabel hourlyRate = new JLabel("Hourly Rate: ");
		hourlyRate.setBounds(25,5,1000,20);
		myFrame.add(hourlyRate);
		
		JTextField ans1 = new JTextField();
		ans1.setBounds(25,5,100,100);
		myFrame.add(ans1);
		
		
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
