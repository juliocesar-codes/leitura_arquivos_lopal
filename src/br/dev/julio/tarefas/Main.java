package br.dev.julio.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	
	static String caminho = "/Users/25132583/tarefasDS1TA/tarefas";
	
	public static void main(String[] args) {
		
		escreverArquivo();
		//lerArquivo();
		
		
	}
	
	private static void escreverArquivo() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			//Adicionando conteudo no arquivo
			bw.append("Senai Jandira - ");
			bw.append("Julio Cesar - ");
			bw.append("Lógica de Programação\n");
			
			//Mandando escrever no arquivo
			bw.flush();
			
			
		} catch (Exception e) {
			
		}
		
	}

	private static void lerArquivo() {
		
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
