package com.example.listadecompras.model;

import com.example.listadecompras.Enums.Measures;

public class Item {
    private Long id;
    private String nomeItem;
    private Measures medida;
    private float qtd;

    public Item( String nomeItem, Measures medida, float qtd) {
        this.nomeItem = nomeItem;
        this.medida = medida;
        this.qtd = qtd;
    }

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Measures getMedida() {
        return medida;
    }

    public void setMedida(Measures medida) {
        this.medida = medida;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return qtd + " " + medida.getNomeMedida() + " " + nomeItem;
    }
}