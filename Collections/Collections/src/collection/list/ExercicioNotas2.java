package collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExercicioNotas2 {
	
	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione as sete notas");
		List<Double> notas2 = new LinkedList<>();
		
		notas2.add(7d);
		notas2.add(8.5d);
		notas2.add(9.3d);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6d);
		System.out.println(notas2.toString());
		
		System.out.println("Exiba a posição da nota 5: " + notas2.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas2.add(4, 8d);
		System.out.println(notas2);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas2.set(notas2.indexOf(5d), 6d);
		System.out.println(notas2);
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas2.contains(5d));
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		for (Double nota : notas2) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada " + notas2.get(4));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas2));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas2));
		
		Iterator<Double> iterator = notas2.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
		Double next1 = iterator.next();
		soma += next1;
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a média das notas: " + soma/notas2.size());
		
		System.out.println("Remova a nota 0: ");
		notas2.remove(0d);
		System.out.println(notas2);
		
		System.out.println("Remova a nota da posição 0: ");
		notas2.remove(0);
		System.out.println(notas2);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator2 = notas2.iterator();
		while(iterator2.hasNext()) {
			Double next2 = iterator2.next();
			if(next2 < 7) iterator2.remove();
		}
		System.out.println(notas2);
		
		System.out.println("Apague toda a lista: ");
		notas2.clear();
		System.out.println(notas2);
		
		System.out.println("Confira se a lista está vazia: " + notas2.isEmpty());
		
	}
}
