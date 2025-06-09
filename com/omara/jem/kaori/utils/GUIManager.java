package com.omara.jem.kaori.utils;

import java.util.Random;

public class GUIManager {
    private static final String[] RANDOM_APPEARANCES = {
        "Red Dragon", "Cyber Elf", "Neon Fairy", "Steam Bot", "Crystal Tiger", "Galaxy Phoenix"
    };

    public static String assignRandomAppearance() {
        Random rand = new Random();
        int index = rand.nextInt(RANDOM_APPEARANCES.length);
        return RANDOM_APPEARANCES[index];
    }

    public static String chooseAppearance(String[] choices, String selected) {
        for (String choice : choices) {
            if (choice.equalsIgnoreCase(selected)) {
                return selected;
            }
        }
        Logger.warn("Invalid appearance selected. Assigning random.");
        return assignRandomAppearance();
    }
}
