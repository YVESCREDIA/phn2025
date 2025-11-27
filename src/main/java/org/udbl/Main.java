package org.udbl;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       List<Animal>animaux = new ArrayList<>();

       animaux.add(new Perroquet(1.2,"Lion",190.0,8,"Simba",3.9));
       animaux.add(new ChauveSouris(0.3,"Chauve-souris",0.5,4,"Batou","Court"));
       animaux.add(new Personne(1.8,"Homme",75.0,30,"Alice","Française"));

       AnimalRepository repository = new AnimalListRepository();
       repository.save(animaux);

       for(Animal a : repository.load()){
           a.faireDubruit("Miolet");
       }
    }
}