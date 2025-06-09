package com.omara.jem.kaori.environment;

import com.omara.jem.kaori.utils.Logger;
import com.omara.jem.kaori.ai.clones.HumanClone;

public class DoctorClone {
    public void treatPatient(HumanClone patient) {
        Logger.log("[DoctorClone] Treating " + patient.getName());
    }

    public void trainClone(HumanClone clone) {
        Logger.log("[DoctorClone] Training " + clone.getName());
    }
}
