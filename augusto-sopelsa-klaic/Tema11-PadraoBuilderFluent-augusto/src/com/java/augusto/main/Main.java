package com.java.augusto.main;

import java.time.LocalDate;

import com.java.augusto.business.Endereco;
import com.java.augusto.business.Pessoa;

public class Main{
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
						.adicionaNome("Augusto")
						.adicionaDataNascimento(LocalDate.now())
						.adicionaEndereco(new Endereco
								.EnderecoBuilder().adicionaRua("Santo Antonio")
								.adicionaNumero(123)
								.adiconaCidade("Porto Alegre")
								.adicionaEstado("Rio Grande do Sul")
								.criaEndereco())
						.CriaPessoa();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getDatanascimento());
		System.out.println(pessoa.getEndereco().toString());
	}
	
}