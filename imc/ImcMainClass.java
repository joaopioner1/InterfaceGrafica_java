package imc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;

public class ImcMainClass extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel lblAltura;
	private JTextField txtResultado;

	//Autor: Joao Vitor Souza Pioner | Data: 7/11/2020 16:36
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImcMainClass frame = new ImcMainClass();
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
	public ImcMainClass() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMainIMC = new JLabel("Calculando IMC");
		lblMainIMC.setForeground(new Color(240, 248, 255));
		lblMainIMC.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblMainIMC.setBounds(49, 11, 167, 36);
		contentPane.add(lblMainIMC);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPeso.setForeground(new Color(255, 255, 255));
		lblPeso.setBounds(10, 77, 54, 19);
		contentPane.add(lblPeso);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(Color.WHITE);
		lblAltura.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAltura.setBounds(10, 121, 71, 19);
		contentPane.add(lblAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(60, 69, 111, 27);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(76, 113, 95, 27);
		contentPane.add(txtAltura);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setBackground(new Color(255, 255, 255));
		lblResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblResultado.setBounds(10, 182, 111, 19);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(115, 174, 101, 27);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(102, 205, 170));
		btnCalcular.setBounds(191, 66, 89, 74);
		contentPane.add(btnCalcular);
		
		JEditorPane PaneResultado = new JEditorPane();
		PaneResultado.setBounds(10, 217, 206, 54);
		contentPane.add(PaneResultado);
	}
}
