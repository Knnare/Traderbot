package com.example.traderbot.bougie;

public class Bougie {
    protected double entree;
    protected double sortie;
    protected double haut;
    protected double bas;
    protected String signal = "";

    public Bougie(double entree, double sortie, double haut, double bas) {
        this.entree = entree;
        this.sortie = sortie;
        this.haut = haut;
        this.bas = bas;
    }

    public double getEntree() {
        return entree;
    }

    public double getSortie() {
        return sortie;
    }

    public double getHaut() {
        return haut;
    }

    public double getBas() {
        return bas;
    }

    public String getSignal() {
        return signal;
    }

    public Bougie CalculType() {
        if(this.getEntree() < this.getSortie()) {
            return new BougieHaussiere(entree, sortie, haut, bas);
        } else {
            return new BougieBaissiere(entree, sortie, haut, bas);
        }
    }

    public void CalculSignal() {}

    public boolean aPeuPresEgalA(double val1, double val2, double precision) {
        if(val1 <= val2) {
            return val2 - precision <= val1;
        } else {
            return val1 - precision <= val2;
        }
    }
}


