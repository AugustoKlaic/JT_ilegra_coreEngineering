package com.java.augusto.business;

import java.util.Scanner;

import com.java.augusto.business.*; 

public class Menu {

	private Agenda agenda;

	public Menu() {
		agenda = new Agenda();
	}

	public void inicializa() {
		while (true) {
			System.out.println("Bem vindo a Agenda!\n\nDeseja cadastrar alguem?[C]\n\nDeseja remover alguem?[R]\n\n"
					+ "Deseja visualizar os contato?[V]\n\nDeseja buscar um contato?[B]\n\nSair.[S]");

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
				buscarContato();
				break;
			case "S":
				System.exit(0);
			default:
				System.out.println("Opcao Invalida!\n ");
			}
		}
	}

	public void cadastra() {
		System.out.println("Informe o Id do contato:\n ");
		Scanner scannerId = new Scanner(System.in);
		int lerDoTecladoId = scannerId.nextInt();

		System.out.println("Informe o nome do contato:\n ");
		Scanner scannernome = new Scanner(System.in);
		String lerDoTecladoNome = scannernome.nextLine();

		System.out.println("Informe o email do contato:\n ");
		Scanner scanneremail = new Scanner(System.in); 
		String lerDoTecladoEmail = scanneremail.nextLine();

		System.out.println("Informe o telefone do contato:\n ");
		Scanner scannerfone = new Scanner(System.in);
		String lerDoTecladoFone = scannerfone.nextLine();

		agenda.adicionaContato(new Pessoa(lerDoTecladoId, lerDoTecladoNome, lerDoTecladoEmail, lerDoTecladoFone));
	}

	public void remove() {
		System.out.println("Informe o Id do contato:\n ");
		Scanner scannerId = new Scanner(System.in);
		int lerDoTecladoId = scannerId.nextInt();

		agenda.removeContato(lerDoTecladoId);
	}

	public void verlista() {
		if(agenda.getTodasContatos().isEmpty()) {
			System.out.println("Lista de contato vazia.\n");
		}
		for (Pessoa p : agenda.getTodasContatos()) {
			System.out.println(p.toString());
		}
	}

	public void buscarContato() {
		System.out.println("Deseja buscar por ID ou por Nome? [N = nome ou I = ID]\n");

		Scanner scannerId = new Scanner(System.in);
		String leropcao = scannerId.nextLine();

		switch (leropcao) {
		case "N":
			System.out.println("Informe o nome do contato:\n ");
			Scanner scannernome = new Scanner(System.in);
			String lerDoTecladoNome = scannernome.nextLine();
			System.out.println(agenda.buscaContatoPorNome(lerDoTecladoNome));
			break;

		case "I":
			System.out.println("Informe o Id do contato:\n ");
			Scanner scannerid = new Scanner(System.in);
			int lerDoTecladoId = scannerId.nextInt();
			System.out.println(agenda.buscaContatoPorId(lerDoTecladoId));
			break;
		}
	}
}
