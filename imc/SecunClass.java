package imc;

public class SecunClass {
	
	final ImcMainClass mNC;

	public SecunClass(ImcMainClass mnC) { // recebe a tela como parâmetro ao invés de instanciar novamente
		this.mNC = mnC;
	}
	
	public double CalculandoIMC() {
		
		double peso = Double.parseDouble(mNC.txtPeso.getText().replaceAll(",", ".")); //replaceAll serve para alterar caracteres
		double altura = Double.parseDouble(mNC.txtAltura.getSelectedText().replaceAll(",", "."));
		
		return peso / (Math.pow(altura, 2)); 
	}
	
	public void VerificandoIMC() {
		
		if (mNC.txtSexo.getText().equals("F")) {
			if (CalculandoIMC() < 19) {
				mNC.txtAuxilio.setText("Magreza. Seu IMC deveria ser entre 19 e 23.9");
				mNC.txtResultado.setText("" + CalculandoIMC()); //passei para String
			}
		}
	}
}	
