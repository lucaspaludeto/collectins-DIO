package collection.map.exemploOrdenacaoMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {
		
		System.out.println("------------\tOrdem Aleatória\t------------");
		Map<String, Livro> meusLivros = new HashMap<>(){{
			put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));	
		}}; 
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("------------\tOrdem Inserção\t------------");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
			put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));	
		}};
		for (Map.Entry<String, Livro> livro1 : meusLivros1.entrySet())
			System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
		
		System.out.println("------------\tOrdem alfabética autores\t------------");
		Map<String, Livro> meusLivros2 = new TreeMap<>(){{
			put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
		}};
		for (Map.Entry<String, Livro> livro2 : meusLivros2.entrySet())
			System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
		
		System.out.println("------------\tOrdem alfabética nomes dos livros\t------------");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro3 : meusLivros3)
			System.out.println(livro3.getKey() + " - " + livro3.getValue().getNome());
		
		System.out.println("------------\tOrdem número de páginas\t------------");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
		meusLivros4.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro4 : meusLivros4)
			System.out.println(livro4.getKey() + " - " + livro4.getValue().getPaginas());
	}
}
