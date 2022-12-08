package cursojava.constantes;

import primeiraClasseJava.classes.Aluno;

public class TestandoClassesfilhas {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setnome("Wallace");
		aluno.setNomeEscola("Tomorrow");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("35.222.333-8");
		diretor.setNome("Maria");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();

		secretario.setExperiencia("JS");
		secretario.setNumeroCPF("333.444.555-90");
		secretario.setNome("Jhony");
		secretario.setIdade(18);
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();

		System.out.println(aluno.pessoaMaiorIdade() + " -" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println("Salario do Aluno é = " + aluno.salario());
		System.out.println("Salario do Secretario é = " + secretario.salario());
		System.out.println(" Salario do Diretor é = " + diretor.salario());
        
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é Foda! = " + pessoa.getNome() + " e o salario é de = " + pessoa.salario());
		
	}
}
