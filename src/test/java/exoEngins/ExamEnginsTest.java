package exoEngins;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class ExamEnginsTest {
	
    @Before
    public void reset() {
    	Electrique.setBaseConso(3.14);
    	Electrique.setPerte(62.0);
    	Thermique.setPerte(64.0);
    }

    @Test
    public void testValeurGazole() {
    	int val = Carburant.ID_GAZOLE;
    	int valGazole = 0;
    	assertEquals(valGazole, val);
    }

    @Test
    public void testGetConsoGazole() {
    	double val = Carburant.getConso(Carburant.ID_GAZOLE);
    	double valAttendue = 49.3;
    	assertEquals(valAttendue, val, 0);
    }

    @Test
    public void testNbCarburants() {
    	int val = Carburant.nbCarburants;
    	int valAttendue = 3;
    	assertEquals(valAttendue, val);
    }

    /*
     * Tester la méthode Carburant.nom() pour le gazole.
    */
    @Test
    public void testNomGazole() {
    	String val = Carburant.nom(Carburant.ID_GAZOLE);
    	String valAttendue = "gazole";
    	assertEquals(valAttendue, val);
    }

    /*
     * Construire un nouvel objet Therminque dans une variable Propulsion. 
     * Vérifier que la masse de l’objet est bien celle fournie au moment de sa construction.
    */
    @Test
    public void testMasseConstructionPropulsionThermiqueEssence() {
    	double masse = 10.0;
    	Thermique myThermique = new Thermique(masse, Carburant.ID_ESSENCE);
    	double val = myThermique.getMasse();
    	double valAttendue = masse;
    	assertEquals(valAttendue, val, 0);
    }

    /*
     * Tester toString()
    */
    @Test
    public void testEoliennetoString() {
    	Eolienne myEolienne = new Eolienne();
    	String val = myEolienne.toString();
    	String valAttendue = "Eolienne []";
    	assertEquals(valAttendue, val);
    }

    /*
     * Tester toString()
    */
    @Test
    public void testElectriqueToString() {
    	double poids = 1;
    	Electrique myElectrique = new Electrique(poids);
    	String val = myElectrique.toString();
    	String valAttendue = "Electrique [masse=9.81]";
    	assertEquals(valAttendue, val);
    }

    /*
     * Tester toString()
    */
    @Test
    public void testThermiqueToString() {
    	double masse = 1.0;
    	Thermique myThermique = new Thermique(masse, Carburant.ID_GAZOLE);
    	String val = myThermique.toString();
    	String valAttendue = "Thermique [masse=1.0, carburant=gazole]";
    	assertEquals(valAttendue, val);
    }

    /*
     * Construire un nouvel objet Therminque dans une variable Propulsion. 
     * Vérifier que le carburant de l’objet est bien celui demandé au moment de sa construction.
    */
    @Test
    public void testConstructionPropulsionThermiqueEssenceCarburant() {
    	double masse = 1.0;
    	Thermique myThermique = new Thermique(masse, Carburant.ID_GAZOLE);
    	int val = myThermique.getCarburant();
    	int valAttendue = Carburant.ID_GAZOLE;
    	assertEquals(valAttendue, val);
    }

    /*
     * Vérifier que la construction d’un objet Thermique avec un carburant illegal n’échoue pas, 
     * mais ramène dans l’intervalle autorisé la valeur entière illégale fournie lors de la construction.
    */
    @Test
    public void testConstructionPropulsionThermiqueCarburantIllegal() {
    	double masse = 1;
    	Thermique myThermique = new Thermique(masse, 4);
//    	assertNotNull(myThermique.getCarburant());
    	assertEquals(myThermique.getCarburant(), 0 | 1 | 2 | 3);
    }

    /*
     * Construire un objet Thermique avec un carburant légal, 
     * puis tenter de modifier son carburant pour le remplacer par un carburant illégal.
     *  
     * Vérifier que la tentative n’échoue pas, 
     * mais ramène dans l’intervalle autorisé la valeur entière illégale fournie.
    */
    @Test
    public void testThermiqueSetCarburantIllegal() {
// TODO
    }

    /*
     * Tester Thermique.getPerte()
    */
    @Test
    public void testThermiquePerteStatic() {
// TODO
    }

    /*
     * Tester Thermique.setPerte()
    */
    @Test
    public void testThermiqueSetPerteStatic() {
// TODO
    }

    /*
     * Tester consommerEnergie()
    */
    @Test
    public void testThermiqueConsommerEnergie() {
// TODO

    }

    /*
     * Tester consommerEnergie()
    */
    @Test
    public void testElectriqueConsommerEnergie() {
// TODO
    }

    /*
     * Tester consommerEnergie()
    */
    @Test
    public void testEolienneConsommerEnergie() {
// TODO
    }

    /*
     * Tester le calcul de l’identifiant pour un engin roulant thermique.
     * 
     * Pour cela, on procèdera comme suit pour chacun des 2 tests :
     * 	1. récupérer la valeur du dernier identifiant utilisé pour un engin quel qu’il soit
     * 	2. créer deux engins, respectivement roulants et flottants
     * 	3. vérifier la valeur de l’identifiant du dernier engin créé
    */
    @Test
    public void testIdEnginRoulantThermique() {
// TODO
    }

    /*
     * Tester le calcul de l’identifiant pour un engin flottant électrique.
     * 
     * Pour cela, on procèdera comme suit pour chacun des 2 tests :
     * 	1. récupérer la valeur du dernier identifiant utilisé pour un engin quel qu’il soit
     * 	2. créer deux engins, respectivement roulants et flottants
     * 	3. vérifier la valeur de l’identifiant du dernier engin créé
    */
    @Test
    public void testIdEnginFlottantElectrique() {
// TODO
    }

    /*
     * Construire 3 engins :
     * 	— un roulant thermique
     * 	— un roulant electrique
     * 	— un flottant éolien.
     * 
     * Vérifier avec Engin.getDernierId() 
     * que la valeur du dernier identifiant a bien été modifiée en conséquence.
    */
    @Test
    public void testDernierIdEngin() {
// TODO
    }

    /*
     * Construire en engin roulant thermique, 
     * et vérifier que engin.getPropulsion() retourne la bonne valeur.
    */
    @Test
    public void testEnginGetPropulsion() {
// TODO
    }

    /*
     * Construire un objet Roulant Thermique dans une variable Engin, 
     * et vérifier son toString().
    */
    @Test
    public void testEnginToString() {
// TODO
    }

    /*
     * 
    */
    @Test
    public void testFlottantConduire() {
    	Propulsion propulsion = new Thermique(42.0, Carburant.ID_ESSENCE);
    	Engin engin = new Flottant(propulsion);
    	double valEnergie = propulsion.consommerEnergie();
    	String valAttendue = String.format(
    			"(SIMULATION) Cet engin flottant est propulsé par un moteur Thermique. Il consomme %.1f énergie.",
    			valEnergie);
    	label1: try {
    		File sortieFic = new File("tmpOut.txt");
    		PrintStream sortiePrintStream = new PrintStream(sortieFic);
    		System.setOut(sortiePrintStream);
    		engin.conduire();
    		FileReader sortieFileReader = new FileReader(sortieFic);
    		char[] cbuf = new char[valAttendue.length()];
    		sortieFileReader.read(cbuf);
    		sortieFileReader.close();
    		//	    System.err.println("Lu: " + String.copyValueOf(cbuf));
    		String valObservee = String.copyValueOf(cbuf);
    		assertEquals(valAttendue, valObservee);
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		label2: e.printStackTrace();
    	}
    }

    /*
     * 
    */
    @Test
    public void testRoulantConduire() {
// TODO
    }

}
