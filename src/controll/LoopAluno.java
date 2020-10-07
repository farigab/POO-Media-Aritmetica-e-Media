package controll;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entity.Aluno;
import view.InputAluno;

public class LoopAluno {
	
	public static List<Aluno> loop() throws Exception {
		List<Aluno> lista = new ArrayList<Aluno>();
		String op="";
		do {
			InputAluno ia = new InputAluno();
			Aluno a = new Aluno(ia.lerMatricula(), ia.lerNome(), ia.lerDisciplina(), ia.lerNota1(), ia.lerPeso1(),
					ia.lerNota2(), ia.lerPeso2());
			a.gerarMedia();
			a.gerarPeso();
			a.gerarMediaPonderada();
			lista.add(a);
			
			op=JOptionPane.showInputDialog("Digite SIM/sim para fim");
		}while(!op.equalsIgnoreCase("sim"));
		return lista;
	}
	
//	public static void main(String[] args) {
//		try {
//			OutputAluno oa = new OutputAluno();
//			
//			oa.imprimirAlunos(LoopAluno.loop());;
//
//			
//		}catch(Exception ex) {
//			System.out.println("Error" + ex.getMessage());
//		}
//	}
		

}
