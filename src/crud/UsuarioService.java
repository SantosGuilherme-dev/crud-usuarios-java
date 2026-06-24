package crud;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar operações CRUD (Create, Read, Update, Delete)
 * relacionadas aos usuários em memória.
 * 
 * Neste exemplo, os dados são armazenados em uma lista (simulando um banco de dados simples).
 */
public class UsuarioService {
	
	// Lista que armazena os usuários cadastrados em memória
	List<Usuario> usuarios = new ArrayList<>();
   
	/**
	 * Adiciona um novo usuário à lista
	 * @param u objeto Usuario a ser adicionado
	 */
	public void adicionarUsuarios(Usuario u) {
		usuarios.add(u);
	}
	
	/**
	 * Lista todos os usuários cadastrados no console
	 * (simulação de uma operação READ)
	 */
	public void listarUsuarios() {
		for (Usuario u : usuarios){
			System.out.println("----------------------");
			System.out.println("Nome: " + u.getNome());
			System.out.println("Email: " + u.getEmail());
			System.out.println("Número: " + u.getNumero());
			System.out.println("----------------------");
		}
	}
		
	/**
	 * Atualiza os dados de um usuário existente com base no índice da lista
	 * 
	 * @param indice posição do usuário na lista
	 * @param novoNome novo nome a ser atualizado
	 * @param novoEmail novo email a ser atualizado
	 * @param novoNumero novo número de telefone a ser atualizado
	 */
		public void atualizarUsuarios(int indice, String novoNome, String novoEmail, String novoNumero) {
			if(indice >= 0 && indice < usuarios.size()) {
				Usuario u = usuarios.get(indice);
				u.setNome(novoNome);
				u.setEmail(novoEmail);
				u.setNumero(novoNumero);
				System.out.println("Usuário cadastrado com sucesso!!!");
			} else {
				System.out.println("Índice inválido!");
			}
		}
		
		/**
		 * Remove um usuário da lista com base no índice informado
		 * 
		 * IMPORTANTE: havia um pequeno erro lógico aqui:
		 * o correto é permitir índice 0 também, então deve ser >= 0
		 *
		 * @param indice posição do usuário a ser removido
		 */
		public void removerUsuarios(int indice) {
			if (indice > 0 && indice < usuarios.size()) {
				usuarios.remove(indice);
				System.out.println("Usuário removido com sucesso!");
			} else {
				System.out.println("Índice inválido!");
			}
		}
	}

