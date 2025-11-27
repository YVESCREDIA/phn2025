package org.udbl;

public abstract class Poisson extends Oiseau implements Volant{
    public Poisson(double taille, String espece, double poids, int age, String nom, double envergureAiles) {
        super(taille, espece, poids, age, nom, envergureAiles);
    }

    @Override
    public void voler(double distance) {
        System.out.println(this.nom+" nage à une distance de "+distance);
    }
}
