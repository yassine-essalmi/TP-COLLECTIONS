import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>();

        // Ajouter des étudiants.
        notes.put("amine", 16.0);
        notes.put("yassine", 18.0);
        notes.put("mohamed", 14.0);

        // Augmenter la note d’un étudiant.
        notes.replace("amine", notes.get("amine") + 1);
        System.out.println("La note de amine est : " + notes.get("amine"));

        // supprimer une note d un étudiant.
        notes.remove("amine");

        // Afficher la taille du map.
        System.out.println("La taille du map est : " + notes.size());

        // max, min et moyenne des notes.
        var somme = 0;
        var max = notes.get("yassine");
        var min = notes.get("yassine");
        for (Double v : notes.values()) {
            somme += v;
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
            System.out.println("la moyenne des notes est : " + somme / notes.size());
            System.out.println("la note max est : " + max);
            System.out.println("la note min est : " + min);
        }


        // Vérifier s’il y a une note égale à 20.
        boolean note20Existe = false;
        for (Double v : notes.values()) {
            if (v == 20) {
                note20Existe = true;
                break;
            }
        }
        if (note20Existe) {
            System.out.println("Il y a une note égale à 20");
        } else {
            System.out.println("Il n'y a pas de note égale à 20");
        }

        notes.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
