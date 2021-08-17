package collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class ExemploProposto01 {
	
	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
		Map<String, Integer> estadoPopulacao = new HashMap<>(){{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187183);
			put("RN", 3534265);
		}};
		System.out.println(estadoPopulacao);
		
		System.out.println("Substitua a população do estado RN por : 3.534.165");
		estadoPopulacao.put("RN", 3534165);
		System.out.println(estadoPopulacao);
		
		System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
		estadoPopulacao.put("PB", 4039277);
		System.out.println(estadoPopulacao);
		
		System.out.println("Exiba a população do estado PE: " + estadoPopulacao.get("PE"));
		
		Map<String, Integer> estadoPopulacao2 = new LinkedHashMap<>(){{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187183);
			put("RN", 3534265);
		    put("PB", 4039277);
		}};
		System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: " 
				+ estadoPopulacao2);
		
		Map<String, Integer> estadoPopulacao3 = new TreeMap<>(estadoPopulacao);
		System.out.println("Exiba todos os estados e suas populações na ordem alfabética: " + estadoPopulacao3);
		
		Collection<Integer> populacao = estadoPopulacao.values();
		String menorEstado = "";
		String maiorEstado = "";
		for (Map.Entry<String, Integer> entry : estadoPopulacao.entrySet()) {
			if(entry.getValue().equals(Collections.max(populacao))) maiorEstado = entry.getKey();
			if(entry.getValue().equals(Collections.min(populacao))) menorEstado = entry.getKey();
		}
		System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                menorEstado, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                maiorEstado, Collections.max(populacao));
        
        Iterator<Integer> iterator = estadoPopulacao.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()) {
        	soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        /*
        OU DESSA MANEIRA
        int soma2 = 0;
        for(Map.Entry<String, Integer> entry : estadoPopulacao.entrySet()) {
        	soma2 += entry.getValue();
        }
		*/
        
        System.out.println("Exiba a média da população deste dicionário de estados: " + soma/estadoPopulacao.size());
        
        Iterator<Integer> iterator2 = estadoPopulacao.values().iterator();
        while(iterator2.hasNext()) {
        	if(iterator2.next() < 4000000)iterator2.remove();
        }
        System.out.println("Remova os estados com a população menor que 4.000.000: " + estadoPopulacao);
        
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estadoPopulacao.clear();
        System.out.println(estadoPopulacao);
        
        System.out.println("Confira se a lista está vazia: " + estadoPopulacao.isEmpty());
        
	}

}
