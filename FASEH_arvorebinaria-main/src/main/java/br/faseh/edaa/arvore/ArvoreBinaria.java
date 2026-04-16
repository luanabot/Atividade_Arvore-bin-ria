package br.faseh.edaa.arvore;


/**
 * Classe que representa a árvore binária.
 * todo(Aqui você deve criar o método para inserir os elementos na árvore)
 *
 */
public class ArvoreBinaria {

    // Raiz da árvore (primeiro nó)
    private NoBinario raiz;

    // Construtor da árvore
    // Quando a árvore é criada, ela começa vazia (raiz = null)
    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Método público de inserção
    // É o ponto de entrada usado no Main
    public void inserir(NoBinario novoNo) {
        // Chama o método recursivo passando a raiz como ponto inicial
        // O resultado pode atualizar a raiz caso a árvore esteja vazia
        raiz = inserirRecursivo(raiz, novoNo);
    }

    // Método recursivo que realmente insere o nó na árvore
    private NoBinario inserirRecursivo(NoBinario atual, NoBinario novoNo) {

        // CASO BASE:
        // Se o nó atual for null, encontramos a posição correta para inserção
        if (atual == null) {
            return novoNo; // insere o novo nó aqui
        }

        // REGRA DA ÁRVORE BINÁRIA DE BUSCA:
        // valores menores ficam à esquerda

        if (novoNo.numero < atual.numero) {
            // percorre recursivamente a subárvore esquerda
            atual.esquerda = inserirRecursivo(atual.esquerda, novoNo);
        }

        // valores maiores ficam à direita
        else if (novoNo.numero > atual.numero) {
            // percorre recursivamente a subárvore direita
            atual.direita = inserirRecursivo(atual.direita, novoNo);
        }

        // retorna o nó atual atualizado
        // isso garante que a estrutura da árvore seja mantida
        return atual;
    }
}