package com.scaler.advancejava.designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        //If entity is fixed for base(OrangeCone) design constructor to not pass anything
//        IceCream ice = new OrangeCone();
//        ice = new VanillaScoop(ice);
//        ice = new ChocoChips(ice);

        //If entity (OrangeCone) is acting like both base and addon
        IceCream ic = null;
        ic = new ChocoChips(
                new ButterScotchScoop(
                        new ChocolateCone(
                                new VanillaScoop(
                                        new OrangeCone(ic)
                                )
                        )
                )
        );

        System.out.println(ic.getDescription());
        System.out.println(ic.getCost());
    }
}
