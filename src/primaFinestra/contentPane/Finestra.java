package primaFinestra.contentPane;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;



public class Finestra {
	private static JTextField textField;

	public static void main(String[] args) {
		
		JFrame finestra=new JFrame("prima finestra in java");
		finestra.setBounds(500, 500, 600, 300);		
		finestra.setTitle("Prima Finestra");
		
		// per disegnare un componente nella finestra
		// occorre accedere al ContentPane della finestra
		
		Container c =finestra.getContentPane();
		
		JLabel jl = new JLabel("Etichetta");
		
		c.add(jl);
		
        // se si aggiunge una nuova etichetta, si sovrappone alla precedente
		JLabel jl1 = new JLabel("Etichetta1");
		
		c.add(jl1);
		
		finestra.setVisible(true);		
		// chiusura applicazione
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
