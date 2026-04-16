package br.faseh.edaa.arvore;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== ÁRVORE BINÁRIA - INSERÇÃO RECURSIVA ===");

        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserções (teste do método recursivo)
        arvore.inserir(new NoBinario(10));
        arvore.inserir(new NoBinario(5));
        arvore.inserir(new NoBinario(15));
        arvore.inserir(new NoBinario(2));
        arvore.inserir(new NoBinario(7));
        arvore.inserir(new NoBinario(12));
        arvore.inserir(new NoBinario(20));

        System.out.println("\nElementos inseridos com sucesso!");
        System.out.println("Árvore construída usando inserção recursiva.");
    }
}