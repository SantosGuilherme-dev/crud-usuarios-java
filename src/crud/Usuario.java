package crud;

/**
 * Classe que representa um Usuário no sistema CRUD.
 * 
 * Esta classe é um modelo (Model) simples contendo os atributos
 * básicos de um usuário e seus métodos de acesso (getters e setters).
 * 
 * O objetivo é demonstrar conceitos de Programação Orientada a Objetos,
 * como encapsulamento.
 */
public class Usuario {

	// Atributos privados para garantir encapsulamento
	private String nome;
	private String email;
	private String numero;
	
	/**
	 * Construtor da classe Usuario
	 * 
	 * @param nome nome do usuário
	 * @param email email do usuário
	 * @param numero número de telefone do usuário
	 */
	public Usuario(String nome, String email, String numero) {
		super();
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}
	
	// ================= GETTERS =================
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNumero() {
		return numero;
	}
	
	// ================= SETTERS =================
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
}

