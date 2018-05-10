package com.java.augusto.business;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Menu {

	private Biblioteca biblioteca;
	private GerenciaEmprestimo gerenciaemprestimo;
	private CadastroPessoas cadastropessoas;

	public Menu() {

		biblioteca = new Biblioteca();
		biblioteca.carregaDadosLivros();
		Livro.numID = biblioteca.getLivrosBiblioteca().size();
		gerenciaemprestimo = new GerenciaEmprestimo();
		gerenciaemprestimo.carregaDadosEmprestimo();
		Emprestimo.geraID = gerenciaemprestimo.getEmprestimos().size();
		cadastropessoas = new CadastroPessoas();
		cadastropessoas.carregaDadosPessoa();
	}

	public void inicializa() {
		while (true) {
			System.out.println(
					"Bem vindo a biblioteca!\n\nDeseja cadastrar um Livro?[C]\n\nDeseja remover algum livro?[R]\n\n"
							+ "Deseja visualizar os Livros?[V]\n\nDeseja buscar um Livro?[B]\n\nDeseja retirar algum livro?[E]\n\nDeseja devolver um Livro?[D]\n\n"
							+ "Deseja renovar um Emprestimo de Livro?[W]\n\nVer historico de locação de livros[H]\n\n"
							+ "Deseja ver o Top10 clientes?[T]\n\nSair.[S]");

			Scanner scannermenu = new Scanner(System.in);
			String leropcaomenu = scannermenu.nextLine();

			switch (leropcaomenu) {

			case "C":
				cadastra();
				break;
			case "R":
				remove();
				break;
			case "V":
				verlista();
				break;
			case "B":
				buscarLivro();
				break;
			case "E":
				retiraLivro();
				break;
			case "D":
				devolveLivro();
				break;
			case "W":
				renovaEmprestimo();
				break;
			case "H":
				verHistorico();
				break;
			case "T":
				verTop10();
				break;
			case "S":
				biblioteca.guardaDadosLivros();
				gerenciaemprestimo.gravaDadosEmprestimo();
				cadastropessoas.guardaDadosPessoa();
				System.exit(0);
			default:
				System.out.println("Opcao Invalida!\n ");
			}
		}
	}

	public void verTop10() {
		cadastropessoas.ordenaTop10();
		for (Pessoa pessoa : cadastropessoas.getCLientes()) {
			for (int top = 0; top < 10; top++) {
				System.out.println(top + 1 + "- " + pessoa.getNome());
			}
			break;
		}
	}

	public void verHistorico() {

		System.out.println("Informe o titulo do Livro:\n ");
		Scanner scannertitulo = new Scanner(System.in);
		String lerDoTecladoTitulo = scannertitulo.nextLine();
		System.out.println("O livro " + lerDoTecladoTitulo + " ja foi retirado por: ");
		for (Pessoa pessoa : biblioteca.buscaLivroTitulo(lerDoTecladoTitulo).getHistorico()) {
			System.out.println(pessoa.toString());
		}
	}

	public void renovaEmprestimo() {

		System.out.println("Informe o titulo do Livro:\n ");
		Scanner scannertitulo = new Scanner(System.in);
		String lerDoTecladoTitulo = scannertitulo.nextLine();

		gerenciaemprestimo.renovaEmprestimo(lerDoTecladoTitulo);
		System.out.println("Emprestimo Renovado.");
	}

	public void devolveLivro() {

		System.out.println("Informe o titulo do Livro:\n ");
		Scanner scannertitulo = new Scanner(System.in);
		String lerDoTecladoTitulo = scannertitulo.nextLine();

		gerenciaemprestimo.devolveLivro(biblioteca.buscaLivroTitulo(lerDoTecladoTitulo));
	}

	public void retiraLivro() {

		System.out.println("Informe o titulo do Livro:\n ");
		Scanner scannertitulo = new Scanner(System.in);
		String lerDoTecladoTitulo = scannertitulo.nextLine();

		System.out.println("Informe o nome do usuario:\n ");
		Scanner scannernome = new Scanner(System.in);
		String lerDoTecladonome = scannernome.nextLine();

		gerenciaemprestimo.novoEmprestimo(cadastropessoas.buscaPessoaPorNome(lerDoTecladonome),
				biblioteca.buscaLivroTitulo(lerDoTecladoTitulo));
	}

	public void cadastra() {

		System.out.println("Informe o titulo do Livro:\n ");
		Scanner scannertitulo = new Scanner(System.in);
		String lerDoTecladoTitulo = scannertitulo.nextLine();

		System.out.println("Informe o autor do Livro:\n ");
		Scanner scannerautor = new Scanner(System.in);
		String lerDoTecladoAutor = scannerautor.nextLine();

		biblioteca.adicionaLivro((new Livro(lerDoTecladoTitulo, lerDoTecladoAutor, false)));
		System.out.println("Novo livro cadastrado.");
	}

	public void remove() {
		System.out.println("Informe o Id do Livro:\n ");
		Scanner scannerId = new Scanner(System.in);
		int lerDoTecladoId = scannerId.nextInt();

		biblioteca.excluiLivro(lerDoTecladoId);
		System.out.println("Livro removido.");
	}

	public void verlista() {
		if (biblioteca.getLivrosBiblioteca().isEmpty()) {
			System.out.println("Lista de Livros vazia.\n");
		}
		for (Livro livro : biblioteca.getLivrosBiblioteca()) {
			System.out.println(livro.toString());
		}
	}

	public void buscarLivro() {
		System.out.println("Deseja buscar por Autor ou por Titulo? [T = titulo ou A = Autor]\n");

		Scanner scannerId = new Scanner(System.in);
		String leropcao = scannerId.nextLine();

		switch (leropcao) {
		case "T":
			System.out.println("Informe o Titulo do Livro:\n ");
			Scanner scannertitulo = new Scanner(System.in);
			String lerDoTecladoNome = scannertitulo.nextLine();
			System.out.println(biblioteca.buscaLivroTitulo((lerDoTecladoNome)));
			break;

		case "A":
			System.out.println("Informe o Autor do Livro:\n ");
			Scanner scannerautor = new Scanner(System.in);
			String lerDoTecladoAutor = scannerautor.nextLine();
			System.out.println(biblioteca.buscaLivroAutor((lerDoTecladoAutor)));
			break;
		}
	}
}