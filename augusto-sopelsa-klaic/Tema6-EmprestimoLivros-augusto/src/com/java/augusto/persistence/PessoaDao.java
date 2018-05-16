package com.java.augusto.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.java.augusto.business.Emprestimo;
import com.java.augusto.business.Pessoa;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PessoaDao {

	public void gravarDadosPessoa(List<Pessoa> pessoas) {

		Gson gson = new Gson();
		String json = gson.toJson(pessoas);

		try (FileWriter writer = new FileWriter("Pessoas.json")){
			
			writer.write(json);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Pessoa> carregarDadosPessoa() {

		Type typeFound = new TypeToken<ArrayList<Pessoa>>() {}.getType();
		 
		try (BufferedReader jsonReader = new BufferedReader(new FileReader("Pessoas.json"))){
			List<Pessoa> listPerson = new Gson().fromJson(jsonReader, typeFound);
			return listPerson;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<Pessoa>();
	}

}