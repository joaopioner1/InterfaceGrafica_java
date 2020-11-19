package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buying_Pizza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumeroCartao;
	private JTextField txtData;
	private JTextField txtCodigoSeg;
	private JTextField txtCPF;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buying_Pizza frame = new Buying_Pizza();
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
	public Buying_Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 99, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TxtBoxs
		txtNumeroCartao = new JTextField();
		txtNumeroCartao.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNumeroCartao.setBounds(112, 59, 254, 24);
		contentPane.add(txtNumeroCartao);
		txtNumeroCartao.setColumns(10);
		
		txtData = new JTextField();
		txtData.setText("       /");
		txtData.setFont(new Font("Arial", Font.PLAIN, 14));
		txtData.setColumns(10);
		txtData.setBounds(159, 133, 68, 24);
		contentPane.add(txtData);
		
		txtCodigoSeg = new JTextField();
		txtCodigoSeg.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCodigoSeg.setBounds(190, 94, 37, 24);
		contentPane.add(txtCodigoSeg);
		txtCodigoSeg.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCPF.setColumns(10);
		txtCPF.setBounds(52, 177, 175, 24);
		contentPane.add(txtCPF);
		
		//Labels
		JLabel lblFinalizandoCompra = new JLabel("Finalizando a compra");
		lblFinalizandoCompra.setForeground(new Color(255, 255, 255));
		lblFinalizandoCompra.setFont(new Font("Arial", Font.BOLD, 24));
		lblFinalizandoCompra.setBounds(44, 11, 262, 24);
		contentPane.add(lblFinalizandoCompra);
		
		JLabel lblNCartao = new JLabel("N\u00BA do cart\u00E3o:");
		lblNCartao.setForeground(new Color(255, 255, 255));
		lblNCartao.setFont(new Font("Arial", Font.BOLD, 16));
		lblNCartao.setBounds(10, 57, 100, 24);
		contentPane.add(lblNCartao);
		
		JLabel lblData = new JLabel("Data (vencimento):");
		lblData.setForeground(new Color(255, 255, 255));
		lblData.setBackground(new Color(255, 255, 255));
		lblData.setFont(new Font("Arial", Font.BOLD, 16));
		lblData.setBounds(10, 135, 152, 16);
		contentPane.add(lblData);
		
		JLabel lblCodigoSeg = new JLabel("C\u00F3digo de seguran\u00E7a:");
		lblCodigoSeg.setForeground(Color.WHITE);
		lblCodigoSeg.setFont(new Font("Arial", Font.BOLD, 16));
		lblCodigoSeg.setBackground(Color.WHITE);
		lblCodigoSeg.setBounds(10, 94, 170, 20);
		contentPane.add(lblCodigoSeg);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setForeground(Color.WHITE);
		lblCPF.setFont(new Font("Arial", Font.BOLD, 16));
		lblCPF.setBackground(Color.WHITE);
		lblCPF.setBounds(10, 179, 45, 16);
		contentPane.add(lblCPF);
		
		JLabel lblImagemCartao = new JLabel("");
		lblImagemCartao.setIcon(new ImageIcon(Buying_Pizza.class.getResource("/supermarket/cartao-de-credito (1).png")));
		lblImagemCartao.setBounds(237, 81, 129, 120);
		contentPane.add(lblImagemCartao);
		
		JLabel lblCadeado = new JLabel("");
		lblCadeado.setIcon(new ImageIcon(Buying_Pizza.class.getResource("/supermarket/cadeado (3).png")));
		lblCadeado.setBounds(10, 11, 24, 24);
		contentPane.add(lblCadeado);
		
		//Button
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showConfirmDialog(null, "Compra finalizada com sucesso! Obrigado pela preferência, volte sempre.");
			}
		});
		btnFinalizar.setForeground(new Color(255, 255, 255));
		btnFinalizar.setBackground(new Color(119, 136, 153));
		btnFinalizar.setFont(new Font("Arial", Font.BOLD, 24));
		btnFinalizar.setBounds(72, 237, 234, 38);
		contentPane.add(btnFinalizar);
	}
}
