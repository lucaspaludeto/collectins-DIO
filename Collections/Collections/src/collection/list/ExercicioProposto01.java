package collection.list;

import java.util.ArrayList;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		List<Double> temperaturaSemestral = new ArrayList<>();
		
		double soma = 0d;
		for(int i = 1; i <= 6; i++) {
		System.out.print("Qual a temperatura do mês " + i + ": ");
		Double temperatura = leitor.nextDouble();
		temperaturaSemestral.add(temperatura);
		soma += temperatura;
		}
		
		Double mediaTemperaturaSemestral = soma/temperaturaSemestral.size();
		
		System.out.println("Temperatura Semestral" + temperaturaSemestral);
		System.out.println("A média da temperatura semestral é: " + mediaTemperaturaSemestral);
		System.out.println("--------------------------");
		
		for (Double temperatura : temperaturaSemestral) {
			if(temperatura > mediaTemperaturaSemestral) {
				int index = temperaturaSemestral.indexOf(temperatura);
				switch(index) {
				case 0:
					System.out.println((index + 1) + " - Janeiro: " + temperatura + " ºC");
					break;
				case 1:
					System.out.println((index + 1) + "- Fevereiro: " + temperatura + " ºC");
					break;
				case 2:
					System.out.println((index + 1) + " - Março: " + temperatura + " ºC");
					break;
				case 3:
					System.out.println((index + 1) + " - Abril: " + temperatura + " ºC");
					break;
				case 4:
					System.out.println((index + 1) + " - Maio: " + temperatura + " ºC");
					break;
				case 5:
					System.out.println((index + 1) + " - Junho: " + temperatura + " ºC");
					break;
					default:
						break;
				}
			}
			
		}
		
		leitor.close();
	}

}
