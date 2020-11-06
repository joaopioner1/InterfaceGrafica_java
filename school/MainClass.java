package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.JustNumbers;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainClass extends JFrame {

	private static final long serialVersionUID = 1L;

	// AUTOR: JOAO VITOR SOUZA PIONER | DATA: 6/11/2020 8:26
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private SecundaryClass sC = new SecundaryClass(this);

	public JPanel pane1;
	public JTextField txtNumber1;
	public JTextField txtNumber2;
	public JTextField txtNumber3;
	public JTextField txtInputAverage;
	public JLabel lblShowAvg;
	public JTextField txtMedia;
	public JLabel lblSitucaoDoAluno;
	public JTextField txtSituacao;
	private JLabel lblMedia;
	private JLabel lblSituoDoAluno;

	public MainClass() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 311);
		pane1 = new JPanel();
		pane1.setBackground(new Color(46, 139, 87));
		pane1.setForeground(new Color(255, 255, 255));
		pane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane1);
		pane1.setLayout(null);

		// TXTBOXS
		txtNumber1 = new JTextField();
		txtNumber1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNumber1.setColumns(10);
		txtNumber1.setBounds(10, 79, 96, 23);
		pane1.add(txtNumber1);
		txtNumber1.setDocument(new JustNumbers());

		txtNumber2 = new JTextField();
		txtNumber2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(124, 79, 96, 23);
		pane1.add(txtNumber2);
		txtNumber2.setDocument(new JustNumbers());

		txtNumber3 = new JTextField();
		txtNumber3.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNumber3.setColumns(10);
		txtNumber3.setBounds(239, 79, 96, 23);
		pane1.add(txtNumber3);
		txtNumber3.setDocument(new JustNumbers());

		txtInputAverage = new JTextField();
		txtInputAverage.setFont(new Font("Arial", Font.PLAIN, 12));
		txtInputAverage.setColumns(10);
		txtInputAverage.setBounds(10, 24, 106, 23);
		pane1.add(txtInputAverage);
		
		// LABELS
		JLabel lblInsiraNotas = new JLabel("Insira 3 notas: ");
		lblInsiraNotas.setForeground(Color.WHITE);
		lblInsiraNotas.setFont(new Font("Arial", Font.BOLD, 15));
		lblInsiraNotas.setBounds(10, 57, 106, 24);
		pane1.add(lblInsiraNotas);

		JLabel lblAvarege = new JLabel("Insira a m\u00E9dia necess\u00E1ria para passar de ano: ");
		lblAvarege.setForeground(Color.WHITE);
		lblAvarege.setFont(new Font("Arial", Font.BOLD, 15));
		lblAvarege.setBounds(10, 0, 325, 24);
		pane1.add(lblAvarege);
		
		lblMedia = new JLabel("M\u00E9dia do aluno:");
		lblMedia.setForeground(new Color(0, 0, 128));
		lblMedia.setFont(new Font("Arial", Font.BOLD, 15));
		lblMedia.setBounds(10, 139, 125, 23);
		pane1.add(lblMedia);
		
		lblSituoDoAluno = new JLabel("Situ\u00E7\u00E3o do aluno:");
		lblSituoDoAluno.setForeground(new Color(0, 0, 128));
		lblSituoDoAluno.setFont(new Font("Arial", Font.BOLD, 15));
		lblSituoDoAluno.setBounds(10, 173, 125, 23);
		pane1.add(lblSituoDoAluno);
		
		// BOTTON
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.setForeground(new Color(255, 255, 255));
		btnCalculate.setBackground(new Color(112, 128, 144));
		btnCalculate.setFont(new Font("Arial", Font.BOLD, 14));
		btnCalculate.setBounds(124, 230, 96, 31);
		pane1.add(btnCalculate);
		
		// METODO BUTTON
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtMedia = new JTextField();
				txtMedia.setEditable(false);
				txtMedia.setFont(new Font("Arial", Font.PLAIN, 15));
				txtMedia.setForeground(new Color(0, 0, 128));
				txtMedia.setBounds(124, 139, 211, 23);
				pane1.add(txtMedia);
				txtMedia.setColumns(10);

				txtSituacao = new JTextField();
				txtSituacao.setEditable(false);
				txtSituacao.setForeground(new Color(0, 0, 128));
				txtSituacao.setFont(new Font("Arial", Font.PLAIN, 15));
				txtSituacao.setColumns(10);
				txtSituacao.setBounds(134, 173, 201, 23);
				pane1.add(txtSituacao);
				
				sC.ShowData(); // Metodo que executa o codigo
			}
		});

	}
}
