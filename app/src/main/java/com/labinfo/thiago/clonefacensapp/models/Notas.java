package com.labinfo.thiago.clonefacensapp.models;

public class Notas {

    private String curso;
    private String m1;
    private String m2;
    private String sub;
    private String media;

    public Notas(String curso, String m1, String m2, String sub, String media) {
        this.curso = curso;
        this.m1 = m1;
        this.m2 = m2;
        this.sub = sub;
        this.media = media;
    }

    public String getCurso() {
        return curso;
    }

    public String getM1() {
        return m1;
    }

    public String getM2() {
        return m2;
    }

    public String getSub() {
        return sub;
    }

    public String getMedia() {
        return media;
    }
}
