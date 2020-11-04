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
	public JPanel pane2;
	public JTextField txtAverage;
	
	public MainClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 227);
		pane1 = new JPanel();
		pane1.setBackground(new Color(123, 104, 238));
		pane1.setForeground(new Color(255, 255, 255));
		pane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane1);
		pane1.setLayout(null);
		
		JLabel lblFirstNote = new JLabel("Insira a primeira nota do aluno: ");
		lblFirstNote.setFont(new Font("Arial", Font.BOLD, 14));
		lblFirstNote.setForeground(new Color(255, 255, 255));
		lblFirstNote.setBounds(10, 22, 240, 24);
		pane1.add(lblFirstNote);
		
		JLabel lblSecondNote = new JLabel("Insira a segunda nota do aluno: ");
		lblSecondNote.setForeground(Color.WHITE);
		lblSecondNote.setFont(new Font("Arial", Font.BOLD, 14));
		lblSecondNote.setBounds(10, 57, 240, 24);
		pane1.add(lblSecondNote);
		
		JLabel lblThirdNote = new JLabel("Insira a terceira nota do aluno: ");
		lblThirdNote.setForeground(Color.WHITE);
		lblThirdNote.setFont(new Font("Arial", Font.BOLD, 14));
		lblThirdNote.setBounds(10, 92, 240, 24);
		pane1.add(lblThirdNote);
		
		txtNumber1 = new JTextField();
		txtNumber1.setColumns(10);
		txtNumber1.setBounds(239, 24, 96, 23);
		pane1.add(txtNumber1);
		txtNumber1.setDocument(new JustNumbers());
		
		txtNumber2 = new JTextField();
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(239, 59, 96, 23);
		pane1.add(txtNumber2);
		txtNumber2.setDocument(new JustNumbers());
		
		txtNumber3 = new JTextField();
		txtNumber3.setColumns(10);
		txtNumber3.setBounds(239, 94, 96, 23);
		pane1.add(txtNumber3);
		txtNumber3.setDocument(new JustNumbers());
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.setForeground(new Color(255, 255, 255));
		btnCalculate.setBackground(new Color(0, 255, 127));
		btnCalculate.setFont(new Font("Arial", Font.BOLD, 14));
		btnCalculate.setBounds(121, 146, 96, 31);
		pane1.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 289, 152);
				pane2 = new JPanel();
				pane2.setForeground(new Color(255, 255, 255));
				pane2.setBackground(new Color(123, 104, 238));
				pane2.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(pane2);
				pane2.setLayout(null);
				
				JLabel lblShowAverege = new JLabel("Media do aluno: ");
				lblShowAverege.setFont(new Font("Arial", Font.BOLD, 16));
				lblShowAverege.setForeground(new Color(255, 255, 255));
				lblShowAverege.setBounds(32, 25, 126, 26);
				pane2.add(lblShowAverege);
				
				txtAverage = new JTextField();
				txtAverage.setFont(new Font("Arial", Font.BOLD, 14));
				txtAverage.setEditable(false);
				txtAverage.setBounds(161, 28, 86, 25);
				pane2.add(txtAverage);
				txtAverage.setColumns(10);
				
				sC.ShowPanel(); //Metodo que executa o codigo
			}
		});
		
	}
}
