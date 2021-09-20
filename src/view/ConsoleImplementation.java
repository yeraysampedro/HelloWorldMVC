/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 * @author Ander Arruza
 */
public class ConsoleImplementation implements View{
    
    /**
     * Show the text that comes as a parameter in the console.
     * @param text 
     */
    @Override
    public void showGreeting(String text) {
        System.out.println(text);
    }
    
}
