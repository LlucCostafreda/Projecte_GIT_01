package com.mycompany.projecte_git_01;

public class Projecte_GIT_01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //creem una instància de Class_Persona
        Class_Persona Persona = new Class_Persona("Pere", 25);

        //Crida el métode saludar a NewClass
        Persona.saludar();

        //creem una instància de Class_Persona
        Class_Assignatura Assignatura = new Class_Assignatura("M5.Entorns Desenvolupament", 10);

        //Crida el métode saludar a NewClass
        Assignatura.lesNotes();
    }
}
