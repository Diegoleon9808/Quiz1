/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author JCBOT
 */
public class Unidad1 {

    private int IdUnidad;
    private String NameUnidad;
    private int Idtabla;
    private int Decision;

    public Unidad1(int IdUnidad, String NameUnidad, int Idtabla,int decision) {
        this.IdUnidad = IdUnidad;
        this.NameUnidad = NameUnidad;
        this.Idtabla = Idtabla;
        this.Decision = decision;

    }

    public Unidad1() {
    }

    public int getIdUnidad() {
        return IdUnidad;
    }

    public void setIdUnidad(int IdUnidad) {
        this.IdUnidad = IdUnidad;
    }

    public String getNameUnidad() {
        return NameUnidad;
    }

    public void setNameUnidad(String NameUnidad) {
        this.NameUnidad = NameUnidad;
    }

    public int getIdtabla() {
        return Idtabla;
    }

    public void setIdtabla(int Idtabla) {
        this.Idtabla = Idtabla;
    }

    public int getDecision() {
        return Decision;
    }

    public void setDecision(int Decision) {
        this.Decision = Decision;
    }

    
}
