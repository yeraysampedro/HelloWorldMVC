/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Class that implements the Model interface
 *
 * @author Yeray Sampedro, Ander Arruza
 */
public class FileImplementation implements Model {

    private ResourceBundle file;

    @Override
    public String getGreeting() throws Exception {
        file = ResourceBundle.getBundle("resources.greeting");
        String greeting = file.getString("TEXT");
        return greeting;
    }

}
