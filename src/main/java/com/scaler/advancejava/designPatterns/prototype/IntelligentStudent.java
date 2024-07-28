package com.scaler.advancejava.designPatterns.prototype;

public class IntelligentStudent extends Student {
    private int iq;
    public IntelligentStudent() {

    }
    public IntelligentStudent(IntelligentStudent is) {
        super(is);//Fill the attributes of students for us
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }
}
