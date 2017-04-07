package business;

public class Cliente {
	private String nome;
	private int CPF;
	private int idade;
	private boolean genero;
	private boolean socio;
	private int numeroSocio;
	
	
	public Cliente(String nome, int CPF, int idade, boolean genero){
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
		this.genero = genero;
	}
	public Cliente(String nome, int CPF, int idade, boolean genero, int numeroSocio){
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
		this.genero = genero;
		this.numeroSocio = numeroSocio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	public int getNumeroSocio() {
		return numeroSocio;
	}
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	public int getCPF() {
		return CPF;
	}
	
}
