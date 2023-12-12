package com.mycompany.projecte_git_01;

public class Class_Assignatura {

    private final String assignatura;
    private final int nota;

    //constructor
    public Class_Assignatura(String assignatura, int nota) {
        this.assignatura = assignatura;
        this.nota = nota;
    }

//Metode indicar la nota
    public void lesNotes() {
        System.out.println("Hola, l'assigntura es:  " + assignatura + " i la teva nota es un: " + nota + " enhorabona.");
    }
//Altres atributs o metodoes afegir aqui
}
