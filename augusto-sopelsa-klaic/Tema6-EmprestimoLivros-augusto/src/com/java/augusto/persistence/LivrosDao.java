package com.java.augusto.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.java.augusto.business.Emprestimo;
import com.java.augusto.business.Livro;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LivrosDao {

	public void gravarDadosLivros(List<Livro> livros) {

		Gson gson = new Gson();
		String json = gson.toJson(livros);

		try {
			FileWriter writer = new FileWriter("Livros.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Livro> carregarDadosLivros() {

		Type typeFound = new TypeToken<ArrayList<Livro>>() {
		}.getType();
		BufferedReader jsonReader;
		try {
			jsonReader = new BufferedReader(new FileReader("Livros.json"));
			List<Livro> listlivro = new Gson().fromJson(jsonReader, typeFound);
			return listlivro;
		} catch (FileNotFoundException e) {
		}
		return new ArrayList<Livro>();
	}
}