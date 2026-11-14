public class Stack {
    private StackNode topo;

    public boolean isEmpty() {
        if (this.topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push (int valor) {
        StackNode newNode;

        newNode = new StackNode(valor);
        if (this.isEmpty()) {
            this.topo = newNode;
        } else {
            newNode.setProx(topo);
            this.topo = newNode;
        }
    }

    public int top() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Erro ao ecssar o topo da pilha.");
        }
        return topo.getInfo();
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Pilha vazia.");
        }

        StackNode aux;
        aux = topo;
        topo = topo.getProx();
        return aux.getInfo();
    }

    public boolean isFull() {
        return false;
    }
}