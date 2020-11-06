package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Principal extends JFrame {
	private static final long serialVersionUID = 1L;
	
    //AUTOR: Joao Vitor Souza Pioner | DATA: 5/11/20 8:33
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JPanel contentPane;
	public JTextField txtUsuario;
	public JPasswordField txtPassword;
	
	public Principal() {
		//PANEL
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//LABELS
		JLabel lblLogin = new JLabel("Sistema de login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 24));
		lblLogin.setBounds(119, 11, 192, 32);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Senha:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 16));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setIcon(new ImageIcon(Principal.class.getResource("/login/icons8-esqueci-a-senha-64.png")));
		lblPassword.setBounds(28, 132, 134, 81);
		contentPane.add(lblPassword);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setIcon(new ImageIcon(Principal.class.getResource("/login/icons8-login-arredondado-\u00E0-direita-64.png")));
		lblUsuario.setBounds(28, 47, 338, 74);
		contentPane.add(lblUsuario);
		
		//TXTBOX
		txtUsuario = new JTextField();
		txtUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //FUNCAO PARA MOSTRAR O USUARIO DO LADO DA LABEL
				login();
			}
		});
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsuario.setBounds(97, 93, 269, 32);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPassword.setColumns(10);
		txtPassword.setBounds(97, 180, 269, 33);
		contentPane.add(txtPassword);
		
		//BUTTON
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { //FUNCAO BOTAO
				login();
			}
		});
		btnOk.setFont(new Font("Arial", Font.PLAIN, 14));
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setBackground(new Color(192, 192, 192));
		btnOk.setBounds(175, 250, 89, 32);
		contentPane.add(btnOk);
		
		char senha = txtPassword.getEchoChar(); // VARIAVEL PARA USAR NO CHECKBOX
		
		JCheckBox chkSenha = new JCheckBox("Mostrar senha");
		chkSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // ESCONDE E MOSTRA A SENHA
				
				if (chkSenha.isSelected()) {
					txtPassword.setEchoChar('\u0000');
				} else {
					txtPassword.setEchoChar(senha);
				}
			}
		});
		chkSenha.setForeground(new Color(0, 0, 0));
		chkSenha.setBackground(new Color(112, 128, 144));
		chkSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		chkSenha.setBounds(97, 220, 105, 23);
		contentPane.add(chkSenha);
	}
	
	private void login() {
		JOptionPane.showMessageDialog(this, "Usuario: " + txtUsuario.getText() + 
				"\nSenha: " + new String(txtPassword.getPassword()));
	}
}
