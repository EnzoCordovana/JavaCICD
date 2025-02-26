package exoEngins;

/**
 * La classe Roulant représente un engin conçu pour se déplacer sur des surfaces solides.
 * Elle hérite de la classe {@code Engin} et définit son propre comportement de conduite.
 */
public class Roulant extends Engin {

    /**
     * Constructeur de la classe Roulant.
     * 
     * @param propulsion Le système de propulsion utilisé par l'engin roulant.
     */
    public Roulant(Propulsion propulsion) {
        // Le constructeur reçoit une propulsion mais ne l'affecte pas, il faudrait l'initialiser.
    }

    /**
     * Simule la conduite d'un engin roulant.
     * Affiche un message indiquant que l'engin est propulsé par un moteur thermique.
     */
    @Override
    public void conduire() {
        System.out.println("(SIMULATION) Conduire cet engin roulant nécessite un moteur à propulsion thermique dont la consommation d'énergie est de 3165.0.");
    }
}