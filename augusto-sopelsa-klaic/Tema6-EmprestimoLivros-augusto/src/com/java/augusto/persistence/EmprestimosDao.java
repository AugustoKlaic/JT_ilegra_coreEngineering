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
		return new ArrayList<Emprestimo>();
	}
}