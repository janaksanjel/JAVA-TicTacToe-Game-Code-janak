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



public class Restartgame implements ActionListener
{
	
	JFrame frame =new JFrame();
	JButton ReStartGame = new JButton("RESTART");
	JPanel title_panel =new JPanel();
	JLabel textfield =new JLabel();
	
	Restartgame()
	{
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,800);
	frame.getContentPane().setBackground(null);
	frame.setLayout(new BorderLayout());
	frame.setVisible(true);
	
	frame.add(ReStartGame);
	frame.add(title_panel);
	frame.add(textfield);
	
	ReStartGame.setBounds(350,450,100,70);
	ReStartGame.addActionListener(this);
	ReStartGame.setFocusable(false);
	ReStartGame.setBackground(Color.GREEN);
	
	
	title_panel.setLayout(new BorderLayout());
	title_panel.setBounds(0,0,8000,100);
	title_panel.setBackground(Color.RED);
	
	
	
	textfield.setBackground(Color.CYAN);
	textfield.setForeground(Color.black);
	textfield.setFont(new Font("Ink Free",Font.BOLD,65));
	textfield.setHorizontalAlignment(JLabel.CENTER);
	textfield.setText("Do you wana play again Tic tac toe");
	textfield.setOpaque(true);
	
	}
	
	public static void main(String[] args) 
	{
		Restartgame restartgame= new Restartgame();
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ReStartGame) 
		{
		    frame.dispose();
		    //Homepage homepage = new Homepage();
			MainGame tictactoe = new MainGame();
			
		}
		
		
	}

	
	}


