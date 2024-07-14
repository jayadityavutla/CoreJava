package com.scaler.advancejava.generics;

public class Pair<First, Second> {
    First f;
    Second s;

    public Pair(First f, Second s) {
        this.f = f;
        this.s = s;
    }

    public First getF() {
        return f;
    }

    public void setF(First f) {
        this.f = f;
    }

    public Second getS() {
        return s;
    }

    public void setS(Second s) {
        this.s = s;
    }
}
