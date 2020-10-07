package main;

import controll.LoopAluno;
import view.OutputAluno;

public class Main {
	
	public static void main(String[] args) {
		try {
			OutputAluno oa = new OutputAluno();
			
			oa.imprimirAlunos(LoopAluno.loop());
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Error" + ex.getMessage());
		}
	}
}
