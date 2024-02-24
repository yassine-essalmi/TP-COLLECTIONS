package presentation;

import metier.Produit;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // • Ajouter des produits.
        Produit p1 = new Produit(1, "PC", 8000);
        Produit p2 = new Produit(2, "Imprimante", 1500);
        Produit p3 = new Produit(3, "Smartphone", 5000);
        Produit p4 = new Produit(4, "Tablette", 2000);
        produits.add(p1);
        produits.add(p2);
        produits.add(p3);
        produits.add(p4);
        System.out.println("Liste des produits :" + produits);

        // • Supprimer un produit par indice.
        produits.remove(0);

        // • Afficher la liste des produits.
        for (Produit produit : produits) {
            System.out.println(produit);
        }

        // • Modifier un produit par indice.
        System.out.println("Entrez l'indice du produit à modifier : ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < produits.size()) {
            System.out.println("Entrez le nouveau nom du produit : ");
            String nouveauNom = scanner.next();
            System.out.println("Entrez le nouveau prix du produit : ");
            double nouveauPrix = scanner.nextDouble();
            Produit produit = produits.get(indice);
            produit.setNom(nouveauNom);
            produit.setPrix(nouveauPrix);
            System.out.println("Produit modifié : " + produit);
        } else {
            System.out.println("Indice invalide");
        }

        // • Rechercher un produit dont le nom est tapé par l’utilisateur.
        System.out.println("Entrez le nom du produit à rechercher : ");
        String nomRecherche = scanner.next();
        boolean produitTrouve = false;
        for (Produit p : produits) {
            if (p.getNom().equals(nomRecherche)) {
                System.out.println("Produit trouvé : " + p);
                produitTrouve = true;
            }
        }
        if (!produitTrouve) {
            System.out.println("Produit non trouvé");
        }
    }
}
