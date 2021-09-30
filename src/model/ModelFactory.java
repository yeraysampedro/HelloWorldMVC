/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Class that instanciates a model
 *
 * @author Yeray Sampedro, Ander Arruza
 */
public class ModelFactory {

    /**
     *  Protected method to prevent the creation of ModelFactory type objects
     */
    protected ModelFactory() {
    }

    /**
     * String that establishes the name for the MYSQL type database
     */
    public static final String MYSQL = "MYSQL";

    /**
     * String that establishes the name for the FILE type data
     */
    public static final String FILE = "FILE";

    /**
     * String that establishes the type of data, mainly used for testing
     */
    public static String dataType;

    /**
     *    
     * Method that returns the data model depending on the
     * typeSelector.properties archive
     *
     *
     * @return model the model to return
     */
    public static Model getModel() {
        Model modelo;

        if (dataType == null) {
            dataType = ResourceBundle.getBundle("resources.typeSelector").getString("DATA");
        }

        switch (dataType) {
            case (MYSQL):
                modelo = new MYSQLImplementation();
                break;
            case (FILE):
                modelo = new FileImplementation();
                break;
            default:
                modelo = null;
                break;
        }
        return modelo;
    }

    /**
     * Method that sets the dasta type
     *
     * @param dataType the type of data to set
     */
    public static void setModel(String dataType) {
        ModelFactory.dataType = dataType;
    }

}
