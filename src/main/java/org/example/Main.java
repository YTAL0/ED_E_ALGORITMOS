package org.example;

import Linked_List.LinkedList;

public class Main {
    static void main() {
        LinkedList List = new LinkedList();

        List.addValue("Babalu");
        List.addValue("Baba");
        List.addValue("Balu");
        IO.println(List.getLenght());
        IO.println(List.getFirst().getValue());
        IO.println(List.getLast().getValue());
    }
}
