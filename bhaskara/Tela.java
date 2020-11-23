package bhaskara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import school.SecundaryClass;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtX;
	private JTextField txtY;

	//Autor: Joao Vitor Souza Pioner Data: 23/11/2020
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Code_Class codeClass = new Code_Class(this);
	
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 275);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//LABELS
		JLabel lblMain = new JLabel("Calculando Bhaskara");
		lblMain.setForeground(new Color(255, 255, 255));
		lblMain.setFont(new Font("Arial", Font.BOLD, 18));
		lblMain.setBounds(68, 11, 183, 19);
		contentPane.add(lblMain);
		
		JLabel lblA = new JLabel("A = ");
		lblA.setForeground(new Color(255, 255, 255));
		lblA.setFont(new Font("Arial", Font.BOLD, 16));
		lblA.setBounds(10, 80, 28, 14);
		contentPane.add(lblA);
		
		JLabel lnlInsiraValores = new JLabel("Insira os valores: ");
		lnlInsiraValores.setForeground(new Color(176, 196, 222));
		lnlInsiraValores.setFont(new Font("Arial", Font.BOLD, 16));
		lnlInsiraValores.setBounds(10, 45, 135, 19);
		contentPane.add(lnlInsiraValores);
		
		JLabel lblResultados = new JLabel("Resultados:");
		lblResultados.setForeground(new Color(176, 196, 222));
		lblResultados.setFont(new Font("Arial", Font.BOLD, 16));
		lblResultados.setBounds(180, 45, 102, 19);
		contentPane.add(lblResultados);
		
		JLabel lblA_1 = new JLabel("B = ");
		lblA_1.setForeground(Color.WHITE);
		lblA_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblA_1.setBounds(10, 110, 40, 14);
		contentPane.add(lblA_1);
		
		JLabel lblA_1_1 = new JLabel("C = ");
		lblA_1_1.setForeground(Color.WHITE);
		lblA_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblA_1_1.setBounds(10, 140, 40, 14);
		contentPane.add(lblA_1_1);
		
		JLabel lblX = new JLabel("X = ");
		lblX.setForeground(new Color(152, 251, 152));
		lblX.setFont(new Font("Arial", Font.BOLD, 16));
		lblX.setBounds(177, 80, 28, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y = ");
		lblY.setForeground(new Color(144, 238, 144));
		lblY.setFont(new Font("Arial", Font.BOLD, 16));
		lblY.setBounds(177, 110, 28, 14);
		contentPane.add(lblY);
		
		//TEXTBOXES
		txtA = new JTextField();
		txtA.setFont(new Font("Arial", Font.PLAIN, 14));
		txtA.setBounds(50, 76, 95, 27);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Arial", Font.PLAIN, 14));
		txtB.setColumns(10);
		txtB.setBounds(50, 106, 95, 27);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Arial", Font.PLAIN, 14));
		txtC.setColumns(10);
		txtC.setBounds(50, 136, 95, 27);
		contentPane.add(txtC);
		
		txtX = new JTextField();
		txtX.setEditable(false);
		txtX.setFont(new Font("Arial", Font.PLAIN, 14));
		txtX.setBackground(new Color(176, 196, 222));
		txtX.setColumns(10);
		txtX.setBounds(217, 76, 95, 27);
		contentPane.add(txtX);
		
		txtY = new JTextField();
		txtY.setEditable(false);
		txtY.setFont(new Font("Arial", Font.PLAIN, 14));
		txtY.setBackground(new Color(176, 196, 222));
		txtY.setColumns(10);
		txtY.setBounds(217, 106, 95, 27);
		contentPane.add(txtY);
		
		//BUTTON
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(176, 196, 222));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(101, 189, 116, 36);
		contentPane.add(btnNewButton);
		
		
	}
}
