public class TestaPilha {
    public static void main (String[] args) {
        Stack pilha1, pilha2;

        pilha1 = new Stack();
        pilha2 = new Stack();

        pilha1.push(10);
        pilha2.push(20);
        pilha1.push(30);
        pilha2.push(40);

        try {
            System.out.println("Valor desempilhado pilha 1: " + pilha1.pop());
        } catch (IllegalStateException e) {
            System.out.println("Erro na pilha 1: " + e.getMessage());
        }

        try {
            System.out.println("Valor desempilhado pilha 2: " + pilha2.pop());
        } catch (IllegalStateException e) {
            System.out.println("Erro na pilha 2: " + e.getMessage());
        }

        try {
            System.out.println("Topo da pilha 1: " + pilha1.top());
        } catch (IllegalStateException e) {
            System.out.println("Erro ao acessar topo da pilha 1: " + e.getMessage());
        }

        try {
            System.out.println("Topo da pilha 2: " + pilha2.top());
        } catch (IllegalStateException e) {
            System.out.println("Erro ao acessar topo da pilha 2: " + e.getMessage());
        }
    }
}
