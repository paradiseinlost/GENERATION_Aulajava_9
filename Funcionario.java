package Aulajava9;

public class Funcionario {
	//declaração de atributos de classe
	
	private String nomeFuncionario;
	private String cargo;
	private int idade;
	private int matricula;
	private String genero;
	private String gerente;
	
	
	public Funcionario(String nomeFuncionario, String cargo, int idade, int matricula, String genero, String gerente) {
		super();
		
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.idade = idade;
		this.matricula = matricula;
		this.genero = genero;
		this.gerente = gerente;
	}
	
	public Funcionario() {		
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public void visualizar () {
		
	System.out.println("\nNome da pessoa colaboradore : "+nomeFuncionario);	
	System.out.println("\nCargo do colaboradore : "+cargo);	
	System.out.println("\nIdade do colaboradore : "+idade);	
	System.out.println("\nMatricula do colaboradore : "+matricula);	
	System.out.println("\nGenrero do colaboradore : "+genero);	
	System.out.println("\nGerente do colaboradore : "+gerente);	
		}

	
	
}
