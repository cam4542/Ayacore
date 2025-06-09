
package com.omara.jem.kaori.environment;

import com.omara.jem.kaori.utils.Logger;

public class HumanClone {
    private String name;
    private boolean isAlive = true;
    private boolean hungry = true;
    private boolean needsSleep = true;
    private boolean needsBathroom = true;
    private boolean hasCold = false;
    private boolean organFailure = false;

    public HumanClone(String name) {
        this.name = name;
    }

    public void eat() {
        Logger.log("[HumanClone] " + name + " eats.");
        hungry = false;
    }

    public void drink() {
        Logger.log("[HumanClone] " + name + " drinks.");
    }

    public void sleep() {
        Logger.log("[HumanClone] " + name + " sleeps.");
        needsSleep = false;
    }

    public void useBathroom() {
        Logger.log("[HumanClone] " + name + " uses bathroom.");
        needsBathroom = false;
    }

    public void breathe() {
        Logger.log("[HumanClone] " + name + " breathes.");
    }

    public void getCold() {
        Logger.log("[HumanClone] " + name + " caught a cold.");
        hasCold = true;
    }

    public void sufferOrganFailure() {
        Logger.log("[HumanClone] " + name + " suffers organ failure.");
        organFailure = true;
    }

    public void bleed() {
        Logger.log("[HumanClone] " + name + " is bleeding.");
    }

    public void getTired() {
        Logger.log("[HumanClone] " + name + " is tired.");
        needsSleep = true;
    }
}
