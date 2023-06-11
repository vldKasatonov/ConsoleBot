package main;

public class Main {
    public static void main(String[] args) {
        NotesDatabase.createTable();
        Note note = new Note();
        NotesDatabase.insertNotes(note);
    }
}

