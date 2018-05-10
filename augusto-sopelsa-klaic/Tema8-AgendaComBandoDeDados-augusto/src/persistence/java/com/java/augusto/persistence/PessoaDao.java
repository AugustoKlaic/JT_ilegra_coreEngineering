package com.java.augusto.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.augusto.business.Pessoa;

public class PessoaDao {

	public List<Pessoa> carregaDadosDoBanco() {

		Connection connection = ConexaoBanco.abrir();
		String sql = "select * from Pessoa;";
		List<Pessoa> pessoasbanco = new ArrayList<Pessoa>();

		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoasbanco.add(new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone")));
			}
			resultset.close();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoasbanco;
	}

	public List<Pessoa> buscaContatoPorNome(String nome) {

		Connection connection = ConexaoBanco.abrir();
		String sql = "select * from Pessoa where nome like '%" + nome + "%';";
		List<Pessoa> pessoasbanco = new ArrayList<Pessoa>();

		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoasbanco.add(new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone")));
			}
			resultset.close();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoasbanco;
	}

	public Pessoa buscaContatoPorId(int id) {
		Connection connection = ConexaoBanco.abrir();
		String sql = "select * from Pessoa where id = " + id + ";";
		Pessoa pessoaaux = null;

		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoaaux = new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone"));
			}
			resultset.close();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoaaux;
	}

	public void adicionaContato(Pessoa pessoa) {
		Connection connection = ConexaoBanco.abrir();
		String sql = "insert into Pessoa(nome,email,telefone) values('" + pessoa.getNome() + "','" + pessoa.getEmail()
				+ "','" + pessoa.getTelefone() + "');";
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			int resultset = pstm.executeUpdate();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeContato(int id) {
		Connection connection = ConexaoBanco.abrir();
		String sql = "delete from Pessoa where id = " + id + ";";

		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			int resultset = pstm.executeUpdate();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}