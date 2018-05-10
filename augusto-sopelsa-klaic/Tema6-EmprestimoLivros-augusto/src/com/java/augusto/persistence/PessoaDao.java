package com.java.augusto.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.java.augusto.business.Pessoa;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PessoaDao {

	public void gravaDadosPessoa(List<Pessoa> pessoas) {

		Gson gson = new Gson();
		String json = gson.toJson(pessoas);

		try {
			FileWriter writer = new FileWriter("Pessoas.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * JSONObject jsonObject = new JSONObject(); FileWriter writeFile = null; try {
		 * jsonObject.put("cpf", pessoa.getCPF()); jsonObject.put("nome",
		 * pessoa.getNome()); jsonObject.put("numerodelivros",
		 * pessoa.getNUmeroLivrosAlugados()); jsonObject.put("top10",
		 * pessoa.getLivrosQueJaRetirou());
		 * 
		 * writeFile = new FileWriter("Pessoas.json");
		 * writeFile.write(jsonObject.toString()); writeFile.close(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	}

	public List<Pessoa> carregaDadosPessoa() {

		Type typeFound = new TypeToken<ArrayList<Pessoa>>() {
		}.getType();
		BufferedReader jsonReader;
		try {
			jsonReader = new BufferedReader(new FileReader("Pessoas.json"));
			List<Pessoa> listPerson = new Gson().fromJson(jsonReader, typeFound);
			return listPerson;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;

		/*
		 * JSONObject jsonObject; JSONParser parser = new JSONParser(); String cpf;
		 * String nome; int numerodelivros; List<Livro> top10 = new ArrayList<Livro>();
		 * 
		 * try { jsonObject = (JSONObject) parser.parse(new FileReader("Livros.json"));
		 * cpf = (String) jsonObject.get("cpf"); nome = (String) jsonObject.get("nome");
		 * numerodelivros = (Integer) jsonObject.get("numerodelivros"); top10 =
		 * (List<Livro>) jsonObject.get("top10");
		 * 
		 * return new Pessoa(cpf,nome,numerodelivros,top10); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e) {
		 * e.printStackTrace(); } catch (ParseException e) { e.printStackTrace(); }
		 * return null;
		 */
	}

}