package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MainScreen extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	//Autor: Joao Vitor Souza Pioner | Data: 9/11/2020 8:16
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JPanel contentPane;
	
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 264);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 99, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("PIONER'S MERCADO");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitle.setBounds(62, 20, 260, 46);
		contentPane.add(lblTitle);
		
		JLabel lblImageMercado = new JLabel("");
		lblImageMercado.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/shop_106574.png")));
		lblImageMercado.setBounds(10, 11, 56, 55);
		contentPane.add(lblImageMercado);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/32382hamburger_98925.png")));
		btnNewButton.setBounds(10, 153, 106, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Para onde voc\u00EA dejesa ir?");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 96, 227, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/1486395297-16-clothes_80572.png")));
		btnNewButton_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1.setBounds(156, 153, 106, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/3069182-business-computer-device-office-technology_112722.png")));
		btnNewButton_2.setBackground(new Color(169, 169, 169));
		btnNewButton_2.setBounds(301, 153, 106, 40);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Alimentos:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 129, 69, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Roupas:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(156, 129, 69, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tecnologia:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(301, 129, 74, 27);
		contentPane.add(lblNewLabel_1_2);
		
		
	}
}
