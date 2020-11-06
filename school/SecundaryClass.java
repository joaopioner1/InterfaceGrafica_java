package school;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class SecundaryClass {

	final MainClass mN;

	public SecundaryClass(MainClass mn) { // recebe a tela como parâmetro ao invés de instanciar novamente
		this.mN = mn;
	}

	public double CalculaMedia() {

		double a = Double.parseDouble(mN.txtNumber1.getText().replaceAll(",", ".")); //replaceAll serve para alterar caracteres
		double b = Double.parseDouble(mN.txtNumber2.getText().replaceAll(",", "."));
		double c = Double.parseDouble(mN.txtNumber3.getText().replaceAll(",", "."));

		return (a + b + c) / 3;
	}

	public void ShowData() {
		mN.txtMedia = new JTextField();
		mN.txtMedia.setEditable(false);
		mN.txtMedia.setFont(new Font("Arial", Font.PLAIN, 15));
		mN.txtMedia.setForeground(new Color(0, 0, 128));
		mN.txtMedia.setBounds(124, 139, 211, 23);
		mN.pane1.add(mN.txtMedia);
		mN.txtMedia.setColumns(10);

		mN.txtSituacao = new JTextField();
		mN.txtSituacao.setEditable(false);
		mN.txtSituacao.setForeground(new Color(0, 0, 128));
		mN.txtSituacao.setFont(new Font("Arial", Font.PLAIN, 15));
		mN.txtSituacao.setColumns(10);
		mN.txtSituacao.setBounds(134, 173, 201, 23);
		mN.pane1.add(mN.txtSituacao);

		mN.txtMedia.setText(String.valueOf(CalculaMedia())); // Mostra o texto na tela

		double d = Double.parseDouble(mN.txtInputAverage.getText().replaceAll(",", ".")); // transforma a txtbox de String para double
		if (CalculaMedia() >= d) {
			mN.txtSituacao.setText("Aluno aprovado!");
		} else {
			mN.txtSituacao.setText("Aluno reprovado!");
		}
	}

	public void CleanCache() {
		mN.txtNumber1.setText("");
		mN.txtNumber2.setText("");
		mN.txtNumber3.setText("");
		
		mN.txtSituacao.setText("");
		mN.txtMedia.setText("");
		mN.txtInputAverage.setText("");
	}
}
