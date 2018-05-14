package com.java.augusto.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

	private static final String USUARIO = "root";
	private static final String SENHA = "ilegra";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/Agenda?autoReconnect=true&useSSL=false";
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	public static Connection abrir() {

		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}