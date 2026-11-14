public class QueueNode {
    private int info;
    private QueueNode prox;

    public QueueNode(int valor) {
        this.info = valor;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public QueueNode getProx() {
        return prox;
    }

    public void setProx(QueueNode prox) {
        this.prox = prox;
    }
}
