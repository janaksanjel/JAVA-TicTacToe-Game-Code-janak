package Games;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Winner implements ActionListener
{
	
	JFrame frame =new JFrame();
	JButton buttonStartGame = new JButton("NEXT");
	JPanel title_panel =new JPanel();
	JLabel textfield =new JLabel();
	Winner()
	{
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,800);
	frame.getContentPane().setBackground(null);
	frame.setLayout(new BorderLayout());
	frame.setVisible(true);
	
	
	frame.add(title_panel);
	frame.add(textfield);
	textfield.add(buttonStartGame);
	
	buttonStartGame.setBounds(350,450,100,70);
	buttonStartGame.addActionListener(this);
	buttonStartGame.setFocusable(false);
	buttonStartGame.setBackground(Color.GREEN);
	
	
	title_panel.setLayout(new BorderLayout());
	title_panel.setBounds(0,0,8000,100);
	title_panel.setBackground(Color.BLUE);
	
	
	
	textfield.setBackground(Color.CYAN);
	textfield.setForeground(Color.black);
	textfield.setFont(new Font("Ink Free",Font.BOLD,40));
	textfield.setHorizontalAlignment(JLabel.CENTER);
	textfield.setText(" Our program doesnot show winner sorry! ");
	textfield.setOpaque(true);
	
	}
	
	public static void main(String[] args) 
	{
		Winner winner = new Winner();
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Restartgame tictactoe = new Restartgame();
		frame.dispose();
		}
		
		
	}

	
	



