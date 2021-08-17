package collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {

	@Override
	public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}

}
