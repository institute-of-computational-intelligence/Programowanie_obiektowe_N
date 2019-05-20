/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class ProductRepository implements IProductRepository {

    private String connectionString;
    // private Connection connection;

    public ProductRepository(String connectionString) {
        this.connectionString = connectionString;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Product> Get() {
        List<Product> products = new ArrayList<>();
        String sqlCmd = "SELECT ID\n"
                + "      ,TYPE\n"
                + "      ,NAME\n"
                + "      ,PRICE\n"
                + "  FROM PRODUCTS";
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(this.connectionString);
            statement = connection.prepareStatement(sqlCmd);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt("ID"),
                        resultSet.getString("TYPE"),
                        resultSet.getString("NAME"),
                        resultSet.getFloat("PRICE"));
                products.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return products;
    }

    @Override
    public Product Get(int id) {
        Product product = null;
        String sqlCmd = "SELECT ID\n"
                + "      ,TYPE\n"
                + "      ,NAME\n"
                + "      ,PRICE\n"
                + "  FROM PRODUCTS\n"
                + "  WHERE ID = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(this.connectionString);
            statement = connection.prepareStatement(sqlCmd);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            resultSet.next();
            product = new Product(resultSet.getInt("ID"),
                    resultSet.getString("TYPE"),
                    resultSet.getString("NAME"),
                    resultSet.getFloat("PRICE"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return product;
    }

    @Override
    public void Add(Product product) {
        String sqlCmd = "INSERT \n"
                + "INTO PRODUCTS \n"
                + "VALUES\n"
                + "(PRODUCT_ID_SEQUENCE.nextval,?,?,?)";
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(this.connectionString);
            statement = connection.prepareStatement(sqlCmd);
            statement.setString(1, product.getType());
            statement.setString(2, product.getName());
            statement.setFloat(3, product.getPrice());
            statement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void Update(Product product, int productId) {
        String sqlCmd = "UPDATE PRODUCTS\n"
                + "SET \n"
                + "TYPE = ?,\n"
                + "NAME = ?,\n"
                + "PRICE = ?\n"
                + "WHERE ID = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(this.connectionString);
            statement = connection.prepareStatement(sqlCmd);
            statement.setInt(4, productId);
            statement.setString(1, product.getType());
            statement.setString(2, product.getName());
            statement.setFloat(3, product.getPrice());
            statement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void Delete(int id) {
        String sqlCmd = "DELETE \n"
                + "FROM PRODUCTS \n"
                + "WHERE ID = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(this.connectionString);
            statement = connection.prepareStatement(sqlCmd);
            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
