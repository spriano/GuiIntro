package primaFinestra.eventi.anonima;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Finestra {
	
	private static JLabel lb;

	public static void main(String[] args) {
		
		JFrame finestra=new JFrame("prima finestra in java");
		finestra.setBounds(500, 500, 600, 300);		
		finestra.setTitle("Prima Finestra");
		
		Container c =finestra.getContentPane();
		
		JButton jb = new JButton("CLICCA");

		c.add(jb,BorderLayout.NORTH);
		
		lb =new JLabel("ciao");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		
		c.add(lb,BorderLayout.CENTER);
		
		/**
		 * crea un oggetto una classe anonima che implementa l'interfaccia ActionListener
		 * che ridefinisce il metodo ActionPerformed dell'interfaccia.
		 * al metodo ActionPerformed viene passato un oggetto di tipo Evento
		 * l'oggetto cerato della classe Anonima vine passato al metodo addActionListener
		 * dell'oggetto jb
		 */
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				lb.setText("ho premuto il bottone");
			}	
		});
	
		finestra.setVisible(true);		
		// chiusura applicazione
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
  }
