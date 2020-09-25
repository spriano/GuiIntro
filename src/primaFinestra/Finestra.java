package primaFinestra;

import javax.swing.JFrame;

public class Finestra {

	public static void main(String[] args) {
		// creazione della finestra
		JFrame finestra=new JFrame("prima finestra in java");
		// dimensione della finestra
		finestra.setBounds(500, 500, 600, 300);
		// titolo della finestra
		finestra.setTitle("Prima Finestra");
		// rendere la finestra visibile
		finestra.setVisible(true);
	}
}
