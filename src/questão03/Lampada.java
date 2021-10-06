package questão03;

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
			System.out.println("Lâmpada ligada");
		}
		if (this.ligada.equals("desligada")) {
			System.out.println("Lâmpada desligada");
		}
	}
	
	
}
