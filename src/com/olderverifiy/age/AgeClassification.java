//pacote de classe
package com.olderverifiy.age;

//importando classe fundamental para leitura de entradas de dados
import java.util.Scanner;

public class AgeClassification {

	public static void main(String[] args) {
		// criando objeto Scanner para ler dados do teclado
		Scanner sc = new Scanner(System.in);
		// declarando variáveis
		int idade;
		String nome;
		// exibindo mensagem
		System.out.print("... Older Verify ...\n");
		System.out.print("Digite seu nome: ");
		// lê o dado armazenado na variável nome (tipo string)
		nome = sc.next();
		System.out.print("Digite sua idade: ");
		// lê o dado armazenado na variável idade (tipo inteiro)
		idade = sc.nextInt();
		// estrutura de decisão (condicional) para verificação de idade
		if (idade >= 60) {
			System.out.print(nome + ", você é classificado(a) como idoso(a).");
		} else if (idade >= 18) {
			System.out.print(nome + ", você é classificado(a) como adulto(a).");
		} else if (idade >= 13) {
			System.out.print(nome + ", você é classificado(a) como adolescente.");
		} else {
			System.out.print(nome + ", você é classificado(a) como criança.");
		}
		// encerrando objeto para liberar recursos
		sc.close();
	}
}
