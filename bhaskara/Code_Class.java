package bhaskara;

import javax.swing.JOptionPane;

public class Code_Class {

	final Tela tl;

	public Code_Class(Tela tL) { // recebe a tela como parâmetro ao invés de instanciar novamente
		this.tl = tL;
	}

	// Metodo que calcula o x
	public double CalculaX() {

		double a = Double.parseDouble(tl.txtA.getText().replaceAll(",", "."));
		double b = Double.parseDouble(tl.txtB.getText().replaceAll(",", "."));
		double c = Double.parseDouble(tl.txtC.getText().replaceAll(",", "."));

		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double x = (-b + delta) / 2 * a;
		
		if (delta < 0) {
			return JOptionPane.showConfirmDialog(null, "Raíz negativa! Não é possível efetuar operação.");
		} else {
			return x;
		}
	}

	// Metodo que calcula o y
	public double CalculaY() {

		double a = Double.parseDouble(tl.txtA.getText().replaceAll(",", "."));
		double b = Double.parseDouble(tl.txtB.getText().replaceAll(",", "."));
		double c = Double.parseDouble(tl.txtC.getText().replaceAll(",", "."));

		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double y = (-b - delta) / 2 * a;

		if (delta < 0) {
			return JOptionPane.showConfirmDialog(null, "Raíz negativa! Não é possível efetuar operação.");
		} else {
			return y;
		}
	}

	public void MostrandoDados() {

		tl.txtX.setText("" + CalculaX());
		tl.txtY.setText("" + CalculaY());
	}

	public void LimparCampos() {

		tl.txtA.setText("");
		tl.txtB.setText("");
		tl.txtC.setText("");
		tl.txtX.setText("");
		tl.txtY.setText("");

	}
}
