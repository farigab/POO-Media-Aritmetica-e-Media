package view;

import javax.swing.JOptionPane;


public class InputAluno {

	public String lerMatricula() throws Exception {
		String matricula = JOptionPane.showInputDialog("Digite a matricula do aluno:");
		return matricula;
	}

	public String lerNome() throws Exception {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		return nome;
	}

	public String lerDisciplina() throws Exception {
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina do aluno:");
		return disciplina;
	}

	public Double lerNota1() throws Exception {
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno:");
		return Double.parseDouble(nota1);
	}

	public Double lerPeso1() throws Exception {
		String peso1 = JOptionPane.showInputDialog("Digite o peso da peso1");
		return Double.parseDouble(peso1);
	}

	public Double lerNota2() throws Exception {
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota do aluno:");
		return Double.parseDouble(nota2);
	}

	public Double lerPeso2() throws Exception {
		String peso2 = JOptionPane.showInputDialog("Digite o peso da peso2");
		return Double.parseDouble(peso2);
	}

//	public static void main(String[] args) {
//		try {
//			InputAluno ia = new InputAluno();
//			OutputAluno oa = new OutputAluno();
//			Aluno a = new Aluno(ia.lerMatricula(), ia.lerNome(), ia.lerDisciplina(), ia.lerNota1(), ia.lerPeso1(),
//					ia.lerNota2(), ia.lerPeso2());
//
//			a.gerarMedia();
//			a.gerarPeso();
//			a.gerarPeso();
//			a.gerarMediaPonderada();
//
//			oa.imprimirAluno(a);
//
//		} catch (Exception ex) {
//			System.out.println("Error" + ex.getMessage());
//		}
//	}

}
