package questao01;

public class Prova {

	private double notaParte1;
	private double notaParte2;

	public Prova(double notaParte1, double notaParte2) {
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
	}

	
	// Caso a nota ultrapasse o valor 10, a nota ser� dada como 10.
	// Caso a nota seja de valor negativo, a nota ser� dada como 0.
	public double calcularNotaTotal() {
		if (notaParte1 + notaParte2 > 10) {
			return 10;
		} else {
			if (notaParte1 + notaParte2 < 0) {
				return 0;
			} else {
				return notaParte1 + notaParte2;
			}
		}
	}

}
