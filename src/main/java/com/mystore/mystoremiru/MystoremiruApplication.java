package com.mystore.mystoremiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MystoremiruApplication {

	public static void main(String[] args) {
		SpringApplication.run(MystoremiruApplication.class, args);
		System.out.println("Working");
		// connectdata();
	}
	// public static void connectdata()
	// {
	// 	String url="jdbc:mysql://localhost:3306/myappdev";
	// 	String user="root";
	// 	String password="root";
		
	// 	try(Connection conn= DriverManager.getConnection(url, user, password))
	// 	{
	// 		if(conn!=null)
	// 		{
	// 			System.out.println("Connection Sucessfull");
	// 		}
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		System.out.println("Connection failed");
	// 	}
	// }

}
