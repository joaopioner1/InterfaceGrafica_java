package imc;

import java.awt.Font;

public class SecunClass {

	final ImcMainClass mNC;

	public SecunClass(ImcMainClass mnC) { // recebe a tela como parâmetro ao invés de instanciar novamente
		this.mNC = mnC;
	}

	public double CalculandoIMC() {

		double peso = Double.parseDouble(mNC.txtPeso.getText().replaceAll(",", ".")); // replaceAll serve para alterar
																						// caracteres
		double altura = Double.parseDouble(mNC.txtAltura.getText().replaceAll(",", "."));

		return peso / (Math.pow(altura, 2));
	}

	public void VerificandoIMC() { // Essa funcao varifica o IMC do usuario

		if (mNC.txtSexo.getText().equals("F")) {
			if (CalculandoIMC() < 19) {
				mNC.txtAuxilio.setText("Magreza. IMC ideal: 19 e 23.9");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC())); // String.format formatei as casas decimais na txtbox
			} else if (CalculandoIMC() >= 19 && CalculandoIMC() <= 23.9) {
				mNC.txtAuxilio.setText("Peso ideal. Parabéns.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
				mNC.txtAuxilio.setFont(new Font("Comic Sans MS", Font.PLAIN, 15)); //Mudei a fonte quando essa condicao for usada
			} else if (CalculandoIMC() > 23.9 && CalculandoIMC() <= 29.9) {
				mNC.txtAuxilio.setText("Sobrepeso. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			} else if (CalculandoIMC() > 29.9 && CalculandoIMC() <= 34.9) {
				mNC.txtAuxilio.setText("Obesidade 1. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			} else if (CalculandoIMC() > 34.9 && CalculandoIMC() <= 38.9) {
				mNC.txtAuxilio.setText("Obesidade 2. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			} else {
				mNC.txtAuxilio.setText("Obesidade 3. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			}
		}

		if (mNC.txtSexo.getText().equals("M")) {
			if (CalculandoIMC() < 20) {
				mNC.txtAuxilio.setText("Magreza. IMC ideal: 9 e 23.9");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC())); // String.format formatei as casas decimais na txtbox
			} else if (CalculandoIMC() > 20 && CalculandoIMC() <= 24.9) {
				mNC.txtAuxilio.setText("Peso ideal. Parabéns.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
				mNC.txtAuxilio.setFont(new Font("Comic Sans MS", Font.PLAIN, 15)); // Mudei a fonte quando essa condicao for usada
			} else if (CalculandoIMC() > 24.9 && CalculandoIMC() <= 29.9) {
				mNC.txtAuxilio.setText("Sobrepeso. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			} else if (CalculandoIMC() > 30 && CalculandoIMC() <= 34.9) {
				mNC.txtAuxilio.setText("Obesidade 1. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			} else if (CalculandoIMC() > 34.9 && CalculandoIMC() <= 39.9) {
				mNC.txtAuxilio.setText("Obesidade 2. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			} else {
				mNC.txtAuxilio.setText("Obesidade 3. IMC ideal: 19 e 23.9.");
				mNC.txtResultado.setText(String.format("%.2f", CalculandoIMC()));
			}
		}
	}

	public void LimpandoCache() { // Essa funcao apaga os dados de todos os campos

		mNC.txtAltura.setText("");
		mNC.txtPeso.setText("");
		mNC.txtSexo.setText("");

		mNC.txtAuxilio.setText("");
		mNC.txtResultado.setText("");
	}
}
