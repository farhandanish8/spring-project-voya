package com.doctor.model;

public enum Specializaton {
    ORTHO("ORTHOPEDIC"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICAIN"),
    GYNAEC("GYNAECCOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST");
    private String speciality;
    Specializaton(String speciality){
        this.speciality = speciality;
    }

    public String getSpeciality(){
        return speciality;
    }
}