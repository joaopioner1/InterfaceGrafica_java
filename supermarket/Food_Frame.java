package supermarket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Food_Frame extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_Frame frame = new Food_Frame();
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
	public Food_Frame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Labels
		JLabel lblpizza = new JLabel("");
		lblpizza.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/Pizza_icon-icons.com_68706.png")));
		lblpizza.setBounds(10, 52, 46, 41);
		contentPane.add(lblpizza);
		
		JLabel lblcrossaint = new JLabel("");
		lblcrossaint.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32372croissant_98899.png")));
		lblcrossaint.setBounds(10, 111, 46, 41);
		contentPane.add(lblcrossaint);
		
		JLabel lblegg = new JLabel("");
		lblegg.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32390egg_98878.png")));
		lblegg.setBounds(10, 170, 46, 48);
		contentPane.add(lblegg);
		
		JLabel lblchocolate = new JLabel("");
		lblchocolate.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32425chocolatebar_98858.png")));
		lblchocolate.setBounds(10, 229, 46, 48);
		contentPane.add(lblchocolate);
		
		JLabel lblhoney = new JLabel("");
		lblhoney.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32429honeypot_98909.png")));
		lblhoney.setBounds(10, 288, 46, 48);
		contentPane.add(lblhoney);
		
		JLabel lblcheese = new JLabel("");
		lblcheese.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32377cheesewedge_98913.png")));
		lblcheese.setBounds(10, 347, 46, 48);
		contentPane.add(lblcheese);
		
		JLabel lblpopcorn = new JLabel("");
		lblpopcorn.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32396popcorn_98852.png")));
		lblpopcorn.setBounds(203, 45, 46, 48);
		contentPane.add(lblpopcorn);
		
		JLabel lblbread = new JLabel("");
		lblbread.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/Bread_icon-icons.com_68777.png")));
		lblbread.setBounds(203, 104, 46, 48);
		contentPane.add(lblbread);
		
		JLabel lblfrenchfries = new JLabel("");
		lblfrenchfries.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/French_Fries_icon-icons.com_68745.png")));
		lblfrenchfries.setBounds(203, 170, 46, 48);
		contentPane.add(lblfrenchfries);
		
		JLabel lblsteak = new JLabel("");
		lblsteak.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/Steak_icon-icons.com_68688.png")));
		lblsteak.setBounds(203, 229, 46, 48);
		contentPane.add(lblsteak);
		
		JLabel lblsalad = new JLabel("");
		lblsalad.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32395greensalad_98843 (1).png")));
		lblsalad.setBounds(203, 288, 46, 48);
		contentPane.add(lblsalad);
		
		JLabel lblsandwich = new JLabel("");
		lblsandwich.setIcon(new ImageIcon(Food_Frame.class.getResource("/supermarket/32386sandwich_98891.png")));
		lblsandwich.setBounds(203, 347, 46, 48);
		contentPane.add(lblsandwich);
		
		JLabel lblNewLabel = new JLabel("Comprando alimentos");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 267, 23);
		contentPane.add(lblNewLabel);
		
		//Bottons
		JButton btnPizza = new JButton("Comprar");
		btnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Food_Frame_Pizza foodFramePizza = new Food_Frame_Pizza();
				foodFramePizza.setVisible(true);
			}
		});
		btnPizza.setBackground(new Color(105, 105, 105));
		btnPizza.setFont(new Font("Arial", Font.BOLD, 12));
		btnPizza.setForeground(new Color(255, 255, 255));
		btnPizza.setBounds(66, 63, 89, 23);
		contentPane.add(btnPizza);
		
		JButton btnCrossaint = new JButton("Comprar");
		btnCrossaint.setForeground(new Color(255, 255, 255));
		btnCrossaint.setBackground(new Color(105, 105, 105));
		btnCrossaint.setFont(new Font("Arial", Font.BOLD, 12));
		btnCrossaint.setBounds(66, 129, 89, 23);
		contentPane.add(btnCrossaint);
		
		JButton btnEgg = new JButton("Comprar");
		btnEgg.setForeground(new Color(255, 255, 255));
		btnEgg.setBackground(new Color(105, 105, 105));
		btnEgg.setFont(new Font("Arial", Font.BOLD, 12));
		btnEgg.setBounds(66, 189, 89, 23);
		contentPane.add(btnEgg);
		
		JButton btnChocolate = new JButton("Comprar");
		btnChocolate.setBackground(new Color(105, 105, 105));
		btnChocolate.setForeground(new Color(255, 255, 255));
		btnChocolate.setFont(new Font("Arial", Font.BOLD, 12));
		btnChocolate.setBounds(66, 251, 89, 23);
		contentPane.add(btnChocolate);
		
		JButton btnHoney = new JButton("Comprar");
		btnHoney.setBackground(new Color(105, 105, 105));
		btnHoney.setForeground(new Color(255, 255, 255));
		btnHoney.setFont(new Font("Arial", Font.BOLD, 12));
		btnHoney.setBounds(66, 313, 89, 23);
		contentPane.add(btnHoney);
		
		JButton btnCheese = new JButton("Comprar");
		btnCheese.setBackground(new Color(105, 105, 105));
		btnCheese.setForeground(new Color(255, 255, 255));
		btnCheese.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCheese.setBounds(66, 367, 89, 23);
		contentPane.add(btnCheese);
		
		JButton btnPopCorn = new JButton("Comprar");
		btnPopCorn.setForeground(new Color(255, 255, 255));
		btnPopCorn.setBackground(new Color(105, 105, 105));
		btnPopCorn.setFont(new Font("Arial", Font.BOLD, 12));
		btnPopCorn.setBounds(259, 63, 89, 23);
		contentPane.add(btnPopCorn);
		
		JButton btnBread = new JButton("Comprar");
		btnBread.setForeground(new Color(255, 255, 255));
		btnBread.setBackground(new Color(105, 105, 105));
		btnBread.setFont(new Font("Arial", Font.PLAIN, 12));
		btnBread.setBounds(259, 129, 89, 23);
		contentPane.add(btnBread);
		
		JButton btnFrenchFries = new JButton("Comprar");
		btnFrenchFries.setBackground(new Color(105, 105, 105));
		btnFrenchFries.setForeground(new Color(255, 255, 255));
		btnFrenchFries.setFont(new Font("Arial", Font.BOLD, 12));
		btnFrenchFries.setBounds(259, 189, 89, 23);
		contentPane.add(btnFrenchFries);
		
		JButton btnSteak = new JButton("Comprar");
		btnSteak.setForeground(new Color(255, 255, 255));
		btnSteak.setBackground(new Color(105, 105, 105));
		btnSteak.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSteak.setBounds(259, 251, 89, 23);
		contentPane.add(btnSteak);
		
		JButton btnSalad = new JButton("Comprar");
		btnSalad.setForeground(new Color(255, 255, 255));
		btnSalad.setBackground(new Color(105, 105, 105));
		btnSalad.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalad.setBounds(259, 313, 89, 23);
		contentPane.add(btnSalad);
		
		JButton btnSandwich = new JButton("Comprar");
		btnSandwich.setForeground(new Color(255, 255, 255));
		btnSandwich.setBackground(new Color(105, 105, 105));
		btnSandwich.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSandwich.setBounds(259, 367, 89, 23);
		contentPane.add(btnSandwich);
	}
	
}
