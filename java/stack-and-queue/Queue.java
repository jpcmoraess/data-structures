public class Queue {
    private QueueNode inicio;
    private QueueNode fim;

    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue (int valor) {
        QueueNode novo;

        novo = new QueueNode(valor);
        if (isEmpty()) {
            this.inicio = novo; 
            this.fim = novo;
        } else {
            fim.setProx(novo);
            fim = novo;
        }
    }

    public int peek () {
        if (this.isEmpty()) {
            throw new IllegalStateException("Erro ao exibir frente da fila");
        }
        return inicio.getInfo();
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Erro ao remover da fila");
        }

        int aux = inicio.getInfo();
        inicio = inicio.getProx();

        if (inicio == null) {
            fim = null;
        }

        return aux;
    }

    public boolean isFull() {
        return false;
    }
}
