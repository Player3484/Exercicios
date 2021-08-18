package br.com.tiago.exercicios.listas;

import java.util.Scanner;

/*Faça um algoritmo que leia um número inteiro A e calcule o dobro dele caso seja positivo ou o seu triplo caso seja negativo,
imprimindo o resultado.*/

public class ExercicioCondicional4 {

	public void executar() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero aqui");
		int numero = input.nextInt();
		
		if (numero > 0) {
			numero = numero*2;
		}else if (numero == 0) {
			System.out.println("Digite outro numero");
			
		}
		else {
			numero = numero*3;
		}
		
		System.out.println("O resultado e:" + numero);
	}
	
}
