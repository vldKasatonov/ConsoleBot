package main;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Note {
    private String message;
    private LocalDateTime createdAt;

    public Note() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a note:");
        this.message = scanner.nextLine();
        this.createdAt = LocalDateTime.now();
    }


    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String toString() {
        return message + " " + createdAt;
    }
}
