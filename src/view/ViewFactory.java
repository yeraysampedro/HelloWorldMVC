/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * Class that instanciates a view
 *
 * @author Yeray Sampedro, Ander Arruza
 */
public class ViewFactory {

    /**
     *  Protected method to prevent the creation of ViewFactory type objects
     */
    protected ViewFactory() {
    }

    /**
     * String that establishes the name for the JavaFX type view
     */
    public static final String JFX = "JFX";

    /**
     * String that establishes the name for the Swing type view
     */
    public static final String SWING = "SWING";

    /**
     * String that establishes the name for the Console type view
     */
    public static final String CONSOLE = "CONSOLE";

    /**
     * The type of data to choose, mainly used for testing the factory
     */
    public static String viewType;

    /**
     * Method that returns the view depending on the typeSelector.properties
     * archive
     *
     * @return view, the view selected by the user
     */
    public static View getView() {
        View view;
        if (viewType == null) {
            viewType = ResourceBundle.getBundle("resources.typeSelector").getString("VIEW");
        }

        switch (viewType) {
            case (JFX):
                view = new JFXImplementation();
                break;
            case (SWING):
                view = new SwingImplementation();
                break;
            case (CONSOLE):
                view = new ConsoleImplementation();
                break;
            default:
                view = null;
        }
        return view;
    }

    /**
     * The method to set the view
     *
     * @param viewType
     */
    public void setView(String viewType) {
        this.viewType = viewType;
    }

}
