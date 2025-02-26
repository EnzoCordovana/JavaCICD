package exoEngins;

/**
 * La classe abstraite Engin représente un véhicule ou un appareil motorisé.
 * Chaque engin possède un identifiant unique et une propulsion.
 */
public abstract class Engin {
    
    /** Dernier identifiant attribué à un engin */
    private static int dernierId = 0;
    
    /** Identifiant unique de l'engin */
    private int id;
    
    /** Système de propulsion de l'engin */
    private Propulsion propulsion;

    /**
     * Constructeur par défaut de la classe Engin.
     */
    public Engin() {
        // L'ID n'est pas initialisé ici, cela pourrait être amélioré.
    }

    /**
     * Méthode abstraite devant être implémentée par les sous-classes
     * pour définir le comportement de conduite de l'engin.
     */
    public abstract void conduire();

    /**
     * Retourne le dernier identifiant attribué à un engin.
     * 
     * @return Le dernier identifiant utilisé.
     */
    public static int getDernierId() {
        return Engin.dernierId;
    }

    /**
     * Retourne le système de propulsion de l'engin.
     * 
     * @return La propulsion actuelle de l'engin.
     */
    public Propulsion getPropulsion() {
        return this.propulsion;
    }

    /**
     * Définit le système de propulsion de l'engin.
     * 
     * @param propulsion Le nouveau système de propulsion.
     */
    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }

    /**
     * Retourne l'identifiant unique de l'engin.
     * 
     * @return L'identifiant de l'engin.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retourne une représentation textuelle de l'engin.
     * 
     * @return Une chaîne contenant l'identifiant de l'engin.
     */
    @Override
    public String toString() {
        return "Engin [id=" + this.id + "]";
    }
}