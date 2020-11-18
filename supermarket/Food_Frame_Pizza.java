package supermarket;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	private JPanel contentPane;
	private JTextField txtPrecoPizza;
	private JTextField txtQuantidadePizza;

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

	public Food_Frame_Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Labels
		JLabel lblNewLabel = new JLabel("Especifica\u00E7\u00F5es");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 186, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pre\u00E7o:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 63, 64, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira quantas fatias deseja comprar:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 123, 322, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblImagemPizza = new JLabel("New label");
		lblImagemPizza.setIcon(new ImageIcon(Food_Frame_Pizza.class.getResource("/supermarket/Pizza_icon-icons.com_68706.png")));
		lblImagemPizza.setBounds(245, 31, 46, 48);
		contentPane.add(lblImagemPizza);
		
		JLabel lblSabores = new JLabel("Sabores:");
		lblSabores.setForeground(Color.WHITE);
		lblSabores.setFont(new Font("Arial", Font.BOLD, 18));
		lblSabores.setBounds(10, 191, 79, 28);
		contentPane.add(lblSabores);
		
		//TxtBox
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
		
		//RadioButtons
		JRadioButton RB_QueijoMilho = new JRadioButton("4 queijos e milho");
		RB_QueijoMilho.setFont(new Font("Arial", Font.PLAIN, 14));
		RB_QueijoMilho.setForeground(new Color(255, 255, 255));
		RB_QueijoMilho.setBackground(new Color(255, 102, 51));
		RB_QueijoMilho.setBounds(95, 196, 131, 23);
		contentPane.add(RB_QueijoMilho);
		
		JRadioButton RB_FileFritas = new JRadioButton("Fil\u00E9 com fritas");
		RB_FileFritas.setForeground(new Color(255, 255, 255));
		RB_FileFritas.setFont(new Font("Arial", Font.PLAIN, 14));
		RB_FileFritas.setBackground(new Color(255, 102, 51));
		RB_FileFritas.setBounds(95, 222, 123, 23);
		contentPane.add(RB_FileFritas);
		
		JRadioButton RB_Portuguesa = new JRadioButton("Portuguesa");
		RB_Portuguesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		RB_Portuguesa.setForeground(new Color(255, 255, 255));
		RB_Portuguesa.setFont(new Font("Arial", Font.PLAIN, 14));
		RB_Portuguesa.setBackground(new Color(255, 102, 51));
		RB_Portuguesa.setBounds(95, 248, 109, 23);
		contentPane.add(RB_Portuguesa);
		
		//Buttons
		JButton btnProsseguir = new JButton("Prosseguir");
		btnProsseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnProsseguir.setForeground(Color.WHITE);
		btnProsseguir.setFont(new Font("Arial", Font.BOLD, 18));
		btnProsseguir.setBackground(new Color(189, 183, 107));
		btnProsseguir.setBounds(95, 294, 185, 40);
		contentPane.add(btnProsseguir);
	}
}