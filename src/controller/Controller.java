/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Model;
import view.View;


/**
 *
 * @author Yeray&Ander
 */
public class Controller {

    Model model;
    View view;

    /**
     *
     */
    public void run() {
        try {
            view.showGreeting(model.getGreeting());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     *  Sets the model and the view type based on the ones received by the Application class
     * @param receivedModel
     * @param receivedView
     */
    public Controller(Model receivedModel, View receivedView) {
        view = receivedView;
        model =receivedModel;
    }
}
