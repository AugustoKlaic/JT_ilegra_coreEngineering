package com.java.augusto.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.java.augusto.business.Livro;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LivrosDao {

	public void gravaDadosLivros(List<Livro> livros) {

		Gson gson = new Gson();
		String json = gson.toJson(livros);

		try {
			FileWriter writer = new FileWriter("Livros.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * JSONObject jsonObject = new JSONObject(); FileWriter writeFile = null; try {
		 * jsonObject.put("id", livro.getID()); jsonObject.put("titulo",
		 * livro.getTitulo()); jsonObject.put("autor", livro.getAutor());
		 * jsonObject.put("emprestado", livro.getEmprestado());
		 * 
		 * writeFile = new FileWriter("Livros.json");
		 * writeFile.write(jsonObject.toString()); writeFile.close(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	}

	public List<Livro> carregaDadosLivros() {

		Type typeFound = new TypeToken<ArrayList<Livro>>() {
		}.getType();
		BufferedReader jsonReader;
		try {
			jsonReader = new BufferedReader(new FileReader("Livros.json"));
			List<Livro> listlivro = new Gson().fromJson(jsonReader, typeFound);
			return listlivro;
		} catch (FileNotFoundException e) {
		}
		return null;

		/*
		 * JSONObject jsonObject; JSONParser parser = new JSONParser(); long id; String
		 * titulo, autor; boolean emprestado;
		 * 
		 * try { jsonObject = (JSONObject) parser.parse(new FileReader("Livros.json"));
		 * id = (long) jsonObject.get("id"); titulo = (String) jsonObject.get("titulo");
		 * autor = (String) jsonObject.get("autor"); emprestado = (boolean)
		 * jsonObject.get("emprestado"); //return new Livro(id, titulo, autor,
		 * emprestado); } catch (FileNotFoundException e) { e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); } catch (ParseException e) {
		 * e.printStackTrace(); }catch (NullPointerException e) { e.printStackTrace(); }
		 * return null;
		 */
	}
}