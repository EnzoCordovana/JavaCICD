package exoEngins;

/**
 * La classe Eolienne représente un système de propulsion utilisant l'énergie éolienne.
 * Elle hérite de la classe {@code Propulsion} et définit une méthode
 * pour calculer la consommation d'énergie, qui est nulle dans ce cas.
 */
public class Eolienne extends Propulsion {

    /**
     * Retourne la consommation d'énergie de la propulsion éolienne.
     * Étant donné que l'énergie éolienne est renouvelable et ne nécessite pas 
     * de carburant, cette méthode retourne toujours 0.
     * 
     * @return 0, car l'énergie éolienne ne consomme pas de carburant.
     */
    @Override
    public double consommerEnergie() {
        return 0;
    }

    /**
     * Retourne une représentation textuelle de l'objet Eolienne.
     * 
     * @return Une chaîne indiquant qu'il s'agit d'une propulsion éolienne.
     */
    @Override
    public String toString() {
        return "Eolienne []";
    }
}