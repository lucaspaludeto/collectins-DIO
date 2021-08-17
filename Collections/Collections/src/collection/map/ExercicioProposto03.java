package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class ExercicioProposto03 {
	
	public static void main(String[] args) {
		System.out.println("------\tOrdem aleatória\t------");
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1, new Contato("Simba", 2222));
			put(4, new Contato("Cami", 5555));
			put(3, new Contato("Jon", 1111));
		}};
		//System.err.println(agenda);
		
		for(Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - "  + entry.getValue().getNumero());
		}
		
		System.out.println("\n------\tOrdem Inserção\t------");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
			put(1, new Contato("Simba", 2222));
			put(4, new Contato("Cami", 5555));
			put(3, new Contato("Jon", 1111));
		}};
		//System.out.println(agenda1);
		for(Map.Entry<Integer, Contato> entry1 : agenda1.entrySet()) {
			System.out.println(entry1.getKey() + " - " + entry1.getValue().getNome() + " - " + entry1.getValue().getNumero());
		}
		
		System.out.println("\n------\tOrdem id\t------");
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		//System.out.println(agenda2);
		for(Map.Entry<Integer, Contato> entry2 : agenda.entrySet()) {
			System.out.println(entry2.getKey() + " - " + entry2.getValue().getNome() + " - " + entry2.getValue().getNumero());;
		}
		
		System.out.println("------\tOrdem número telefone\t------");
		Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new ComparatorOrdemNumerica());
		agenda3.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato> entry3 : agenda3) {
			System.out.println(entry3.getKey() + " - " + entry3.getValue().getNome() + " - " + entry3.getValue().getNumero());
		}
		
		System.out.println("------\tOrdem nome contato\t------");
		Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new ComparatorOrdemNomeContato());
		agenda4.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato> entry4 : agenda4) {
			System.out.println(entry4.getKey() + " - " + entry4.getValue().getNome() + " - " + entry4.getValue().getNumero());
		}
	}
}
