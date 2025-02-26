package exoEngins;

/**
 * La classe Flottant représente un engin conçu pour se déplacer sur l'eau.
 * Elle hérite de la classe {@code Engin} et définit son propre comportement de conduite.
 */
public class Flottant extends Engin {

    /**
     * Constructeur de la classe Flottant.
     * 
     * @param propulsion Le système de propulsion utilisé par l'engin flottant.
     */
    public Flottant(Propulsion propulsion) {
        // Le constructeur ne fait rien actuellement, il pourrait initialiser la propulsion.
    }

    /**
     * Simule la conduite d'un engin flottant.
     * Affiche un message indiquant que l'engin est propulsé par un moteur électrique.
     */
    @Override
    public void conduire() {
        System.out.println("(SIMULATION) Cet engin flottant est propulsé par un moteur électrique. Il consomme 272.38 énergie.");
    }
}