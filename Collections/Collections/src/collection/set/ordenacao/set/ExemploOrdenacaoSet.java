package collection.set.ordenacao.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import collection.set.exercicio.proposto02.ComparatorIDE;
import collection.set.exercicio.proposto02.LinguagemFavorita;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemploOrdenacaoSet {
	
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleatória\t--");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("Got", "Fantasia", 60));
			add(new Serie("Dark", "Drama", 60));
			add(new Serie("'70s show", "Comédia", 25));
		}};
		for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem Inserção\t--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("Got", "Fantasia", 60));
			add(new Serie("Dark", "Drama", 60));
			add(new Serie("'70s show", "Comédia", 25));
		}};
		for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem natural (Tempo Episódio)\t--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		
		System.out.println("--\tOrdem Nome/Gênero/TempoEpisódio\t--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - "
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem Gênero\t--");
		Set<Serie> minhasSeries4 = new TreeSet<Serie>(new ComparatorGenero());
		minhasSeries4.addAll(minhasSeries);
		for (Serie serie : minhasSeries4) System.out.println(serie);		
	
	}
	
}
