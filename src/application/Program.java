package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// declaração de uma lista de números inteiros
		List<String> minhaLista;

		// instância da lista
		minhaLista = new ArrayList<>();

		// adicionar elementos a lista
		minhaLista.add("Maria");
		minhaLista.add("Bob");
		minhaLista.add("Alex");
		minhaLista.add("Anna");
		minhaLista.add("Moises");
		minhaLista.add("Manuel");

		// inserir um elemento em uma posição especifica - usar a sobrecarga do add
		minhaLista.add(2, "Marco");

		// tamanho da lista
		System.out.println("Tamanho da lista A: " + minhaLista.size());
		System.out.println("Elementos da lista A:");

		// percorrer a lista A e exibir
		for (String x : minhaLista) {
			System.out.println(x);
		}

		// encontra a posição de um elemento
		System.out.println("====================================================");
		System.out.println("O índice do Marco é: " + minhaLista.lastIndexOf("Marco"));
		System.out.println("====================================================");
		System.out.println();

		// criar uma nova lista com todos os elementos da lista A que comecem com A
		List<String> resultado = minhaLista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

		// exibir a nova lista criada
		System.out.println("Tamanho da lista B: " + resultado.size());
		System.out.println("Elementos da lista B:");

		// percorrer a lista B e exibir
		for (String x : resultado) {
			System.out.println(x);
		}

		// remover um elemento da lista, baseado no seu valor
		minhaLista.remove("Marco");

		// remover um elemento da lista, baseado na sua posição
		minhaLista.remove(1);

		// remover da lista todos que obedecerem a um critério (atendam a um predicado)
		minhaLista.removeIf(x -> x.charAt(0) == 'M');

		System.out.println("====================================================");
		// tamanho da lista
		System.out.println("Tamanho da lista A: " + minhaLista.size());
		// percorrer a lista e exibir
		for (String x : minhaLista) {
			System.out.println(x);
		}
		
		// encontrar o primeiro elemento que comece com a letra A - se não existir , retornar nulo
		String nome = minhaLista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println("O primeiro elemento da lista A que começa com a é: " + nome);
				

	}

}
