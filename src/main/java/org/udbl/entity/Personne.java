package org.udbl.entity;

import org.udbl.interfaces.Parlant;

public class Personne extends Mammifere implements Parlant {

    public Personne(double taille, String espece, double poids, int age, String nom, String typePoils) {
        super(taille, espece, poids, age, nom, typePoils);
    }

    @Override
    public void faireDubruit(String cri) {
        System.out.println(this.nom+" est entrain de "+cri);
    }

    @Override
    public void parler(String langue) {
        System.out.println(this.nom+" parle en "+langue);
    }
}
