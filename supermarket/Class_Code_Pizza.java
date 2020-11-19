package supermarket;

public class Class_Code_Pizza {
	
	final Food_Frame_Pizza buying;

	public Class_Code_Pizza(Food_Frame_Pizza buy) { // recebe a tela como parâmetro ao invés de instanciar novamente
		this.buying = buy;
	}
	
	public void ValorProduto() {
		
		int a = Integer.parseInt(buying.txtQuantidadePizza.getText()); //Passa para numero inteiro
		double calculandoPreco = a * 2.00;
		
		buying.txtValorTotal.setText("" + calculandoPreco);
	}
	
}
