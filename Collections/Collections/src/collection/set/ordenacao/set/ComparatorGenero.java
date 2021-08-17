package collection.set.ordenacao.set;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {

	@Override
	public int compare(Serie serie1, Serie serie2) {
		return serie1.getGenero().compareTo(serie2.getGenero());
	}
	
	

}
