package GatoCompuesto;

import java.util.ArrayList;

public class persona {
    private String nom;
    private String apellido;
    private int edad;
    private ArrayList<Gato>listagatos;

    public ArrayList<Gato> getListagatos() {
        return listagatos;
    }

    public void setListagatos(ArrayList<Gato> listagatos) {
        this.listagatos = listagatos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }




    public persona(String nom, String apellido, int edad, ArrayList<Gato>listagatos){
        this.nom=nom;
        this.apellido=apellido;
        this.edad=edad;
        this.listagatos=listagatos;
    }
    public String toString(){
        return "Hola soc " + this.nom + " "+ this.apellido + " tengo " + this.edad +
                " años y tengo de gato a" + this.listagatos;
    }
}
