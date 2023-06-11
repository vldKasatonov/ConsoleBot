package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class NotesDatabase {
    private static final String CREATE_TABLE = "CREATE TABLE my_notes (id SERIAL PRIMARY KEY, note VARCHAR(1000), created_at TIMESTAMP)";
    private static final String INSERT_NOTE = "INSERT INTO my_notes (note, created_at) VALUES ('%s','%s')";

    public static void createTable() {
        try {
            executeQuery(CREATE_TABLE);
            System.out.println("The table has been created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error occurred while creating the table.");
        }
    }

    public static void insertNotes(Note note) {
        String query = String.format(INSERT_NOTE, note.getMessage(), note.getCreatedAt());
        try {
            executeQuery(query);
            System.out.println("The note has been successfully created.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error occurred while creating the note.");
        }
    }

    public static void executeQuery(String sql) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        statement.close();
        connection.close();
    }
}
