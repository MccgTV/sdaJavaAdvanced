package com.sda.zoo;

public abstract class Animal {

    private boolean eatsMeats;

    abstract void eat (String something);

    boolean doYouEatMeat() {
        return eatsMeats;
    }

}
