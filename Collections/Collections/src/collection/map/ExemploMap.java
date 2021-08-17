package collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
*/

public class ExemploMap {
	
	public static void main(String[] args) {
		
		//Map carrosPopulares2020 = new HashMap(); //antes do Java 5
		//Map<String, Double> carrosPopulares = new HashMap<>(); //Generics (JDK5) - Diamont Operator(JDK7);
		//HashMap<String, Double> carrosPopulares = new HashMap<>();
		//Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);
		
		
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("HB20", 14.5);
			put("Kwid", 15.6);
		}};
		System.out.println(carrosPopulares);
		
		System.out.println("Substitua o consumo do Gol por 15,2 km/l: ");
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
		
		System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));
		
		//System.out.println("Exiba o terceiro modelo adicionado: "); //Não tem esse método
		
		System.out.println("Exiba os modelos: " + carrosPopulares.keySet());
		
		System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());
		
		Double max = Collections.max(carrosPopulares.values());
		Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
		for (Entry<String, Double> entry : entrySet) {
		String modeloMaisEficiente = "";
			if (entry.getValue().equals(max)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Exiba o modelo mais econômico e seu consumo: " + modeloMaisEficiente + " - "
						+ max);
			}
		}
		
		Double min = Collections.min(carrosPopulares.values());
		Set<Entry<String, Double>> entrySet2 = carrosPopulares.entrySet();
		String modeloMenosEficiente = "";
		for (Entry<String, Double> entry2 : entrySet) {
			if (entry2.getValue().equals(min)) {
				modeloMenosEficiente = entry2.getKey();
				System.out.println("Exiba o modelo menos econômico e seu consumo: " + modeloMenosEficiente + " - "
						+ min);	
			}	
		}
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Exiba a soma dos consumos: " + soma);
		
		System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma/carrosPopulares.size());
		
		
		Iterator<Double> iterator2 = carrosPopulares.values().iterator();
		while(iterator2.hasNext()) {
			if(iterator2.next().equals(15.6)) iterator2.remove();
		}
		System.out.println("Remova os modelos com consumo igual a 15,6 km/l: " + carrosPopulares);
		
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("HB20", 14.5);
			put("Kwid", 15.6);
		}};
		System.out.println("Exiba todos os carros na ordem em que foram informados: " + carrosPopulares2);
		
		
		Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
		System.out.println("Exiba o dicionário ordenado por modelo: " + carrosPopulares3);
		
		System.out.println("Apague o dicionário de carros: ");
		carrosPopulares.clear();
		
		System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
		
	}
}
