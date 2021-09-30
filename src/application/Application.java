/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import model.ModelFactory;
import view.ViewFactory;

/**
 * Application main class
 *
 * @author Yeray Sampedro, Ander Arruza
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Controller(ModelFactory.getModel(), ViewFactory.getView()).run();
    }

}
