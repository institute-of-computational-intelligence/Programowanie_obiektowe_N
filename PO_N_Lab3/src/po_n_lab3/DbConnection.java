/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab3;

/**
 *
 * @author Notebook
 */
public interface DbConnection {
    void Open();
    void Close();
    void ExecuteSQL(String sql);
}
