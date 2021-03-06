/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Interface for model type classes
 *
 * @author Yeray Sampedro, Ander Arruza
 */
public interface Model {

    /**
     * Method that gets the greeting
     *
     * @return String, the greeting
     * @throws Exception Generic exception
     */
    public String getGreeting() throws Exception;
}
