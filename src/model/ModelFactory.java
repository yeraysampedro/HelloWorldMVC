/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author Yeray
 */
public class ModelFactory {

    /**
     * String that establishes the name for the MYSQL type database
     */
    public static final String MYSQL = "MYSQL";

    /**
     * String that establishes the name for the FILE type data
     */
    public static final String FILE = "FILE";

    /**
     * Method that returns the data model depending on the
     * typeSelector.properties archive
     *
     * @return
     */
    public static Model getModel() {
        Model modelo;
        ResourceBundle configFile = ResourceBundle.getBundle("resources.typeSelector");
        String dataType = configFile.getString("DATA");
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
}
