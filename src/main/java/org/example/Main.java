package org.example;

import Linked_List.LinkedList;

public class Main {
    static void main() {
        LinkedList List = new LinkedList();

        List.addValue("Baaaaaa");
        List.addValue("Baba");
        List.addValue("Balu");
        List.addValue("Baaaau");

        List.Remove("baba");
        for(int  i = 0; i < List.getLenght(); i++){
            System.out.println(List.get(i).getValue());
        }
       IO.println(List.getLenght());
    }
}
