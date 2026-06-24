package crud;

import java.util.Scanner;

/**
 * Classe principal do sistema CRUD.
 * 
 * Responsável por exibir o menu no console e interagir com o usuário,
 * chamando as operações da camada de serviço (UsuarioService).
 * 
 * Este projeto simula um sistema simples de cadastro de usuários
 * utilizando Java puro e armazenamento em memória (List).
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		UsuarioService service = new UsuarioService();
		
		int opcao;
		
		// Loop principal do menu (executa até o usuário sair)
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Cadastrar usuário");
			System.out.println("2 - Listar usuários");
			System.out.println("3 - atualizar usuário");
			System.out.println("4 - Remover usuário");
			System.out.println("0 - Sair");
			
			opcao = entrada.nextInt();
			entrada.nextLine(); // limpar buffer
			
			switch (opcao) {
			
			// ================= CREATE =================
			case 1: 
				System.out.print("Nome:");
				String nome = entrada.nextLine();
				
				System.out.print("\nEmail:");
				String email = entrada.nextLine();
				
				System.out.print("\nContato:");
				String numero = entrada.nextLine();
				
				// Criação do objeto usuário e envio para o service
				Usuario u = new Usuario(nome, email, numero);
				service.adicionarUsuarios(u);
				break;
			
			// ================= READ =================
			case 2:
				service.listarUsuarios();
				break;
			
			// ================= UPDATE =================
			case 3: 
				System.out.print("Digite o índice: ");
				int i = entrada.nextInt();
				entrada.nextLine();
				
				System.out.print("Novo nome: ");
				String novoNome = entrada.nextLine();
				
				System.out.print("Novo email: ");
				String novoEmail = entrada.nextLine();
			
				System.out.print("Novo contato: ");
				String novoNumero = entrada.nextLine();
			
				service.atualizarUsuarios(i, novoNome, novoEmail, novoNumero);
				break;
			
			// ================= DELETE =================
			case 4:
				System.out.println("Digite o índice: ");
				int remover = entrada.nextInt();
				
				service.removerUsuarios(remover);
				break;
		}
			
		}while(opcao != 0);
		
		entrada.close();
		
	}
}
