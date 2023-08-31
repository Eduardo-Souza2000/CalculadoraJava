package com.example.Calculo.Entity;

public class Resultados {
    private double media;
    private double dv;
    private double mediana;
    private int quantDados;
    private int numMin;
    private int numMax;
    private double soma;

    public Resultados(double media, double dv, double mediana,double soma, int quantDados, int numMax, int numMin) {
        this.media = media;
        this.dv = dv;
        this.mediana = mediana;
        this.quantDados = quantDados;
        this.numMin = numMin;
        this.numMax = numMax;
        this.soma = soma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getDv() {
        return dv;
    }

    public void setDv(double dv) {
        this.dv = dv;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public int getQuantDados() {
        return quantDados;
    }

    public void setQuantDados(int quantDados) {
        this.quantDados = quantDados;
    }
    public int getNumMin() {
        return numMin;
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
