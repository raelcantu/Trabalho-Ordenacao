package br.unipar.trabalhoordenacao;

import br.unipar.trabalhoordenacao.models.Ordenacao;
import java.util.Scanner;

public class TrabalhoOrdenacao {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Ordenacao ordenar = new Ordenacao();
        String metodo = "";
        long tempoInicio, tempoDecorrido = 0;

        System.out.println("Insira o tamanho da lista que deseja:");
        int tamanho = s.nextInt();

        int[] lista = new int[tamanho];

        System.out.println("Insira os números para preencher sua lista:");

        for (int i = 0; i < lista.length; i++) {
            System.out.print("(" + (i + 1) + ") de (" + tamanho + ") :");
            lista[i] = s.nextInt();
        }

        int[] listaOriginal = lista.clone();

        System.out.println("Selecione o método de ordenação:");
        System.out.println("1 - Inserção");
        System.out.println("2 - Seleção");
        System.out.println("3 - Bolha");

        int input = s.nextInt();

        switch (input) {
            case 1:
                tempoInicio = System.nanoTime();
                ordenar.Insercao(lista);
                metodo = "Inserção";
                tempoDecorrido = System.nanoTime() - tempoInicio;
                break;
            case 2:
                tempoInicio = System.nanoTime();
                ordenar.Selecao(lista);
                metodo = "Seleção";
                tempoDecorrido = System.nanoTime() - tempoInicio;
                break;
            case 3:
                tempoInicio = System.nanoTime();
                ordenar.Bolha(lista);
                metodo = "Bolha";
                tempoDecorrido = System.nanoTime() - tempoInicio;
                break;
        }

        System.out.println("Lista original inserida:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(listaOriginal[i] + " ");
        }

        System.out.println("\n\nLista ordenada pelo método " + metodo + "(Tempo " + tempoDecorrido + " nanosegundos) :");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
