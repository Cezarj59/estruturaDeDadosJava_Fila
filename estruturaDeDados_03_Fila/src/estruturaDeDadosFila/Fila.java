package estruturaDeDadosFila;

public class Fila<T> {

	// referência de entrada para fila
	private No<T> refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}

	public void enqueue(T object) {

		No<T> novoNo = new No<T>(object);

		// Adiciona um No na fila
		novoNo.setRefNo(refNoEntradaFila);
		// Aponta para o uúltimo nó da fila.
		refNoEntradaFila = novoNo;
	}

	// Retorna o primeiro nó da fila

	@SuppressWarnings("unchecked")
	public T first() {
		// Testa se a fila está vazia
		if (!this.isEmpty()) {
			// Armazena o primeiro nó em uma variável
			No<T> primeiroNo = refNoEntradaFila;
			// Percorre a fila até chegar no primeiro nó
			while (true) {
				// Testa se chegou no primeiro nó
				if (primeiroNo.getRefNo() == null) {
					// Retorna o primeiro nó/item da Fila encontrado
					return (T) primeiroNo.getObject();
				} else {
					// Pega o próximo nó da fila
					primeiroNo = primeiroNo.getRefNo();
				}
			}
		}
		// Retorna null se a fila estiver vazia
		return null;
	}

	// Remove e Retorna o primeiro Nó da fila
	@SuppressWarnings("unchecked")
	public T dequeue() {
		if (!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradaFila;
			No<T> noAuxiliar = refNoEntradaFila;

			while (true) {
				if (primeiroNo.getRefNo() != null) {
					// noAuxiliar está seguindo o nó atual e se preparando para atualizar sua
					// referência quando o primeiro nó for removido;
					noAuxiliar = primeiroNo;
					// primeiroNo armazena o Próximo Nó da fila
					primeiroNo = primeiroNo.getRefNo();
				} else {
					// Seta a referência do 2° Nó da fila para null, removendo então o 1º Nó da
					// Fila.
					noAuxiliar.setRefNo(null);
					break;
				}

			}
			return (T) primeiroNo.getObject();
		}
		// se a fila etover vazia retorna null
		return null;
	}

	// Testa se a fila está vazia
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		// Inicializa a string de retorno
		String stringRetorno = "";
		// Inicializa o nó auxiliar como o primeiro nó da fila
		No<T> noAuxiliar = refNoEntradaFila;

		// Verifica se a fila não está vazia
		if (refNoEntradaFila != null) {
			// Percorre a fila enquanto houver próximos nós
			while (true) {
				// Concatena a representação em string do objeto do nó atual na string de
				// retorno
				stringRetorno += "[No{Objeto = " + noAuxiliar.getObject() + "}]---> ";
				// Avança para o próximo nó da fila
				if (noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				} else {
					// Quando chegar ao final da fila, adiciona "null" à string de retorno
					stringRetorno += "null";
					break;
				}
			}
		} else {
			// Se a fila estiver vazia, adiciona "null" à string de retorno
			stringRetorno = "null";
		}
		// Retorna a string de retorno
		return stringRetorno;
	}

}
