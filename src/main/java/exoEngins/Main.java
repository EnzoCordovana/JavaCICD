package exoEngins;

/**
 * Classe principale contenant le point d'entrée du programme.
 * Elle permet de tester les différentes classes du package {@code exoEngins}.
 */
public class Main {

    /**
     * Méthode principale exécutant des tests sur les différentes classes d'engins et de propulsion.
     * 
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        // Création d'un moteur électrique avec une masse de 13 kg
        Propulsion moteur = new Electrique(13);
        System.out.println(moteur);

        // Remplacement par un moteur thermique fonctionnant au gazole avec une masse de 51 kg
        moteur = new Thermique(51, Carburant.ID_GAZOLE);
        System.out.println(moteur);

        // Création d'un engin roulant avec un moteur thermique fonctionnant à l'éthanol
        Engin tractopelle = new Roulant(new Thermique(27, Carburant.ID_ETHANOL));
        System.out.println(tractopelle);
        tractopelle.conduire();

        // Création d'un engin flottant avec une propulsion électrique
        Engin vaisseau = new Flottant(new Electrique(64));
        vaisseau.conduire();
    }
}