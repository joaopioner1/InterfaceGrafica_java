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
	 
	 public void ShowPanel() {
		 
		 mN.pane1.setVisible(false); //nao mostra o painel
		 mN.pane2.setVisible(true); //mostra o painel
		 mN.txtAverage.setText(String.valueOf(CalculaMedia())); //Mostra o texto na tela
	 }
}
