package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Yeray
 */
public abstract class BDConnection {

    /**
     * Attribute for the connection
     */
    protected Connection con;

    /**
     * Attribute for the prepared statement
     */
    protected PreparedStatement stmt;
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;

    /**
     * Method that connects into the MYSQL database reading the url, user and password from an archive
     * @throws Exception Generic exception
     */
    protected void connect() throws Exception {
        try {
            configFile = ResourceBundle.getBundle("resources.bdconfig");
            url = configFile.getString("URL");
            user = configFile.getString("USER");
            pass = configFile.getString("PASSWORD");
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }

    /**
     *Method that disconnects from the MYSQL database
     * @throws Exception Generic exception
     */
    protected void disconnect() throws Exception {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }

    /**
     * Method that closes the resulsets
     * @param rs result set to be closed
     * @throws SQLException SQL exception
     * @throws Exception Generic exception
     */
    protected void closeRs(ResultSet rs) throws SQLException, Exception {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new Exception("Error con la búsqueda en la BBDD");
            }
        }
    }

}
