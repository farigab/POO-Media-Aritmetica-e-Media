package view;

import java.util.List;

import javax.swing.JOptionPane;

import entity.Aluno;

public class OutputAluno {
	
	public void imprimirAluno(Aluno a) {
		JOptionPane.showMessageDialog(null, a.toString());
	}
	
	public void imprimirAlunos(List<Aluno> alunos) {
		JOptionPane.showMessageDialog(null, alunos);
	}

}
