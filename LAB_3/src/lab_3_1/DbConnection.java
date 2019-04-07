package lab_3_1;

public interface DbConnection {
    void Open();
    void Close();
    void ExecuteSQL(String sql);
}
