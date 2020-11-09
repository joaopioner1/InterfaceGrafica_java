package imc;

public class SecunClass {
	
	final ImcMainClass mNC;

	public SecunClass(ImcMainClass mnC) { // recebe a tela como parâmetro ao invés de instanciar novamente
		this.mNC = mnC;
	}
	
	public double CalculandoIMC() {
		
		double peso = Double.parseDouble(mNC.txtPeso.getText().replaceAll(",", ".")); //replaceAll serve para alterar caracteres
		double altura = Double.parseDouble(mNC.txtAltura.getText().replaceAll(",", "."));
		
		return peso / (Math.pow(altura, 2)); 
	}
	
	public void VerificandoIMC() {
		
		if (mNC.txtSexo.getText().equals("F")) {
			if (CalculandoIMC() < 19) {
				mNC.txtAuxilio.setText("Magreza. IMC ideal: 9 e 23.9");
				mNC.txtResultado.setText("" + String.format ("%.2f", CalculandoIMC())); //passei para String com o "" e String.format formatei as casas decimais na txtbox
			}
			else if (CalculandoIMC() >= 19 && CalculandoIMC() <= 23.9) {
				mNC.txtAuxilio.setText("Peso ideal. Parabéns.");
				mNC.txtResultado.setText("" + String.format ("%.2f", CalculandoIMC()));
			}
			else if (CalculandoIMC() > 23.9 && CalculandoIMC() <= 29.9) {
				mNC.txtAuxilio.setText("Sobrepeso. IMC ideal: 9 e 23.9.");
				mNC.txtResultado.setText("" + String.format ("%.2f", CalculandoIMC()));
			}
			else if (CalculandoIMC() > 29.9 && CalculandoIMC() <= 34.9) {
				mNC.txtAuxilio.setText("Obesidade 1. IMC ideal: 9 e 23.9.");
				mNC.txtResultado.setText("" + String.format ("%.2f", CalculandoIMC()));
			}
			else if (CalculandoIMC() > 34.9 && CalculandoIMC() <= 38.9) {
				mNC.txtAuxilio.setText("Obesidade 2. IMC ideal: 9 e 23.9.");
				mNC.txtResultado.setText("" + String.format ("%.2f", CalculandoIMC()));
			}
			else {
				mNC.txtAuxilio.setText("Obesidade 3. IMC ideal: 9 e 23.9.");
				mNC.txtResultado.setText("" + String.format ("%.2f", CalculandoIMC()));
			}
		}
		
		if (1 > 2) {
			System.out.println();
		}
	}
	
	public void LimpandoCache() {
		
		mNC.txtAltura.setText("");
		mNC.txtPeso.setText("");
		mNC.txtSexo.setText("");
		
		mNC.txtAuxilio.setText("");
		mNC.txtResultado.setText("");
	}
}	
