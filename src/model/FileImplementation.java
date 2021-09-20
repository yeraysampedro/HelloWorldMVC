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
public class FileImplementation implements Model{

    private final ResourceBundle file = ResourceBundle.getBundle("resources.greeting");;
    
    @Override
    public String getGreeting() throws Exception{
        return file.getString("greeting");
    }
    
}
