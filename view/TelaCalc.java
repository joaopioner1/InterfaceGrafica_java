package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaCalc extends JFrame {
	//Autor: Joao Vitor Souza Pioner | Data: 29/10/2020
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber1_;
	private JTextField txtResult1;
	private JTextField txtResult2;
	private JTextField txtNumber2_;
	private JTextField txtNumber2;
	private JTextField txtResult3;
	private JTextField txtNumber3_;
	private JTextField txtNumber3;
	private JTextField txtResult4;
	private JTextField txtNumber4_;
	private JTextField txtNumber4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalc frame = new TelaCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 374);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(112, 128, 144));
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// LABELS
		JLabel lblNumber1 = new JLabel("Enter numbers:");
		lblNumber1.setForeground(new Color(255, 255, 255));
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber1.setBounds(70, 11, 138, 22);
		contentPane.add(lblNumber1);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(196, 70, 27, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEqual = new JLabel(" = ");
		lblEqual.setBounds(335, 70, 16, 14);
		contentPane.add(lblEqual);
		
		JLabel lblEqual_1 = new JLabel(" = ");
		lblEqual_1.setBounds(335, 118, 16, 14);
		contentPane.add(lblEqual_1);
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(196, 118, 27, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEqual_2 = new JLabel(" = ");
		lblEqual_2.setBounds(335, 168, 16, 14);
		contentPane.add(lblEqual_2);
		
		JLabel lblNewLabel_2 = new JLabel("x");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(196, 168, 27, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEqual_3 = new JLabel(" = ");
		lblEqual_3.setBounds(335, 216, 16, 14);
		contentPane.add(lblEqual_3);
		
		JLabel lblNewLabel_3 = new JLabel("/");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(196, 216, 27, 14);
		contentPane.add(lblNewLabel_3);
		
		// TextBoxs
		// Caixas editaveis
		
		txtNumber1 = new JTextField();
		txtNumber1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber1.setBounds(70, 63, 97, 27);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		txtNumber1.setDocument(new JustNumbers());
		
		txtNumber1_ = new JTextField();
		txtNumber1_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber1_.setColumns(10);
		txtNumber1_.setBounds(228, 63, 97, 27);
		contentPane.add(txtNumber1_);
		txtNumber1_.setDocument(new JustNumbers()); //Aceita apenas numbers
		
		txtNumber2 = new JTextField();
		txtNumber2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(70, 111, 97, 27);
		contentPane.add(txtNumber2);
		txtNumber2.setDocument(new JustNumbers());
		
		txtNumber2_ = new JTextField();
		txtNumber2_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber2_.setColumns(10);
		txtNumber2_.setBounds(228, 111, 97, 27);
		contentPane.add(txtNumber2_);
		txtNumber2_.setDocument(new JustNumbers());
		
		txtNumber3 = new JTextField();
		txtNumber3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber3.setColumns(10);
		txtNumber3.setBounds(70, 161, 97, 27);
		contentPane.add(txtNumber3);
		txtNumber3.setDocument(new JustNumbers());
		
		txtNumber3_ = new JTextField();
		txtNumber3_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber3_.setColumns(10);
		txtNumber3_.setBounds(228, 161, 97, 27);
		contentPane.add(txtNumber3_);
		txtNumber3_.setDocument(new JustNumbers());
		
		txtNumber4 = new JTextField();
		txtNumber4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber4.setColumns(10);
		txtNumber4.setBounds(70, 209, 97, 27);
		contentPane.add(txtNumber4);
		txtNumber4.setDocument(new JustNumbers());
		
		txtNumber4_ = new JTextField();
		txtNumber4_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber4_.setColumns(10);
		txtNumber4_.setBounds(228, 209, 97, 27);
		contentPane.add(txtNumber4_);
		txtNumber4_.setDocument(new JustNumbers());
		
		// Resultados
		
		txtResult1 = new JTextField();
		txtResult1.setBackground(Color.DARK_GRAY);
		txtResult1.setEnabled(false);
		txtResult1.setForeground(Color.WHITE);
		txtResult1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult1.setColumns(10);
		txtResult1.setBounds(361, 63, 97, 27);
		contentPane.add(txtResult1);
		
		txtResult2 = new JTextField();
		txtResult2.setBackground(Color.DARK_GRAY);
		txtResult2.setEnabled(false);
		txtResult2.setForeground(Color.RED);
		txtResult2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult2.setColumns(10);
		txtResult2.setBounds(361, 111, 97, 27);
		contentPane.add(txtResult2);
		
		txtResult3 = new JTextField();
		txtResult3.setBackground(Color.DARK_GRAY);
		txtResult3.setEnabled(false);
		txtResult3.setForeground(Color.RED);
		txtResult3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult3.setColumns(10);
		txtResult3.setBounds(361, 161, 97, 27);
		contentPane.add(txtResult3);
		
		txtResult4 = new JTextField();
		txtResult4.setBackground(Color.DARK_GRAY);
		txtResult4.setEnabled(false);
		txtResult4.setForeground(Color.RED);
		txtResult4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult4.setColumns(10);
		txtResult4.setBounds(361, 209, 97, 27);
		contentPane.add(txtResult4);
		
		JButton btnSum = new JButton("Calc");
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSum.setForeground(new Color(255, 255, 255));
		btnSum.setBackground(new Color(105, 105, 105));
		btnSum.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String a = txtNumber1.getText(); 
				String b = txtNumber1_.getText();
				String f = txtNumber2.getText(); 
				String g = txtNumber2_.getText();
				String j = txtNumber3.getText(); 
				String k = txtNumber3_.getText();
				String n = txtNumber4.getText(); 
				String o = txtNumber4_.getText();
				
				double c = Integer.parseInt(a);
				double d = Integer.parseInt(b);
				double h = Integer.parseInt(f);
				double i = Integer.parseInt(g);
				double l = Integer.parseInt(j);
				double m = Integer.parseInt(k);
				double p = Integer.parseInt(n);
				double q = Integer.parseInt(o);
				
				double soma  = c + d;
				double min = h - i;
				double mul = l * m;
				double div = p / q;
				
				txtResult1.setText(String.valueOf(soma)); //Imprime o numero da soma dentro da TxtBox
				txtResult2.setText(String.valueOf(min));
				txtResult3.setText(String.valueOf(mul));
				txtResult4.setText(String.valueOf(div));
				
			}
		});
		
		btnSum.setBounds(129, 294, 89, 28);
		contentPane.add(btnSum);
		
		JButton btnClean = new JButton("Clean");
		btnClean.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClean.setForeground(new Color(255, 245, 238));
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult1.setText(String.valueOf(""));
				txtResult2.setText(String.valueOf(""));
				txtResult3.setText(String.valueOf(""));
				txtResult4.setText(String.valueOf(""));
				txtNumber1.setText(String.valueOf(""));
				txtNumber1_.setText(String.valueOf(""));
				txtNumber2.setText(String.valueOf(""));
				txtNumber2_.setText(String.valueOf(""));
				txtNumber3.setText(String.valueOf(""));
				txtNumber3_.setText(String.valueOf(""));
				txtNumber4.setText(String.valueOf(""));
				txtNumber4_.setText(String.valueOf(""));

			}
		});
		btnClean.setBackground(new Color(112, 128, 144));
		btnClean.setBounds(284, 294, 89, 28);
		contentPane.add(btnClean);
		
	}	
}