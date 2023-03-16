package com.example.traderbot.bougie;

public class BougieHaussiere extends Bougie{
    protected double x = 0;
    protected double y = 0;
    protected double z = 0;

    public BougieHaussiere(double entree, double sortie, double haut, double bas) {
        super(entree, sortie, haut, bas);
        this.x = haut - sortie;
        this.y = sortie - entree;
        this.z = entree - bas;
        CalculSignal();
    }
    public void CalculSignal() {
        if(x == 0 && z == 0) {
            this.signal = "Achat fort";
        } else if(x == 0 && z != 0) {
            if(y <= 0.2 * (z + y)) {
                this.signal = "Achat";
            } else {
                this.signal = "Achat neutre";
            }
        } else if(x != 0 && z == 0) {
            if(y <= 0.2 * (x + y)) {
                this.signal = "Achat risque";
            } else {
                this.signal = "Achat neutre";
            }
        } else {
            if(aPeuPresEgalA(x, z, (x + y + z)/10) && y > (x + z)) {
                this.signal = "Achat";
            } else {
                this.signal = "Achat neutre";
            }
        }
    }

}
