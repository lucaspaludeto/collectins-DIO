package collection.set.exercicio.proposto02;

import java.util.Comparator;

public class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int anoDeCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
		if(anoDeCriacao != 0) return anoDeCriacao;
		
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
