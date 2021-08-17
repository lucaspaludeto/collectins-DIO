package collection.list.OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class ExemploOrdencaoList {
	
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		
		System.out.println("--\tOrdem de Inserção\t--");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem aleatória\t--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Natural (Nome)\t--");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Idade\t--");
		//Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Cor\t--");
		//Collections.sort(meusGatos, new ComparatorCor());
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Nome/Cor/Idade\t--");
		//Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}

}
