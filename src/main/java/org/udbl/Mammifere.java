package org.udbl;

public abstract class Mammifere extends Animal {
    private String typePoils;
    public Mammifere(double taille, String espece,
                     double poids, int age, String nom,String typePoils) {
        super(taille, espece, poids, age, nom);
        this.typePoils=typePoils;

    }

    public void allaiter(){
        System.out.println(this.nom+" est entrain d'allaiter");
    }

    public void description(){
        super.description();
        System.out.println("type de poils :"+this.typePoils);
    }

}
