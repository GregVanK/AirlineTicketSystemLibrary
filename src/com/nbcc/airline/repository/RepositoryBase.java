package com.nbcc.airline.repository;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author Chris.Cusack
 */
public class RepositoryBase {

    /**
     * Helps get a column alias
     * @param name
     * @param rs
     * @return
     * @throws SQLException 
     */
    protected int getByColumnLabel(String name, CachedRowSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int cols = rsmd.getColumnCount();
        int returnIndex = 0;
        for (int i = 1; i <= cols; ++i) {
            String colLabel = rsmd.getColumnLabel(i);
            String colName = rsmd.getColumnName(i);
            if (colName != null) {
                if (name.equalsIgnoreCase(colName) || name.equalsIgnoreCase(rsmd.getTableName(i) + "." + colName)) {
                    return (i);
                } else if (colLabel != null) {
                    if (name.equalsIgnoreCase(colLabel)) {
                        returnIndex = (i);
                    } else {
                        continue;
                    }
                }
            }
        }

        return returnIndex;
    }
}
