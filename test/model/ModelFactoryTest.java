/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {

    private Model model;
    private final String modelType = "MYSQL";

    @Before
    public void testInstance() {
        model = ModelFactory.getModel();
    }

    @Test
    public void testMYSQLInstance() {
        assertTrue(model instanceof MYSQLImplementation);
    }

    @Test
    public void testFileInstance() {
        assertTrue(model instanceof FileImplementation);
    }

    @Test
    public void testIsInstanced() {
        ModelFactory factory = new ModelFactory();
        factory.setModel(modelType);
        model = ModelFactory.getModel();
        assertNotNull(model);
    }

}
