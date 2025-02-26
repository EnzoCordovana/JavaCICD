package exoEngins;

/**
 * La classe Carburant gère les différents types de carburants disponibles
 * et leur consommation énergétique respective.
 * 
 * Elle fournit des constantes pour identifier les carburants,
 * ainsi que des méthodes permettant d'obtenir le nom et la consommation
 * énergétique d'un carburant donné.
 */
public class Carburant {

    /** Identifiant du carburant Gazole */
    public static final int ID_GAZOLE = 0;
    
    /** Identifiant du carburant Essence */
    public static final int ID_ESSENCE = 1;
    
    /** Identifiant du carburant Ethanol */
    public static final int ID_ETHANOL = 2;

    /** Nombre total de types de carburants disponibles */
    public static int nbCarburants = 3;

    /** Consommation énergétique du Gazole (en MJ/L) */
    private static double consoGazole = 49.3;
    
    /** Consommation énergétique de l'Essence (en MJ/L) */
    private static double consoEssence = 47.1;
    
    /** Consommation énergétique de l'Ethanol (en MJ/L) */
    private static double consoEthanol = 44.3;
    
    /** Consommation énergétique par défaut en cas d'erreur (en MJ/L) */
    private static double consoParDefaut = 3.14;

    /**
     * Retourne le nom du carburant correspondant à l'identifiant donné.
     * 
     * @param id L'identifiant du carburant (ID_GAZOLE, ID_ESSENCE ou ID_ETHANOL).
     * @return Le nom du carburant sous forme de chaîne de caractères.
     */
    public static String nom(int id) {
        switch(id) {
            case ID_GAZOLE:
                return "gazole";
            case ID_ESSENCE:
                return "essence";
            case ID_ETHANOL:
                return "ethanol";
            default:
                return "essence"; // Par défaut, retourne "essence"
        }
    }

    /**
     * Retourne la consommation énergétique du carburant spécifié.
     * 
     * @param carbu L'identifiant du carburant (ID_GAZOLE, ID_ESSENCE ou ID_ETHANOL).
     * @return La consommation énergétique en MJ/L. Retourne une valeur par défaut si l'identifiant est invalide.
     */
    public static double getConso(int carbu) {
        switch(carbu) {
            case ID_GAZOLE:
                return Carburant.consoGazole;
            case ID_ESSENCE:
                return Carburant.consoEssence;
            case ID_ETHANOL:
                return Carburant.consoEthanol;
            default:
                return Carburant.consoParDefaut;
        }
    }
}