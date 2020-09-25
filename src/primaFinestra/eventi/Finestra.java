package primaFinestra.eventi;

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
		lb =new JLabel("");
		
		//posizionamento dei componenti
		
        // si aggiunge il bottone sopra
		c.add(jb,BorderLayout.NORTH);

		// si aggiunge la labet al centro
		c.add(lb,BorderLayout.CENTER);
		// si centra la Label
		lb.setHorizontalAlignment(SwingConstants.CENTER);

		
		/**
		 * si crea un oggetto di tipo ClickBottone
		 * Si passa al metodo addActionListener dell'oggetto Bottone
		 */
		
		jb.addActionListener(new ClickBottone());
	
		finestra.setVisible(true);		
		// chiusura applicazione
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	/**
	 * si crea la classe ClickBottone che implementa l'interfaccia ActionListener
	 * 
	 */
	static class ClickBottone implements ActionListener {

		@Override
		/**
		 * si ridefinisce il metodo actionPerformed
		 * a cui vien passato l'oggetto di tipo ActionEvent 
		 * generato dall'nterazione col bottone
		 */
		public void actionPerformed(ActionEvent e) {
			//System.out.println("ciao");
			lb.setText("ho premuto il bottone");

		}

	}
  }
	
