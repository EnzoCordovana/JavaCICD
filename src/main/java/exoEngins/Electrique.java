package exoEngins;

/**
 * La classe Electrique représente un moteur électrique utilisé comme propulsion.
 * Elle hérite de la classe {@code Propulsion} et définit une méthode 
 * pour calculer la consommation d'énergie en fonction de la masse du véhicule.
 */
public class Electrique extends Propulsion {

    /** Consommation énergétique de base (en MJ/kg) */
    private static double baseConso = 3.14;
    
    /** Perte énergétique fixe (en MJ) */
    private static double perte = 62.0;
    
    /** Masse du moteur électrique (en Newtons) */
    private double masse;

    /**
     * Constructeur de la classe Electrique.
     * Initialise la masse en fonction du poids donné en kg.
     * 
     * @param poids Poids du véhicule en kilogrammes.
     */
    public Electrique(double poids) {
        this.masse = poids * 9.81;
    }

    /**
     * Calcule la consommation d'énergie du moteur électrique.
     * 
     * @return La consommation d'énergie en mégajoules (MJ).
     */
    @Override
    public double consommerEnergie() {
        return Electrique.baseConso * this.masse + Electrique.perte; 
    }

    /**
     * Retourne la masse du moteur électrique.
     * 
     * @return La masse en Newtons.
     */
    public double getMasse() {
        return this.masse;
    }

    /**
     * Modifie la masse du moteur électrique.
     * 
     * @param masse Nouvelle masse en Newtons.
     */
    public void setMasse(double masse) {
        this.masse = masse;
    }

    /**
     * Retourne la consommation énergétique de base.
     * 
     * @return La consommation énergétique de base en MJ/kg.
     */
    public static double getBaseConso() {
        return baseConso;
    }

    /**
     * Modifie la consommation énergétique de base.
     * 
     * @param newBaseConso Nouvelle valeur de la consommation énergétique de base en MJ/kg.
     */
    public static void setBaseConso(double newBaseConso) {
        baseConso = newBaseConso;
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
     * Retourne une représentation textuelle de l'objet Electrique.
     * 
     * @return Une chaîne contenant la masse du moteur électrique.
     */
    @Override
    public String toString() {
        return "Electrique [masse=" + this.masse + "]";
    }
}