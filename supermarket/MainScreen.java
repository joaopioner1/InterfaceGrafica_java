package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	//Autor: Joao Vitor Souza Pioner | Data: 9/11/2020 8:16 ultima modificacao: 21:26 h
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
		
		//Labels
		JLabel lblTitle = new JLabel("PIONER'S MERCADO");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitle.setBounds(62, 20, 260, 46);
		contentPane.add(lblTitle);
		
		JLabel lblImageMercado = new JLabel("");
		lblImageMercado.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/shop_106574.png")));
		lblImageMercado.setBounds(10, 11, 56, 55);
		contentPane.add(lblImageMercado);
		
		JLabel lblPergunta = new JLabel("Para onde voc\u00EA dejesa ir?");
		lblPergunta.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPergunta.setForeground(new Color(255, 255, 255));
		lblPergunta.setBounds(10, 96, 227, 22);
		contentPane.add(lblPergunta);
		
		JLabel lblAlim = new JLabel("Alimentos:");
		lblAlim.setForeground(new Color(255, 255, 255));
		lblAlim.setBackground(new Color(255, 255, 255));
		lblAlim.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAlim.setBounds(10, 129, 69, 27);
		contentPane.add(lblAlim);
		
		JLabel lblRoup = new JLabel("Roupas:");
		lblRoup.setForeground(Color.WHITE);
		lblRoup.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRoup.setBackground(Color.WHITE);
		lblRoup.setBounds(156, 129, 69, 27);
		contentPane.add(lblRoup);
		
		JLabel lblTec = new JLabel("Tecnologia:");
		lblTec.setForeground(Color.WHITE);
		lblTec.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTec.setBackground(Color.WHITE);
		lblTec.setBounds(301, 129, 74, 27);
		contentPane.add(lblTec);
		
		//Botoes
		JButton btnComida = new JButton("");
		btnComida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Food_Frame food = new Food_Frame();
				food.setVisible(true); //Deixando a JFrame Visivel
				
			}
		});
		btnComida.setBackground(new Color(255, 165, 0));
		btnComida.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/32382hamburger_98925.png")));
		btnComida.setBounds(10, 153, 106, 40);
		contentPane.add(btnComida);
		
		JButton btnRoupas = new JButton("");
		btnRoupas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnRoupas.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/1486395297-16-clothes_80572.png")));
		btnRoupas.setBackground(new Color(255, 165, 0));
		btnRoupas.setBounds(156, 153, 106, 40);
		contentPane.add(btnRoupas);
		
		JButton btnTecnologia = new JButton("");
		btnTecnologia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnTecnologia.setIcon(new ImageIcon(MainScreen.class.getResource("/supermarket/3069182-business-computer-device-office-technology_112722.png")));
		btnTecnologia.setBackground(new Color(255, 165, 0));
		btnTecnologia.setBounds(301, 153, 106, 40);
		contentPane.add(btnTecnologia);
		
		
	}
}
