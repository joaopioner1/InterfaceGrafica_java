package supermarket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buying_Pizza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buying_Pizza frame = new Buying_Pizza();
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
	public Buying_Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 318);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 99, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TxtBoxs
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(112, 59, 254, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("       /");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(159, 133, 68, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setBounds(190, 94, 37, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(52, 177, 175, 24);
		contentPane.add(textField_3);
		
		//Labels
		JLabel lblFinalizandoCompra = new JLabel("Finalizando a compra");
		lblFinalizandoCompra.setForeground(new Color(255, 255, 255));
		lblFinalizandoCompra.setFont(new Font("Arial", Font.BOLD, 24));
		lblFinalizandoCompra.setBounds(44, 11, 262, 24);
		contentPane.add(lblFinalizandoCompra);
		
		JLabel lblNewLabel = new JLabel("N\u00BA do cart\u00E3o:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 57, 100, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data (vencimento):");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 135, 152, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo de seguran\u00E7a:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(10, 94, 170, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CPF:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(10, 179, 45, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Buying_Pizza.class.getResource("/supermarket/cartao-de-credito (1).png")));
		lblNewLabel_2.setBounds(237, 81, 129, 120);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Buying_Pizza.class.getResource("/supermarket/cadeado (3).png")));
		lblNewLabel_3.setBounds(10, 11, 24, 24);
		contentPane.add(lblNewLabel_3);
		
		//Button
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showConfirmDialog(null, "Compra finalizada com sucesso! Obrigado pela preferência, volte sempre.");
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(119, 136, 153));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton.setBounds(72, 230, 234, 38);
		contentPane.add(btnNewButton);
	}
}
