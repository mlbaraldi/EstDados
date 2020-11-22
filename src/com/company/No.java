package com.company;

public class No {

    private String dado; //dado do nó atual, nome do arquivo
    private int frequencia; //Frequencia de vezes que dado aparece
    private No proximo; //pointer para próximo nó

    public No(String dado, int frequencia) { //constructor
        this.dado = dado;
        this.proximo = null;
        this.frequencia = frequencia;
    }

//getters e setters
    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
}
