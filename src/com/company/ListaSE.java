package com.company;

public class ListaSE {
    public int listSize = 0; //qte de nós
    private No head = null; //primeiro pointer da lista


    //getters e setters
    public int getListSize() {
        return listSize;
    }
    public No getPrimeiro() {
        return head;
    }

    //método para inserir primeiro nó na lista
    public void AppendStart(No novoNode) {
        if (head == null) {
            head = novoNode;
        } else {
            novoNode.setProximo(head);
            head = novoNode;
        }
        listSize++;
    }

    //método para inserir ultimo nó na lista
    public void appendEnd(No novoNode) {
        if(head == null) {
            AppendStart(novoNode);
        } else {
            No pointer = head;
            while(pointer.getProximo() == null) {
                pointer = pointer.getProximo();
                pointer.setProximo(novoNode);
            }
        }
        listSize++;
    }


    //boolean para ver se lista está vazia
    public boolean isEmpty() {
        return (this.head == null);
    }

    //método que retorna string da lista atualmente
    public String toString() {
        if (isEmpty()) {
            return "Não há nós na lista \n";
        }
        String str = "(" + listSize + ") ";
        No local = head;
        while(local != null) {
            str += local.getDado() + " " + local.getFrequencia() + " \n";
            local = local.getProximo();
        }
        return str;
    }


}
