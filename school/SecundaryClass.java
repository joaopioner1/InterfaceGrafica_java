package school;

public class SecundaryClass {
	
	final MainClass mN;
	
	 public SecundaryClass(MainClass mn) { // recebe a tela como parâmetro ao invés de instanciar novamente
	        this.mN = mn;
	    }
	
	 public double CalculaMedia() {
		
		double a = Double.parseDouble(mN.txtNumber1.getText());
		double b = Double.parseDouble(mN.txtNumber2.getText());
		double c = Double.parseDouble(mN.txtNumber3.getText());
		
		return (a + b + c) / 3;
	}
	 
	 public void ShowData() {
		
		 mN.txtMedia.setText(String.valueOf(CalculaMedia())); //Mostra o texto na tela

		 double d = Double.parseDouble(mN.txtInputAverage.getText()); // transforma a txtbox de String para double
		 if (CalculaMedia() >= d) {
			 mN.txtSituacao.setText("Aluno aprovado!");
		 } else {
			 mN.txtSituacao.setText("Aluno reprovado!");
		 }
	 }
}
