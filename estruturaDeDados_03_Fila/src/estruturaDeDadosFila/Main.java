package estruturaDeDadosFila;

public class Main {

	public static void main(String[] args) {

		Fila<String> minhaFilaDeString = new Fila<String>();

		minhaFilaDeString.enqueue("primeiro");
		minhaFilaDeString.enqueue("segundo");
		minhaFilaDeString.enqueue("terceiro");
		minhaFilaDeString.enqueue("quarto");

		System.out.println("Exibindo Fila Completa:");
		System.out.println(minhaFilaDeString);

		// Retirou o "primeiro" da Fila
		System.out.print("\nRemovido o Primeiro da fila --> ");
		System.out.println(minhaFilaDeString.dequeue());
		System.out.println("\nExibindo Fila Atualizada: ");
		System.out.println(minhaFilaDeString);

		minhaFilaDeString.enqueue("Ultimo");

		System.out.println("\nInserindo o objeto: 'ultimo' no fim da Fila.");

		// Retorna o primeiro da Fila
		System.out.print("\nPrimeiro objeto da fila Atualizada --> ");
		System.out.println(minhaFilaDeString.first());
		System.out.println("\nExibindo Fila Atualizada: ");
		System.out.println(minhaFilaDeString);

		// Declarando uma fila de Inteiros
		Fila<Integer> minhaFiladeInteiros = new Fila<Integer>();
		minhaFiladeInteiros.enqueue(1);
		minhaFiladeInteiros.enqueue(2);
		minhaFiladeInteiros.enqueue(3);
		minhaFiladeInteiros.enqueue(4);

		// Retirou o "primeiro" da Fila
		System.out.print("\nRemovido o Primeiro da fila --> ");
		System.out.println(minhaFiladeInteiros.dequeue());
		System.out.println(minhaFiladeInteiros);

		System.out.println("\nAdicionando 10 no fim da fila:");
		minhaFiladeInteiros.enqueue(10);

		// Retorna o primeiro da Fila
		System.out.print("\nPrimeiro objeto da fila --> ");

		System.out.println(minhaFiladeInteiros.first());
		System.out.println("\nExibindo Fila Atualizada:");
		System.out.println(minhaFiladeInteiros);

	}

}
