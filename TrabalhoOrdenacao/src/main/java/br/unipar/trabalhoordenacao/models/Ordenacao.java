package br.unipar.trabalhoordenacao.models;

public class Ordenacao {

    int chave, aux, j;

    public void Insercao(int[] x) {
        for (int i = 0; i < x.length; i++) {
            chave = x[i];
            
            for (j = i - 1; j >= 0 && x[j] > chave; j--) {
                x[j + 1] = x[j];
            }
            
            x[j + 1] = chave;
        }
    }

    public void Selecao(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            int posMenor = i;

            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[posMenor]) {
                    posMenor = j;
                }
            }

            if (posMenor != i) {
                aux = lista[i];
                lista[i] = lista[posMenor];
                lista[posMenor] = aux;
            }
        }
    }

    public void Bolha(int[] lista) {
        int tamanho = lista.length;

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

}
