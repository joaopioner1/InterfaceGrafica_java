package view;

public class SecClass {

    final TelaCalc tela;

    public SecClass(TelaCalc tl) { // recebe a tela como parâmetro ao invés de instanciar novamente
        this.tela = tl;
    }

    public double dividir() {
        double a = Double.parseDouble(tela.txtDivisao1.getText());
        double b = Double.parseDouble(tela.txtDivisao2.getText());
        return a / b;
    }

    public void limparCache() {
        tela.txtSoma1.setText("");
        tela.txtSoma2.setText("");
        tela.txtSomaResult.setText("");

        tela.txtSubtracao1.setText("");
        tela.txtSubtracao2.setText("");
        tela.txtSubtracaoResult.setText("");

        tela.txtMultiplicacao1.setText("");
        tela.txtMultiplicacao2.setText("");
        tela.txtMultiplicacaoResult.setText("");

        tela.txtDivisao1.setText("");
        tela.txtDivisao2.setText("");
        tela.txtDivisaoResult.setText("");
    }

    public double multiplicar() {
        double a = Double.parseDouble(tela.txtMultiplicacao1.getText());
        double b = Double.parseDouble(tela.txtMultiplicacao2.getText());
        return a * b;
    }

    public double somar() {
        double a = Double.parseDouble(tela.txtSoma1.getText());
        double b = Double.parseDouble(tela.txtSoma2.getText());
        return a + b;
    }

    public double subtrair() {
        double a = Double.parseDouble(tela.txtSubtracao1.getText());
        double b = Double.parseDouble(tela.txtSubtracao2.getText());
        return a - b;
    }
}