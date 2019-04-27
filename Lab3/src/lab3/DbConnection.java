//Zadanie 1.
package lab3;

/**
 *
 * @author Student
 */
public interface DbConnection {
    void Open();
    void Close();
    void ExecuteSQL(String sql);
}
