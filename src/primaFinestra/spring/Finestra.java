package primaFinestra.spring;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCognome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra frame = new Finestra();
					//frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 282);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlNord = new JPanel();
		contentPane.add(pnlNord, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Inserimento Utente");
		pnlNord.add(lblNewLabel);
		
		JPanel pnlSud = new JPanel();
		contentPane.add(pnlSud, BorderLayout.SOUTH);
		

		JButton btnInserisci = new JButton("Inserisci");
		
		pnlSud.add(btnInserisci);
		
		JPanel pnlCentro = new JPanel();
		contentPane.add(pnlCentro, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCentro = new GridBagLayout();
		//gbl_pnlCentro.columnWeights = new double[]{0.0, 0.0, 0.0};

		pnlCentro.setLayout(gbl_pnlCentro);
		
		JLabel lblNome = new JLabel("nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		pnlCentro.add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		//gbc_txtNome.insets = new Insets(0, 0, 5, 0);
		gbc_txtNome.gridx = 2;
		gbc_txtNome.gridy = 0;
		pnlCentro.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCognome = new JLabel("Cognome");
		GridBagConstraints gbc_lblCognome = new GridBagConstraints();
		gbc_lblCognome.gridwidth = 2;
		gbc_lblCognome.insets = new Insets(0, 0, 0, 5);

		gbc_lblCognome.gridx = 0;
		gbc_lblCognome.gridy = 1;
		pnlCentro.add(lblCognome, gbc_lblCognome);
		
		txtCognome = new JTextField();
		GridBagConstraints gbc_txtCognome = new GridBagConstraints();
		
		gbc_txtCognome.gridx = 2;
		gbc_txtCognome.gridy = 1;
		pnlCentro.add(txtCognome, gbc_txtCognome);
		txtCognome.setColumns(10);
		
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("benvenuto " + txtNome.getText()+" "+txtCognome.getText());
				
			}
		});
		
		
	}
}
