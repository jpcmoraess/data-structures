public class TestaFila {
    public static void main (String[] args) {
        Queue fila1, fila2;

        fila1 = new Queue();
        fila2 = new Queue();

        fila1.enqueue(10);
        fila2.enqueue(20);
        fila1.enqueue(30);
        fila2.enqueue(40);

        try {
            System.out.println("Valor removido da fila 1: " + fila1.dequeue());
        } catch (IllegalStateException e) {
            System.out.println("Erro na fila 1: " + e.getMessage());
        }
        
        try {
            System.out.println("Valor removido da fila 2: " + fila2.dequeue());
        } catch (IllegalStateException e) {
            System.out.println("Erro na fila 2" + e.getMessage());
        }

        try {
            System.out.println("Frente fila 1: " + fila1.peek());    
        } catch (IllegalStateException e) {
            System.out.println("Erro ao exibir frente da fila 1: " + e.getMessage());
        }

        try {
            System.out.println("Frente fila 2: " + fila2.peek());
        } catch (IllegalStateException e) {
            System.out.println("Erro ao exibir frente da fila 2: " + e.getMessage());
        }
    }
}
