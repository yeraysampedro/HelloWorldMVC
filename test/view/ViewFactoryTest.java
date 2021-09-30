/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Yeray and Ander
 */
public class ViewFactoryTest {

    private View view;
    private String viewType = "SWING";

    @Before
    public void testInstance() {
        view = ViewFactory.getView();
    }

    @Test
    public void testJFXInstance() {
        assertTrue(view instanceof JFXImplementation);
    }

    @Test
    public void testSwingInstance() {
        assertTrue(view instanceof SwingImplementation);
    }

    @Test
    public void testConsoleInstance() {
        assertTrue(view instanceof ConsoleImplementation);
    }

    @Test
    public void testIsInstanced() {
        ViewFactory factory = new ViewFactory();
        factory.setView(viewType);
        view = factory.getView();
        assertNotNull(view);
    }

}
