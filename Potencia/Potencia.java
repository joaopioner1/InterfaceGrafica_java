package Potencia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Potencia extends JFrame {

	private JPanel contentPane;
	private JTextField txtExpoente;
	private JTextField txtBase;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Potencia frame = new Potencia();
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
	public Potencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("Insira a base:");
		lblX.setForeground(new Color(105, 105, 105));
		lblX.setFont(new Font("Arial", Font.BOLD, 16));
		lblX.setBounds(3, 55, 112, 25);
		contentPane.add(lblX);
		
		txtExpoente = new JTextField();
		txtExpoente.setBounds(144, 93, 86, 24);
		contentPane.add(txtExpoente);
		txtExpoente.setColumns(10);
		
		txtBase = new JTextField();
		txtBase.setColumns(10);
		txtBase.setBounds(109, 57, 121, 24);
		contentPane.add(txtBase);
		
		JLabel lblY = new JLabel("Insira o expoente:");
		lblY.setForeground(SystemColor.controlDkShadow);
		lblY.setFont(new Font("Arial", Font.BOLD, 16));
		lblY.setBounds(3, 91, 155, 25);
		contentPane.add(lblY);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(txtBase.getText());
				double b = Double.parseDouble(txtExpoente.getText());
				
				double potencia = Math.pow(a, b);
				
				txtResultado.setText("" + potencia);
			}
		});
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.setBackground(new Color(105, 105, 105));
		btnCalcular.setBounds(80, 211, 89, 39);
		contentPane.add(btnCalcular);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(3, 151, 184, 32);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblPotncia = new JLabel("Pot\u00EAncia");
		lblPotncia.setForeground(new Color(175, 238, 238));
		lblPotncia.setFont(new Font("Arial", Font.BOLD, 22));
		lblPotncia.setBounds(80, 11, 89, 25);
		contentPane.add(lblPotncia);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setForeground(new Color(175, 238, 238));
		lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
		lblResultado.setBounds(3, 127, 97, 25);
		contentPane.add(lblResultado);
	}
}
