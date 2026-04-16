package br.faseh.edaa.arvore;


/**
 * Classe que representa cada nó da árvore binária.
 */
public class NoBinario {
    int numero;
    NoBinario direita;
    NoBinario esquerda;

    public NoBinario(int numero) {
        this.numero = numero;
        this.direita = this.esquerda = null;
    }
}




