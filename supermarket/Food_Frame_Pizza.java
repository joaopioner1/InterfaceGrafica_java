package supermarket;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.SecClass;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;

public class Food_Frame_Pizza extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_Frame_Pizza frame = new Food_Frame_Pizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Class_Code_Pizza CCPizza = new Class_Code_Pizza(this);
	
	private JPanel contentPane;
	public JTextField txtPrecoPizza;
	public JTextField txtQuantidadePizza;
	public JTextField txtValorTotal;

	public Food_Frame_Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels
		JLabel lblEspecificacoes = new JLabel("Especifica\u00E7\u00F5es");
		lblEspecificacoes.setForeground(new Color(255, 255, 255));
		lblEspecificacoes.setFont(new Font("Arial", Font.BOLD, 24));
		lblEspecificacoes.setBounds(10, 11, 186, 28);
		contentPane.add(lblEspecificacoes);

		JLabel lblPreco = new JLabel("Pre\u00E7o:");
		lblPreco.setForeground(new Color(255, 255, 255));
		lblPreco.setFont(new Font("Arial", Font.BOLD, 18));
		lblPreco.setBounds(10, 63, 64, 28);
		contentPane.add(lblPreco);

		JLabel lblInsira = new JLabel("Insira quantas fatias deseja comprar:");
		lblInsira.setForeground(Color.WHITE);
		lblInsira.setFont(new Font("Arial", Font.BOLD, 18));
		lblInsira.setBounds(10, 123, 322, 28);
		contentPane.add(lblInsira);

		JLabel lblImagemPizza = new JLabel("New label");
		lblImagemPizza.setIcon(
				new ImageIcon(Food_Frame_Pizza.class.getResource("/supermarket/Pizza_icon-icons.com_68706.png")));
		lblImagemPizza.setBounds(245, 31, 46, 48);
		contentPane.add(lblImagemPizza);

		JLabel lblSabores = new JLabel("Sabores:");
		lblSabores.setForeground(Color.WHITE);
		lblSabores.setFont(new Font("Arial", Font.BOLD, 18));
		lblSabores.setBounds(10, 240, 79, 28);
		contentPane.add(lblSabores);

		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setForeground(Color.WHITE);
		lblValorTotal.setFont(new Font("Arial", Font.BOLD, 18));
		lblValorTotal.setBackground(Color.WHITE);
		lblValorTotal.setBounds(10, 192, 96, 24);
		contentPane.add(lblValorTotal);

		// TxtBox
		txtPrecoPizza = new JTextField();
		txtPrecoPizza.setEditable(false);
		txtPrecoPizza.setText("2.00");
		txtPrecoPizza.setFont(new Font("Arial", Font.PLAIN, 18));
		txtPrecoPizza.setBounds(10, 90, 166, 27);
		contentPane.add(txtPrecoPizza);
		txtPrecoPizza.setColumns(10);

		txtQuantidadePizza = new JTextField();
		txtQuantidadePizza.setFont(new Font("Arial", Font.PLAIN, 18));
		txtQuantidadePizza.setColumns(10);
		txtQuantidadePizza.setBounds(10, 153, 166, 27);
		contentPane.add(txtQuantidadePizza);

		txtValorTotal = new JTextField();
		txtValorTotal.setBackground(new Color(255, 215, 0));
		txtValorTotal.setEditable(false);
		txtValorTotal.setFont(new Font("Arial", Font.PLAIN, 18));
		txtValorTotal.setColumns(10);
		txtValorTotal.setBounds(108, 191, 68, 27);
		contentPane.add(txtValorTotal);

		// RadioButtons
		JRadioButton RB_QueijoMilho = new JRadioButton("4 queijos e milho");
		RB_QueijoMilho.setFont(new Font("Arial", Font.PLAIN, 14));
		RB_QueijoMilho.setForeground(new Color(255, 255, 255));
		RB_QueijoMilho.setBackground(new Color(255, 102, 51));
		RB_QueijoMilho.setBounds(95, 244, 131, 23);
		contentPane.add(RB_QueijoMilho);

		JRadioButton RB_FileFritas = new JRadioButton("Fil\u00E9 com fritas");
		RB_FileFritas.setForeground(new Color(255, 255, 255));
		RB_FileFritas.setFont(new Font("Arial", Font.PLAIN, 14));
		RB_FileFritas.setBackground(new Color(255, 102, 51));
		RB_FileFritas.setBounds(95, 270, 123, 23);
		contentPane.add(RB_FileFritas);

		JRadioButton RB_Portuguesa = new JRadioButton("Portuguesa");
		RB_Portuguesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ButtonGroup buttonGroup = new javax.swing.ButtonGroup();

				buttonGroup.add(RB_QueijoMilho); // Permite usuario selecionar apenas um JRadioButton
				buttonGroup.add(RB_FileFritas);
				buttonGroup.add(RB_Portuguesa);
			}
		});
		RB_Portuguesa.setForeground(new Color(255, 255, 255));
		RB_Portuguesa.setFont(new Font("Arial", Font.PLAIN, 14));
		RB_Portuguesa.setBackground(new Color(255, 102, 51));
		RB_Portuguesa.setBounds(95, 296, 109, 23);
		contentPane.add(RB_Portuguesa);

		// Buttons
		JButton btnProsseguir = new JButton("Prosseguir");
		btnProsseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Buying_Pizza buyPizza = new Buying_Pizza();
				buyPizza.setVisible(true);
			}
		});
		btnProsseguir.setForeground(Color.WHITE);
		btnProsseguir.setFont(new Font("Arial", Font.BOLD, 18));
		btnProsseguir.setBackground(new Color(189, 183, 107));
		btnProsseguir.setBounds(86, 330, 205, 40);
		contentPane.add(btnProsseguir);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CCPizza.ValorProduto();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(189, 183, 107));
		btnNewButton.setBounds(188, 153, 103, 67);
		contentPane.add(btnNewButton);

	}
}
