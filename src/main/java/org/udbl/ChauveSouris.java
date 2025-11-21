package org.udbl;

public class ChauveSouris extends Mammifere implements Volant{
    public ChauveSouris(double taille, String espece, double poids, int age, String nom, String typePoils) {
        super(taille, espece, poids, age, nom, typePoils);
    }

    @Override
    public void voler(double distance) {
        System.out.println(this.nom+"vole à une distance de "+distance);
    }

    @Override
    public void faireDubruit(String cri) {
        System.out.println(this.nom +"est entrain de"+cri);
    }
}
