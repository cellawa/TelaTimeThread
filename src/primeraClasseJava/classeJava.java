package primeraClasseJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import primeiraClasseJava.classes.Aluno;
import primeiraClasseJava.classes.Disciplina;

//
public class classeJava {
	/* Obejeto ainda nao existe na memoria */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new aluno(); é uma instância (Criação de Obejeto) */ /* aluno1 é uma referencia para o objeto Aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?" + qtd + "?");
			
			 /* String idade = JOptionPane.showInputDialog("Qual é a idade?"); String
			  nascimento = JOptionPane.showInputDialog("Qual é a data de nascimento?");
			  String rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			  JOptionPane.showInputDialog("Qual é o cpf?"); String mae =
			  JOptionPane.showInputDialog("Qual é o nome da Mãe?"); String pai =
			  JOptionPane.showInputDialog("Qual é o nome do pai?"); String DataMatricula =
			  JOptionPane.showInputDialog("Qual é a data da Matricula?"); String
			  SerieMatriculada = JOptionPane.showInputDialog("Qual é a Serie?"); String
			  Data = JOptionPane.showInputDialog("Qual é a data?"); String NomeEscola =
			  JOptionPane.showInputDialog("Qual é a Escola?");
			 */

			/*
			 * String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?"); String
			 * nota1 = JOptionPane.showInputDialog("nota1");
			 * 
			 * String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?"); String
			 * nota2 = JOptionPane.showInputDialog("nota2");
			 * 
			 * String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?"); String
			 * nota3 = JOptionPane.showInputDialog("nota3");
			 * 
			 * String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?"); String
			 * nota4 = JOptionPane.showInputDialog("nota4");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui será para João */

			aluno1.setnome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(nascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCPF(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(DataMatricula);
			 * aluno1.setSerieMatriculado(SerieMatriculada); aluno1.setData(Data);
			 * aluno1.setNomeEscola(NomeEscola);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (escolha == 0) { /* Opçao sim e 0 */
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showInternalConfirmDialog(null, "Deseja continuar a remover ?");
				}
			}
			alunos.add(aluno1);
		}
		
		for (int pos = 0; pos < alunos.size(); pos ++ ) {
			Aluno aluno = alunos.get(pos);
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média = " + aluno.getMedianota());
			System.out.println(" RESULTADO = " + aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------------------------------------");
			
			for (Disciplina disc : aluno.getDisciplinas()) {
				System.out.println(" Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
				
				
			}
			
		}

	
				
			}

		
		}
	

