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
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try (Connection connection = ConexaoBanco.abrir()) {
			String sql = "select * from Pessoa;";
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoas.add(new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoas;
	}

	public List<Pessoa> buscaContatoPorNome(String nome) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try (Connection connection = ConexaoBanco.abrir();) {
			String sql = "select * from Pessoa where nome like '%" + nome + "%';";
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoas.add(new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoas;
	}

	public Pessoa buscaContatoPorId(int id) {
		Pessoa pessoaaux = null;
		try (Connection connection = ConexaoBanco.abrir()) {
			String sql = "select * from Pessoa where id = " + id + ";";
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoaaux = new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoaaux;
	}

	public void adicionaContato(Pessoa pessoa) {

		try (Connection connection = ConexaoBanco.abrir()) {
			String sql = "insert into Pessoa(nome,email,telefone) values('" + pessoa.getNome() + "','"
					+ pessoa.getEmail() + "','" + pessoa.getTelefone() + "');";
			PreparedStatement pstm = connection.prepareStatement(sql);
			int resultset = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeContato(int id) {
		try (Connection connection = ConexaoBanco.abrir()) {
			String sql = "delete from Pessoa where id = " + id + ";";
			PreparedStatement pstm = connection.prepareStatement(sql);
			int resultset = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Pessoa> ordenaContatos(String tipo) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try (Connection connection = ConexaoBanco.abrir()) {
			String sql = "select * from Pessoa order by " + tipo + ";";
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultset = pstm.executeQuery();
			while (resultset.next()) {
				pessoas.add(new Pessoa(resultset.getInt("id"), resultset.getString("nome"),
						resultset.getString("email"), resultset.getString("telefone")));
			}
			resultset.close();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoas;
	}
}