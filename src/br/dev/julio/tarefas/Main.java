package br.dev.julio.tarefas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		String caminho = "/Users/25132583/tarefasDS1TA/tarefas";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FileReader(caminho);
		br = new BufferedReader(fr);
		String retorno = br.readLine();
		
		while (retorno != null) {
			System.out.println(retorno);
			retorno = br.readLine();
			
		}
		
		} catch (FileNotFoundException erro) {
			System.out.println("O arquivo não foi encontrado!");
		} catch(Exception erro) {
			System.out.println("Ocorreu um erro!");
		}	
		
		System.out.println("Fim");
		
		
	}

}
