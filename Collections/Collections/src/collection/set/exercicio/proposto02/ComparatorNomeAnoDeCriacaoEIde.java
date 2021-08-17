package collection.set.exercicio.proposto02;

import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoEIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		if(nome != 0) return nome;
		
		int anoDeCricao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
		if(anoDeCricao != 0) return anoDeCricao;
		
		return o1.getIde().compareToIgnoreCase(o2.getIde());
	}

}
