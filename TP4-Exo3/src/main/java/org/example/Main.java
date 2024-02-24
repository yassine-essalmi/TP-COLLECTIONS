package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> group1 = new HashSet<>();
        HashSet<String> group2 = new HashSet<>();
        group1.add("amine");
        group1.add("yassine");
        group1.add("mohamed");

        group2.add("yasser");
        group2.add("amine");
        group2.add("rachid");

        // Ajouter des noms des étudiants à chaque HashSet.
        for (String s : group1) {
            System.out.println(s);
        }

        for (String s : group2) {
            System.out.println(s);
        }
        System.out.println("+---------------------------------+");
        // Afficher l’intersection des deux HashSets.
        HashSet<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        intersection.forEach(System.out::println);

        System.out.println("+---------------------------------+");
        // Afficher l’union des deux HashSets.
        HashSet<String> union = new HashSet<>(group1);
        union.addAll(group2);
        union.forEach(System.out::println);

        }
}