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
