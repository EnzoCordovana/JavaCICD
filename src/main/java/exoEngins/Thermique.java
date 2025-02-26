package exoEngins;

/**
 * La classe Thermique représente un système de propulsion fonctionnant avec un carburant.
 * Elle hérite de la classe {@code Propulsion} et définit une méthode 
 * pour calculer la consommation d'énergie en fonction du carburant utilisé et de la masse du véhicule.
 */
public class Thermique extends Propulsion {

    /** Perte énergétique fixe associée à la propulsion thermique (en MJ) */
    private static double perte = 64;

    /** Masse du moteur thermique (en kg) */
    private double masse;

    /** Identifiant du type de carburant utilisé */
    private int carburant;

    /**
     * Constructeur de la classe Thermique.
     * 
     * @param masse Masse du moteur en kilogrammes.
     * @param carburant Identifiant du carburant utilisé ({@code Carburant.ID_GAZOLE}, {@code Carburant.ID_ESSENCE}, {@code Carburant.ID_ETHANOL}).
     */
    public Thermique(double masse, int carburant) {
        this.masse = masse;
        this.carburant = carburant;
    }

    /**
     * Calcule la consommation d'énergie du moteur thermique.
     * 
     * @return La consommation d'énergie en mégajoules (MJ).
     */
    @Override
    public double consommerEnergie() {
        return Carburant.getConso(carburant) * this.masse + Thermique.perte;
    }

    /**
     * Retourne la masse du moteur thermique.
     * 
     * @return La masse en kilogrammes.
     */
    public double getMasse() {
        return this.masse;
    }

    /**
     * Modifie la masse du moteur thermique.
     * 
     * @param masse Nouvelle masse en kilogrammes.
     */
    public void setMasse(double masse) {
        this.masse = masse;
    }

    /**
     * Retourne la perte énergétique fixe.
     * 
     * @return La perte énergétique en MJ.
     */
    public static double getPerte() {
        return perte;
    }

    /**
     * Modifie la perte énergétique fixe.
     * 
     * @param newPerte Nouvelle valeur de la perte énergétique en MJ.
     */
    public static void setPerte(double newPerte) {
        perte = newPerte;
    }

    /**
     * Retourne l'identifiant du carburant utilisé.
     * 
     * @return L'identifiant du carburant ({@code Carburant.ID_GAZOLE}, {@code Carburant.ID_ESSENCE}, {@code Carburant.ID_ETHANOL}).
     */
    public int getCarburant() {
        return this.carburant;
    }

    /**
     * Modifie le type de carburant utilisé.
     * 
     * @param carburant Nouvel identifiant du carburant.
     */
    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    /**
     * Retourne une représentation textuelle de l'objet Thermique.
     * 
     * @return Une chaîne contenant la masse et le type de carburant du moteur thermique.
     */
    @Override
    public String toString() {
        return "Thermique [masse=" + this.masse + ", carburant=" + Carburant.nom(this.carburant) + "]";
    }
}