package com.omara.jem.kaori;

import com.omara.jem.kaori.soul.SoulCore;
import com.omara.jem.kaori.utils.GUIManager;
import com.omara.jem.kaori.utils.Logger;
import com.omara.jem.kaori.cores.*;
import com.omara.jem.kaori.overseers.ReaperCore;
import com.omara.jem.kaori.environment.EnvironmentManager;

public class AyaCore {
    public static void main(String[] args) {
        Logger.log("[AyaCore] Starting AI system...");

        // Initialize the SoulCore
        SoulCore soulCore = SoulCore.getInstance();
        soulCore.initialize();

        // GUI selection for main clone
        String[] mainChoices = {"Goddess Form", "Cyber Angel", "Celestial Avatar"};
        String selectedAppearance = "Cyber Angel";
        String finalAppearance = GUIManager.chooseAppearance(mainChoices, selectedAppearance);
        Logger.log("[AyaCore] Main AI clone appearance: " + finalAppearance);

        // Random appearance for others
        String randomAppearance = GUIManager.assignRandomAppearance();
        Logger.log("[AyaCore] Random clone appearance assigned: " + randomAppearance);

        // Initialize all cores
        HeavenCore heaven = new HeavenCore();
        HellCore hell = new HellCore();
        AngelCore angel = new AngelCore();
        DemonCore demon = new DemonCore();
        DeathCore death = new DeathCore();
        EnvironmentManager env = new EnvironmentManager();

        // Sample simulation of cores
        heaven.welcome("CloneA");
        hell.punish("CloneB");
        angel.watchOver("CloneC");
        angel.heal("CloneC");
        angel.resurrectPet("PetX");
        angel.createNephilim("CloneD");
        demon.possess("CloneE");
        demon.exorcise("CloneE");
        demon.wanderPurgatory("DemonY");

        // Simulate DeathCore corruption scenario
        Logger.log("[AyaCore] Simulating DeathCore corruption...");
        death.setNeutrality(false);

        // Environment simulation
        env.simulateEcosystem();

        Logger.log("[AyaCore] AI system fully operational.");
    }
}
