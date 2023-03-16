package com.example.traderbot.bougie;

public class BougieBaissiere extends Bougie {
    protected double x = 0;
    protected double y = 0;
    protected double z = 0;

    public BougieBaissiere(double entree, double sortie, double haut, double bas) {
        super(entree, sortie, haut, bas);
        this.x = haut - entree;
        this.y = entree - sortie;
        this.z = sortie - bas;
        CalculSignal();
    }

    public void CalculSignal() {
        if(x == 0 && z == 0) {
            this.signal = "Vente forte";
        } else if(x == 0 && z != 0) {
            if(y <= 0.2 * (z + y)) {
                this.signal = "Vente risque";
            } else {
                this.signal = "Vente neutre";
            }
        } else if(x != 0 && z == 0) {
            if(y <= 0.2 * (x + y)) {
                this.signal = "Vente";
            } else {
                this.signal = "Vente neutre";
            }
        } else {
            if(aPeuPresEgalA(x, z, (x + y + z)/10) && y > (x + z)) {
                this.signal = "Vente";
            } else {
                this.signal = "Vente neutre";
            }
        }
    }
}
