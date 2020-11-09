package imc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImcMainClass extends JFrame {

	private SecunClass  Clas = new SecunClass(this);
	
	private static final long serialVersionUID = 1L;
	
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

	public JPanel contentPane;
	public JTextField txtAltura;
	public JLabel lblAltura;
	public JTextField txtResultado;
	public JTextField txtPeso;
	public JTextField txtSexo;
	public JTextField txtAuxilio;
	
	public ImcMainClass() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 347);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//labels
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setBackground(new Color(255, 255, 255));
		lblResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblResultado.setBounds(10, 212, 111, 19);
		contentPane.add(lblResultado);
		
		JLabel lblMainIMC = new JLabel("Calculando IMC");
		lblMainIMC.setForeground(new Color(240, 248, 255));
		lblMainIMC.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblMainIMC.setBounds(76, 11, 167, 36);
		contentPane.add(lblMainIMC);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPeso.setForeground(new Color(255, 255, 255));
		lblPeso.setBounds(10, 128, 54, 19);
		contentPane.add(lblPeso);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(Color.WHITE);
		lblAltura.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAltura.setBounds(10, 164, 71, 19);
		contentPane.add(lblAltura);
		
		JLabel lblSexo = new JLabel("Sexo (F/M):");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblSexo.setBounds(10, 88, 125, 19);
		contentPane.add(lblSexo);
		
		//txtboxs
		txtAltura = new JTextField();
		txtAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Clas.VerificandoIMC();
			}
		});
		txtAltura.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtAltura.setColumns(10);
		txtAltura.setBounds(76, 156, 150, 27);
		contentPane.add(txtAltura);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtResultado.setEditable(false);
		txtResultado.setBackground(new Color(175, 238, 238));
		txtResultado.setBounds(115, 210, 111, 27);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtPeso.setColumns(10);
		txtPeso.setBounds(64, 118, 162, 27);
		contentPane.add(txtPeso);
		
		txtSexo = new JTextField();
		txtSexo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtSexo.setColumns(10);
		txtSexo.setBounds(127, 80, 99, 27);
		contentPane.add(txtSexo);
		
		txtAuxilio = new JTextField();
		txtAuxilio.setEditable(false);
		txtAuxilio.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtAuxilio.setBackground(new Color(175, 238, 238));
		txtAuxilio.setBounds(10, 242, 216, 54);
		contentPane.add(txtAuxilio);
		txtAuxilio.setColumns(10);
		
		//botton
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Clas.VerificandoIMC();
			}
		});
		btnCalcular.setForeground(new Color(119, 136, 153));
		btnCalcular.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(102, 205, 170));
		btnCalcular.setBounds(239, 80, 91, 103);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Clas.LimpandoCache();
			}
		});
		btnLimpar.setForeground(new Color(119, 136, 153));
		btnLimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnLimpar.setBackground(new Color(102, 205, 170));
		btnLimpar.setBounds(239, 204, 91, 92);
		contentPane.add(btnLimpar);
		
	}
}
