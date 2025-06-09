package com.omara.jem.kaori.ai.clones;

import com.omara.jem.kaori.utils.Logger;

public class DoctorClone {
    public void treatPatient(String patientName) {
        Logger.log("[DoctorClone] Treating " + patientName);
    }

    public void trainClone(String cloneName) {
        Logger.log("[DoctorClone] Training " + cloneName);
    }
}
