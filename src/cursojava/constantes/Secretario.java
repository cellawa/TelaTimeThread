package cursojava.constantes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
	}

	public Secretario() {
		// TODO Auto-generated constructor stub
	}

	public String getRegistro() {

		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1700;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
		
	}

	@Override
	public boolean autenticar() {
		
		
		return login.equals("admin") && senha.equals("admin");
		
	}


	}


