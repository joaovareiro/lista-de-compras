package com.example.listadecompras.Enums;

public enum Measures {
    UNIDADES("Unidades"),
    KILOS("Kilos"),
    LITROS("Litros"),
    GARRAFAS("Garrafas"),
    PACOTES("Pacotes");

    private String nomeMedida;

    Measures(String nomeMedida) {
        this.nomeMedida = nomeMedida;
    }

    public String getNomeMedida() {
        return nomeMedida;
    }
}
