package org.example;
//alle properties sind "private" und "final"
public record StudentRecord(String id,
                            String firstName,
                            String lastName,
                            int age) {
    //Wither: Methodenart ähnlich wie ein Setter (freiwillig)
    public StudentRecord withFirstname(String newName) {
        return new StudentRecord(id, newName, lastName, age);
    }

}

