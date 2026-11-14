# Data Structures

Implementações de estruturas de dados clássicas, feitas durante meus estudos de Estruturas de Dados no curso de Ciência da Computação.

## Conteúdo

### Java

| Pasta | Estrutura | Destaques |
|---|---|---|
| `java/binary-search-tree` | Árvore binária de busca | Inserção recursiva; percursos pré-ordem, em ordem, pós-ordem e em largura; `MirrorBST` estende `BST` e espelha a árvore recursivamente |
| `java/stack-and-queue` | Pilha e fila encadeadas | Implementadas com nós próprios, sem usar coleções do Java; tratamento de pilha ou fila vazia com `IllegalStateException` |

## Como executar

Requer o JDK 17 ou mais recente.

```bash
git clone https://github.com/jpcmoraess/data-structures.git
cd data-structures/java/stack-and-queue
javac *.java
java TestaPilha
java TestaFila
```

Saída esperada de `TestaPilha`:

```
Valor desempilhado pilha 1: 30
Valor desempilhado pilha 2: 40
Topo da pilha 1: 10
Topo da pilha 2: 20
```

## Conceitos praticados

- Alocação encadeada com nós e referências
- Recursão (inserção, percursos e espelhamento da árvore)
- Herança (`MirrorBST extends BST`)
- Tratamento de exceções para operações inválidas
