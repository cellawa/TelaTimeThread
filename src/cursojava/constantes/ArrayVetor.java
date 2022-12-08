package cursojava.constantes;

import primeiraClasseJava.classes.Aluno;
import primeiraClasseJava.classes.Disciplina;


public class ArrayVetor {
	
	

	public static void main(String[] args) {
		double[] notas =  {8.8,9.7,7.6,6.8};
		double [] notasLogica = {7.1,5.7,9.6,7.8};
		
		/* Criação do Aluno*/
		Aluno aluno = new Aluno();
		aluno.setnome("Maria Vitoria da Silva Oliveira ");
		aluno.setNomeEscola("JdevTreinamanetos");
		
		
		// Criação da Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação com Java");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		/* Criação do Aluno*/
		Aluno aluno2 = new Aluno();
		aluno2.setnome("Maria Vitoria da Silva Oliveira");
		aluno2.setNomeEscola("JdevTreinamanetos");
		
		
		// Criação da Disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina2.setDisciplina("Curso de Spring");
		
		disciplina2.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Lógica de Programação com Java 2");
		disciplina4.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		
		//---------------------------------------------------------------------------------------
	
	Aluno[] arrayAlunos = new Aluno[2]; 
	arrayAlunos[0] = aluno;
	arrayAlunos[1] = aluno;
	
	for(int pos = 0; pos < arrayAlunos.length; pos ++) {
		
		System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
		
		for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da Disciplina é: " + d.getDisciplina());
			
			for(int posnota = 0; posnota < d.getNota().length; posnota ++) {
				System.out.println("A nota número : " + posnota + " é igual = " + d.getNota()[posnota]);
			}
		}
		
	}
			
	}
}

	


