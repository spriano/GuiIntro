package primaFinestra.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Finestra {

	public static void main(String[] args) {
		
		JFrame finestra=new JFrame("prima finestra in java");
		finestra.setBounds(500, 500, 600, 300);		
		finestra.setTitle("Prima Finestra");
		
		Container c =finestra.getContentPane();
		
		
		JButton jb = new JButton("CLICCA");
		JLabel lb =new JLabel("ciao");
		
		// il LayOut di default del ContetPane è BorderLayOut
		
		// si posizione il bottone nella parte superiore a NORTH
		c.add(jb,BorderLayout.NORTH);
		// si posiziona l label al CENTRO
		c.add(lb,BorderLayout.CENTER);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
	
		finestra.pack();
		finestra.setVisible(true);
		// chiusura applicazione
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
