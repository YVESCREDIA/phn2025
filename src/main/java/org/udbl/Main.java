package org.udbl;

import org.udbl.dao.AnimalBddRepository;
import org.udbl.database.DbConnection;
import org.udbl.entity.Animal;
import org.udbl.entity.ChauveSouris;
import org.udbl.entity.Perroquet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException{

        Animal animal = new Perroquet(5, "XXW", 8, 0, "Coco", 4);
        Animal animal2 = new ChauveSouris(5, "eec", 4, 5, "eer", "brun");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);


        Connection conn = DbConnection.getConnection();
        AnimalBddRepository repo = new AnimalBddRepository(conn);
        // repo.save(animals);
        // System.out.println("Insertion réussie !");

        repo.load().forEach(a -> {
            System.out.println(a.getEspece() + " - " + a.getTaille() + " - " + a.getPoids());
        });

    }
}
