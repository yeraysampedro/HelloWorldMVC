/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 *
 * @author Yeray
 */
public class ViewFactory {

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

    public static String dataType;

    /**
     * Method that returns the view depending on the typeSelector.properties
     * archive
     *
     * @return view, the view selected by the user
     */
    public static View getView() {
        View view;
        // comprobar datatype = null o no
        if (dataType == null) {
            dataType = ResourceBundle.getBundle("resources.typeSelector").getString("VIEW");
        }

        switch (dataType) {
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

    public void setView(String dataType) {
        this.dataType = dataType;
    }

}
