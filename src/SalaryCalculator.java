import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(800,300,400,250);
		myFrame.setLayout(null);
		
		JLabel hourlyRate = new JLabel("Hourly Rate: ");
		hourlyRate.setBounds(25,25,125,25);
		myFrame.add(hourlyRate);
		
		
		JLabel hoursWeek = new JLabel("Hours/Week: ");
		hoursWeek.setBounds(25,50,125,25);
		myFrame.add(hoursWeek);
		
		
		JTextField ans1 = new JTextField();
		ans1.setBounds(100,25,125,25);
		myFrame.add(ans1);
		
		JTextField ans2 = new JTextField();
		ans2.setBounds(100,50,125,25);
		myFrame.add(ans2);
		
		JCheckBox fullTime = new JCheckBox("Full Time");
		fullTime.setBounds(25,75,125,25);
		myFrame.add(fullTime);
		
		JLabel calculation = new JLabel("Annual Salary: $");
		calculation.setBounds(160,100,125,25);
		myFrame.add(calculation);
		
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(25,100,125,25);
		myFrame.add(calculate);
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String hrRate = ans1.getText();
						String hrWeek = ans2.getText();
						boolean isClicked = fullTime.isSelected();
						if(isClicked)
						{
							double calc = 40*52*(Double.parseDouble(hrRate));
							String ans = "" + calc;
							JLabel answer = new JLabel(ans);
							answer.setBounds(250,100,125,25);
							myFrame.add(answer);
						}
						else if(!isClicked)
						{
							double calc = 52*(Double.parseDouble(hrRate))*(Double.parseDouble(hrWeek));
							String ans = "" + calc;
							JLabel answer = new JLabel(ans);
							answer.setBounds(250,100,125,25);
							myFrame.add(answer);
						}
						myFrame.repaint();
					}
				});
		
		
		
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}