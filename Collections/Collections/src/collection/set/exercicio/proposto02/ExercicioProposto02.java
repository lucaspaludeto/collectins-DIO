package collection.set.exercicio.proposto02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioProposto02 {
	
	public static void main(String[] args) {
		
		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
		minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
        
        System.out.println("--\tOrdem de Inserção\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
        		Arrays.asList(
        		new LinguagemFavorita("Python", 1991, "Pycharm"),
        		 new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                 new LinguagemFavorita("Java", 1991, "Visual Studio Code")
        		)
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem.getNome()
        		+ " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        
        System.out.println("--\tOrdem natural (Nome)\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagemFavorita : minhasLinguagensFavoritas2) System.out.println(
        linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + linguagemFavorita.getIde());
        
        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIDE());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagemFavorita : minhasLinguagensFavoritas3)System.out.println(
        linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        
        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagemFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagemFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagemFavorita : minhasLinguagemFavoritas4) System.out.println(
        linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
	
        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoEIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);
	}
		
	}


