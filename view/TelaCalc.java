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
	// Autor: - | Data: 2/11/2020 | Hora: 7 : 30

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtNumber1;
	public JTextField txtNumber1_;
	public JTextField txtResult1;
	public JTextField txtResult2;
	public JTextField txtNumber2_;
	public JTextField txtNumber2;
	public JTextField txtResult3;
	public JTextField txtNumber3_;
	public JTextField txtNumber3;
	public JTextField txtResult4;
	public JTextField txtNumber4_;
	public JTextField txtNumber4;

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
		lblNumber1.setBounds(70, 11, 138, 22);
		lblNumber1.setForeground(new Color(255, 255, 255));
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNumber1);

		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(196, 70, 27, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);

		JLabel lblEqual = new JLabel(" = ");
		lblEqual.setBounds(335, 70, 16, 14);
		contentPane.add(lblEqual);

		JLabel lblEqual_1 = new JLabel(" = ");
		lblEqual_1.setBounds(335, 118, 16, 14);
		contentPane.add(lblEqual_1);

		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setBounds(196, 118, 27, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);

		JLabel lblEqual_2 = new JLabel(" = ");
		lblEqual_2.setBounds(335, 168, 16, 14);
		contentPane.add(lblEqual_2);

		JLabel lblNewLabel_2 = new JLabel("x");
		lblNewLabel_2.setBounds(196, 168, 27, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2);

		JLabel lblEqual_3 = new JLabel(" = ");
		lblEqual_3.setBounds(335, 216, 16, 14);
		contentPane.add(lblEqual_3);

		JLabel lblNewLabel_3 = new JLabel("/");
		lblNewLabel_3.setBounds(196, 216, 27, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_3);

		// TextBoxs
		// Caixas editaveis

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(70, 63, 97, 27);
		txtNumber1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		txtNumber1.setDocument(new JustNumbers());

		txtNumber1_ = new JTextField();
		txtNumber1_.setBounds(228, 63, 97, 27);
		txtNumber1_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber1_.setColumns(10);
		contentPane.add(txtNumber1_);
		txtNumber1_.setDocument(new JustNumbers()); // Aceita apenas numbers

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(70, 111, 97, 27);
		txtNumber2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber2.setColumns(10);
		contentPane.add(txtNumber2);
		txtNumber2.setDocument(new JustNumbers());

		txtNumber2_ = new JTextField();
		txtNumber2_.setBounds(228, 111, 97, 27);
		txtNumber2_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber2_.setColumns(10);
		contentPane.add(txtNumber2_);
		txtNumber2_.setDocument(new JustNumbers());

		txtNumber3 = new JTextField();
		txtNumber3.setBounds(70, 161, 97, 27);
		txtNumber3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber3.setColumns(10);
		contentPane.add(txtNumber3);
		txtNumber3.setDocument(new JustNumbers());

		txtNumber3_ = new JTextField();
		txtNumber3_.setBounds(228, 161, 97, 27);
		txtNumber3_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber3_.setColumns(10);
		contentPane.add(txtNumber3_);
		txtNumber3_.setDocument(new JustNumbers());

		txtNumber4 = new JTextField();
		txtNumber4.setBounds(70, 209, 97, 27);
		txtNumber4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber4.setColumns(10);
		contentPane.add(txtNumber4);
		txtNumber4.setDocument(new JustNumbers());

		txtNumber4_ = new JTextField();
		txtNumber4_.setBounds(228, 209, 97, 27);
		txtNumber4_.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumber4_.setColumns(10);
		contentPane.add(txtNumber4_);
		txtNumber4_.setDocument(new JustNumbers());

		// Resultados

		txtResult1 = new JTextField();
		txtResult1.setBounds(361, 63, 97, 27);
		txtResult1.setBackground(Color.DARK_GRAY);
		txtResult1.setEnabled(false);
		txtResult1.setForeground(Color.WHITE);
		txtResult1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult1.setColumns(10);
		contentPane.add(txtResult1);

		txtResult2 = new JTextField();
		txtResult2.setBounds(361, 111, 97, 27);
		txtResult2.setBackground(Color.DARK_GRAY);
		txtResult2.setEnabled(false);
		txtResult2.setForeground(Color.RED);
		txtResult2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult2.setColumns(10);
		contentPane.add(txtResult2);

		txtResult3 = new JTextField();
		txtResult3.setBounds(361, 161, 97, 27);
		txtResult3.setBackground(Color.DARK_GRAY);
		txtResult3.setEnabled(false);
		txtResult3.setForeground(Color.RED);
		txtResult3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult3.setColumns(10);
		contentPane.add(txtResult3);

		txtResult4 = new JTextField();
		txtResult4.setBounds(361, 209, 97, 27);
		txtResult4.setBackground(Color.DARK_GRAY);
		txtResult4.setEnabled(false);
		txtResult4.setForeground(Color.RED);
		txtResult4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResult4.setColumns(10);
		contentPane.add(txtResult4);

		
		SecClass sc = new SecClass(); // Instanciando a classe
		
		JButton btnSum = new JButton("Calc");
		btnSum.setBounds(129, 294, 89, 28);
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSum.setForeground(new Color(255, 255, 255));
		btnSum.setBackground(new Color(105, 105, 105));
		btnSum.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				sc.soma();
				sc.min();
				sc.mul();
				sc.div();
				
				txtResult1.setText(String.valueOf(sc.soma())); //Imprime o numero da soma dentro da TxtBox
				txtResult2.setText(String.valueOf(sc.min()));
				txtResult3.setText(String.valueOf(sc.mul()));
				txtResult4.setText(String.valueOf(sc.div()));
			}
		});
		contentPane.add(btnSum);

		JButton btnClean = new JButton("Clean");
		btnClean.setBounds(284, 294, 89, 28);
		btnClean.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClean.setForeground(new Color(255, 245, 238));
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sc.LimparCache(); //Metodo que limpa os campos
			}
		});
		btnClean.setBackground(new Color(112, 128, 144));
		contentPane.add(btnClean);
	}
}