package org.udbl.dao;

import org.udbl.entity.Animal;
import org.udbl.entity.Perroquet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AnimalBddRepository implements AnimalRepository {

    private final Connection connection;

    public AnimalBddRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(List<Animal> animals) {
        String sql = "INSERT INTO animals (taille, espece, poids) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for (Animal animal : animals) {
                preparedStatement.setDouble(1, animal.getTaille());
                preparedStatement.setString(2, animal.getEspece());
                preparedStatement.setDouble(3, animal.getPoids());
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Animal> load() {
        List<Animal> animals = new ArrayList<>();
        String sql = "SELECT taille, espece, poids FROM animals";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                double taille = resultSet.getDouble("taille");
                String espece = resultSet.getString("espece");
                double poids = resultSet.getDouble("poids");
                // Here we assume all animals are Perroquet for simplicity
                Animal animal = new Perroquet(taille, espece, poids, 0, "Unknown", 0);
                animals.add(animal);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return animals;
    }


    @Override
    public void update(Animal animal) {
        String sql = "UPDATE animals SET taille = ?, espece = ?, poids = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, animal.getTaille());
            preparedStatement.setString(2, animal.getEspece());
            preparedStatement.setDouble(3, animal.getPoids());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Animal animal) {
        String sql = "DELETE FROM animals WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
