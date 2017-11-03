package Clases;

import java.util.ArrayList;

/**
 *
 * @author Parker
 */
public class Grupo {
    private String nombre;
    private ArrayList<Candidato> candidatos;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
    
    public void AgregarCandidato(Candidato candidato){
        candidatos.add(candidato);
    }
}