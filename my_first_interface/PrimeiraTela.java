package my_first_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiraTela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
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
	public PrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Insira o seu nome: ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(96, 64, 122, 25);
		contentPane.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(96, 100, 158, 25);
		contentPane.add(txtName);
		txtName.setColumns(10);

		JButton btnAcao = new JButton("A\u00E7\u00E3o");
		btnAcao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAcao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Nome: " + txtName.getText());
			}
		});
		btnAcao.setBounds(114, 160, 104, 23);
		contentPane.add(btnAcao);
	}
}
