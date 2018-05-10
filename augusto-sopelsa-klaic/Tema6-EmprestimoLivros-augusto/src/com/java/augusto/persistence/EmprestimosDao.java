package com.java.augusto.persistence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.java.augusto.business.Emprestimo;

public class EmprestimosDao {

	public void gravaDadosEmprestimo(List<Emprestimo> emprestimos) {

		Gson gson = new Gson();
		String json = gson.toJson(emprestimos);

		try {
			FileWriter writer = new FileWriter("Emprestimos.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * JSONObject jsonObject = new JSONObject(); FileWriter writeFile = null; try {
		 * jsonObject.put("idemprestimo", emprestimo.getIdEmprestimo());
		 * jsonObject.put("pessoa", emprestimo.getPessoa()); jsonObject.put("livro",
		 * emprestimo.getLivro()); jsonObject.put("prazo",
		 * emprestimo.getPrazoEntrega()); jsonObject.put("emprestimoatrasados",
		 * emprestimo.getEmprestimosAtrasados()); writeFile = new
		 * FileWriter("Emprestimos.json"); writeFile.write(jsonObject.toString());
		 * writeFile.close(); } catch (IOException e) { e.printStackTrace(); }
		 */
	}

	public List<Emprestimo> carregaDadosEmprestimo() {

		Type typeFound = new TypeToken<ArrayList<Emprestimo>>() {
		}.getType();
		BufferedReader jsonReader;
		try {
			jsonReader = new BufferedReader(new FileReader("Emprestimos.json"));
			List<Emprestimo> listEmprestimo = new Gson().fromJson(jsonReader, typeFound);
			return listEmprestimo;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;

		/*
		 * JSONObject jsonObject; JSONParser parser = new JSONParser(); Pessoa pessoa;
		 * Livro livro; int idemprestimo; LocalDate prazo; Map<String, Integer>
		 * emprestimosatrasados = new HashMap<String, Integer>(); try { jsonObject =
		 * (JSONObject) parser.parse(new FileReader("Emprestimos.json")); pessoa =
		 * (Pessoa) jsonObject.get("pessoa"); livro = (Livro) jsonObject.get("livro");
		 * idemprestimo = (int) jsonObject.get("idemprestimo"); prazo = (LocalDate)
		 * jsonObject.get("prazo"); emprestimosatrasados = (Map<String,Integer>)
		 * jsonObject.get("emprestimosatrasados"); return new Emprestimo(pessoa,livro);
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); } catch (ParseException e) { e.printStackTrace(); }
		 * return null;
		 */
	}
}