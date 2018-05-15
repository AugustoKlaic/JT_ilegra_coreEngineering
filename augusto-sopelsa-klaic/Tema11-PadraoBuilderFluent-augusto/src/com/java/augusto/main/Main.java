package com.java.augusto.main;

import java.time.LocalDate;

import com.java.augusto.business.Endereco;
import com.java.augusto.business.Pessoa;

public class Main{
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
						.adicionaNome("Augusto")
						.adicionaDataNascimento(LocalDate.now())
						.adicionaEndereco("Santo Antonio",123,"Porto Alegre","Rio Grande do Sul")
						.CriaPessoa();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getDatanascimento());
		System.out.println(pessoa.getEndereco().toString());
	}
	
}