/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;

/**
 *
 * @author Yeray
 */
public class MYSQLImplementation extends BDConnection implements Model {

    @Override
    public String getGreeting() throws Exception {
        String greeting = null;
        try {
            connect();
            stmt = con.prepareStatement("SELECT * FROM GREETING");
            stmt.executeQuery();
            ResultSet rs = null;
            rs = stmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    greeting = rs.getString("greeting");
                }
            }
            disconnect();
        } catch (Exception e) {
        }

        return greeting;
    }

}