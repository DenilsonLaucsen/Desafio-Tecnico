package questao03;

public class Lampada {

	private String ligada;

	public Lampada(String ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		this.ligada = "ligada";
		imprimir();
	}
	
	public void desligar() {
		this.ligada = "desligada";
		imprimir();
	}
	
	public void imprimir() {
		if (this.ligada.equals("ligada")) {
			System.out.println("L�mpada ligada");
		}
		if (this.ligada.equals("desligada")) {
			System.out.println("L�mpada desligada");
		}
	}
	
	
}
