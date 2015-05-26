package ru.javacourse.db;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class FirstDB {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/javacourse";
        String login = "postgres";
        String password = "postgres";

        try {
            Connection conn = DriverManager.getConnection(url, login, password);
            try {
                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO st_group (groupname, curator, speciality) VALUES (?, ?, ?)",
                        new String[] {"group_id", "speciality"});
                stmt.setString(1, "Simple group");
                stmt.setString(2, "Simple curator");
                stmt.setString(3, "Simple speciality");
                stmt.executeUpdate();

                ResultSet rs = stmt.getGeneratedKeys();
                if(rs.next()) {
                    Long groupId = rs.getLong("group_id");
                    String sp = rs.getString("speciality");
                    System.out.println("ID:" + groupId + ":" + sp);

                }
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (Exception ex) {

        }
    }
}
