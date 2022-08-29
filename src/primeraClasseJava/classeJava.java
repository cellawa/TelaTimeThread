package primeraClasseJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;
import primeiraClasseJava.classes.Aluno;
import primeiraClasseJava.classes.Disciplina;

//
public class classeJava {

	/* Obejeto ainda nao existe na memoria */
	public static void main(String[] args) {

		/*
		 * Hashmap é uma liasta que dentro dela temos uma chave que identifica uma
		 * sequencia de valores também
		 * 
		 * 
		 */
		
		String login = JOptionPane.showInputDialog("Informe o Login ");
		String senha = JOptionPane.showInputDialog("Informe a Senha ");
		
		if (login.equalsIgnoreCase("admin") &&
			senha.equalsIgnoreCase("admin")) {
				
			}
			
		

		List<Aluno> alunos = new ArrayList<Aluno>();

		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 3; qtd++) {

			/* new aluno(); é uma instância (Criação de Obejeto) */ /* aluno1 é uma referencia para o objeto Aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?" + qtd + "?");

			/*
			 * String idade = JOptionPane.showInputDialog("Qual é a idade?"); String
			 * nascimento = JOptionPane.showInputDialog("Qual é a data de nascimento?");
			 * String rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual é o cpf?"); String mae =
			 * JOptionPane.showInputDialog("Qual é o nome da Mãe?"); String pai =
			 * JOptionPane.showInputDialog("Qual é o nome do pai?"); String DataMatricula =
			 * JOptionPane.showInputDialog("Qual é a data da Matricula?"); String
			 * SerieMatriculada = JOptionPane.showInputDialog("Qual é a Serie?"); String
			 * Data = JOptionPane.showInputDialog("Qual é a data?"); String NomeEscola =
			 * JOptionPane.showInputDialog("Qual é a Escola?");
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

			for (int pos = 1; pos <= 3; pos++) {
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
			alunos.add(aluno1);/* separei em listas */

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);

				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);

				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO))
					maps.get(StatusAluno.REPROVADO).add(aluno);

			}

		}
		System.out.println("---------------Lista dos aprovados --------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado =  " + aluno.getNome() + aluno.getAlunoAprovado2() + " com media de = "
					+ aluno.getMedianota());

		}
		System.out.println("---------------Lista dos Recuperacao --------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado =  " + aluno.getNome() + aluno.getAlunoAprovado2() + " com media de = "
					+ aluno.getMedianota());

		}
		System.out.println("---------------Lista dos Reprovados --------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado =  " +  "" +  aluno.getNome() + aluno.getAlunoAprovado2() + " com media de = "
					+ aluno.getMedianota());
		}
	}
}
