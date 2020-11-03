package view;

public class SecClass {
	
		TelaCalc tl = new TelaCalc();
		
		String a = tl.txtNumber1.getText();
		String b = tl.txtNumber1_.getText();
		String f = tl.txtNumber2.getText();
		String g = tl.txtNumber2_.getText();
		String j = tl.txtNumber3.getText();
		String k = tl.txtNumber3_.getText();
		String n = tl.txtNumber4.getText();
		String o = tl.txtNumber4_.getText();
		
		double c = Integer.parseInt(a);
		double d = Integer.parseInt(b);
		double h = Integer.parseInt(f);
		double i = Integer.parseInt(g);
		double l = Integer.parseInt(j);
		double m = Integer.parseInt(k);
		double p = Integer.parseInt(n);
		double q = Integer.parseInt(o);
		
		//Metodos
		public double soma() {
			return c + d;
		}
		
		public double min() {
			return h - i;
		}
		
		public double mul() {
			return l * m;
		}
		
		public double div() {
			return p / q;
		}
			
		public void LimparCache() {
			
			tl.txtResult1.setText("");
			tl.txtResult2.setText("");
			tl.txtResult3.setText("");
			tl.txtResult4.setText("");
			tl.txtNumber1.setText("");
			tl.txtNumber1_.setText("");
			tl.txtNumber2.setText("");
			tl.txtNumber2_.setText("");
			tl.txtNumber3.setText("");
			tl.txtNumber3_.setText("");
			tl.txtNumber4.setText("");
			tl.txtNumber4_.setText("");
		}
		
	}

