package primaFinestra.chiusura;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Finestra {

	public static void main(String[] args) {
		
		JFrame finestra=new JFrame("prima finestra in java");
		finestra.setBounds(500, 500, 600, 300);		
		finestra.setTitle("Prima Finestra");
		
		
		finestra.setVisible(true);
		
		// chiusura applicazione
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}