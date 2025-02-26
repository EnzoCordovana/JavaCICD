package exoEngins;

/**
 * La classe abstraite Propulsion représente un système de propulsion
 * utilisé par un engin.  
 * Chaque type de propulsion doit implémenter la méthode {@code consommerEnergie()} 
 * pour définir sa consommation énergétique spécifique.
 */
public abstract class Propulsion {

    /**
     * Calcule la consommation d'énergie du système de propulsion.
     * Cette méthode doit être implémentée par les classes dérivées.
     * 
     * @return La quantité d'énergie consommée.
     */
    public abstract double consommerEnergie();
}