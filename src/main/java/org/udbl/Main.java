package org.udbl;

import org.udbl.entity.Animal;
import org.udbl.entity.Perroquet;
import org.udbl.gestion.AgeValidatorException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    Animal animal=new Perroquet(5,"XXW",8,0,"Coco",4);

    System.out.println(animal.toString());





    }
}