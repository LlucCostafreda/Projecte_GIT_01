package com.mycompany.projecte_git_01;

public class Class_Persona {

    private final String nom;
    private final int edat;

    //constructor
    public Class_Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

//Metode per saludar
    public void saludar() {
        System.out.println("Hola, soc en " + nom + " i tinc " + edat + " anys.");
    }
//Altres atributs o metodoes afegir aqui
}
