package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		// instancia um BufferedReade para ler o arq.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// le a linha do arq.
			String employeeCsv = br.readLine();
			while (employeeCsv != null) { // enquanto o name não estiver vazio, continua.
				String[] filds = employeeCsv.split(","); // separa as sentencas usando como argumento a ","
				list.add(new Employee(filds[0], Double.parseDouble(filds[1]))); // guarda cada nome lido dentro da lista local. Double.parseDouble(filds[1] passa o string para double
				employeeCsv = br.readLine();
			}
			
			//
			Collections.sort(list); // passando minha lista com argumento. ordenação por ordem alfabetica.
			for (Employee emp : list) { // depois da ordenão um for para passar e printar cada funcionario.
				System.out.println(emp.getName() + ", " + String.format("%.2f", emp.getSalary()));
			}
		} catch (IOException e) { //
			System.out.println("Error: " + e.getMessage());
		}

	}

}
