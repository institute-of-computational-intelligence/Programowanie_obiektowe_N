package javalab3;

/**
 *
 * @author PC
 */
public interface DbConnection {
    void Open();
    void Close();
    void ExecuteSQL(String sql);
}
