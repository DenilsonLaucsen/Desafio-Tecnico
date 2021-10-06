package questão01;

public class Main {

	public static void main(String[] args) {

		Prova prova1 = new Prova(4, 2.5);
		Prova prova2 = new Prova(1, 7);
		Aluno aluno1 = new Aluno(prova1, prova2);

		Prova prova3 = new Prova(6.5, 3.5);
		Prova prova4 = new Prova(0, 3);
		Aluno aluno2 = new Aluno(prova3, prova4);
		
		Prova prova5 = new Prova(5, 4);
		Prova prova6 = new Prova(6, 1.5);
		Aluno aluno3 = new Aluno(prova5, prova6);
		
		Turma turma1 = new Turma(aluno1, aluno2, aluno3);
		
		System.out.println("A média do aluno 1 é: " + aluno1.calcularMedia());
		System.out.println("A média do aluno 2 é: " + aluno2.calcularMedia());
		System.out.println("A média do aluno 3 é: " + aluno3.calcularMedia());
		
		System.out.println("A média da turma 1 é: " + turma1.calcularMedia());

	}

}
