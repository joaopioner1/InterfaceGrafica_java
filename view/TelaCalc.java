package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCalc extends JFrame {
// Autor: Joao Vitor Souza Pioner | Data: 2/11/2020 | Hora: 7 : 30

    private static final long serialVersionUID = 1L;

 
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

    private JPanel contentPane;
    public JTextField txtSoma1;
    public JTextField txtSoma2;
    public JTextField txtSomaResult;
    public JTextField txtSubtracaoResult;
    public JTextField txtSubtracao1;
    public JTextField txtSubtracao2;
    public JTextField txtMultiplicacaoResult;
    public JTextField txtMultiplicacao1;
    public JTextField txtMultiplicacao2;
    public JTextField txtDivisaoResult;
    public JTextField txtDivisao1;
    public JTextField txtDivisao2;

    private SecClass secClass = new SecClass(this); // pssa esta tela como parâmetro pro objeto da SecClass

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

        txtSoma1 = new JTextField();
        txtSoma1.setBounds(70, 63, 97, 27);
        txtSoma1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(txtSoma1);
        txtSoma1.setColumns(10);
        txtSoma1.setDocument(new JustNumbers());

        txtSoma2 = new JTextField();
        txtSoma2.setBounds(228, 63, 97, 27);
        txtSoma2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtSoma2.setColumns(10);
        contentPane.add(txtSoma2);
        txtSoma2.setDocument(new JustNumbers()); // Aceita apenas numbers

        txtSubtracao1 = new JTextField();
        txtSubtracao1.setBounds(70, 111, 97, 27);
        txtSubtracao1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtSubtracao1.setColumns(10);
        contentPane.add(txtSubtracao1);
        txtSubtracao1.setDocument(new JustNumbers());

        txtSubtracao2 = new JTextField();
        txtSubtracao2.setBounds(228, 111, 97, 27);
        txtSubtracao2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtSubtracao2.setColumns(10);
        contentPane.add(txtSubtracao2);
        txtSubtracao2.setDocument(new JustNumbers());

        txtMultiplicacao1 = new JTextField();
        txtMultiplicacao1.setBounds(70, 161, 97, 27);
        txtMultiplicacao1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtMultiplicacao1.setColumns(10);
        contentPane.add(txtMultiplicacao1);
        txtMultiplicacao1.setDocument(new JustNumbers());

        txtMultiplicacao2 = new JTextField();
        txtMultiplicacao2.setBounds(228, 161, 97, 27);
        txtMultiplicacao2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtMultiplicacao2.setColumns(10);
        contentPane.add(txtMultiplicacao2);
        txtMultiplicacao2.setDocument(new JustNumbers());

        txtDivisao1 = new JTextField();
        txtDivisao1.setBounds(70, 209, 97, 27);
        txtDivisao1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtDivisao1.setColumns(10);
        contentPane.add(txtDivisao1);
        txtDivisao1.setDocument(new JustNumbers());

        txtDivisao2 = new JTextField();
        txtDivisao2.setBounds(228, 209, 97, 27);
        txtDivisao2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtDivisao2.setColumns(10);
        contentPane.add(txtDivisao2);
        txtDivisao2.setDocument(new JustNumbers());

        // Resultados

        txtSomaResult = new JTextField();
        txtSomaResult.setBounds(361, 63, 97, 27);
        txtSomaResult.setBackground(Color.DARK_GRAY);
        txtSomaResult.setEnabled(false);
        txtSomaResult.setForeground(Color.WHITE);
        txtSomaResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtSomaResult.setColumns(10);
        contentPane.add(txtSomaResult);

        txtSubtracaoResult = new JTextField();
        txtSubtracaoResult.setBounds(361, 111, 97, 27);
        txtSubtracaoResult.setBackground(Color.DARK_GRAY);
        txtSubtracaoResult.setEnabled(false);
        txtSubtracaoResult.setForeground(Color.RED);
        txtSubtracaoResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtSubtracaoResult.setColumns(10);
        contentPane.add(txtSubtracaoResult);

        txtMultiplicacaoResult = new JTextField();
        txtMultiplicacaoResult.setBounds(361, 161, 97, 27);
        txtMultiplicacaoResult.setBackground(Color.DARK_GRAY);
        txtMultiplicacaoResult.setEnabled(false);
        txtMultiplicacaoResult.setForeground(Color.RED);
        txtMultiplicacaoResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtMultiplicacaoResult.setColumns(10);
        contentPane.add(txtMultiplicacaoResult);

        txtDivisaoResult = new JTextField();
        txtDivisaoResult.setBounds(361, 209, 97, 27);
        txtDivisaoResult.setBackground(Color.DARK_GRAY);
        txtDivisaoResult.setEnabled(false);
        txtDivisaoResult.setForeground(Color.RED);
        txtDivisaoResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtDivisaoResult.setColumns(10);
        contentPane.add(txtDivisaoResult);

        JButton btnCalcular = new JButton("Calc");
        btnCalcular.setBounds(129, 294, 89, 28);
        btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnCalcular.setForeground(new Color(255, 255, 255));
        btnCalcular.setBackground(new Color(105, 105, 105));
        btnCalcular.addActionListener(event -> calcular());
        contentPane.add(btnCalcular);

        JButton btnClean = new JButton("Clean");
        btnClean.setBounds(284, 294, 89, 28);
        btnClean.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnClean.setForeground(new Color(255, 245, 238));
        btnClean.addActionListener(event -> secClass.limparCache());
        btnClean.setBackground(new Color(112, 128, 144));
        contentPane.add(btnClean);
    }

    private void calcular() {
        txtSomaResult.setText(String.valueOf(secClass.somar())); // Imprime o numero da soma dentro da TxtBox
        txtSubtracaoResult.setText(String.valueOf(secClass.subtrair()));
        txtMultiplicacaoResult.setText(String.valueOf(secClass.multiplicar()));
        txtDivisaoResult.setText(String.valueOf(secClass.dividir()));
    }
}