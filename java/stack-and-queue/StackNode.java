    public class StackNode {
        private int info;
        private StackNode prox;

        public StackNode(int valor) {
            this.info = valor;
        }

        public void setInfo(int valor) {
            this.info = valor;
        }

        public void setProx(StackNode novoProximo) {
            this.prox = novoProximo;
        }

        public int getInfo() {
            return info;
        }

        public StackNode getProx() {
            return prox;
        }
    }