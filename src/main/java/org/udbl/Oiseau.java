package org.udbl;

public abstract class Oiseau extends Animal {
    private double envergureAiles;


    public Oiseau(double taille, String espece, double poids, int age, String nom,double envergureAiles) {
        super(taille, espece, poids, age, nom);
        this.envergureAiles=envergureAiles;
    }

    public void description(){
        super.description();
        System.out.println("Envergure :"+this.envergureAiles);
    }
}
