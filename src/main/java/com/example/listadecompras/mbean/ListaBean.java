package com.example.listadecompras.mbean;

import com.example.listadecompras.Enums.Measures;
import com.example.listadecompras.model.Item;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@SessionScoped
@Named("listaBean")
public class ListaBean implements Serializable {

    private Item item = new Item();
    private Measures medida;
    private List<Item> listaCompras = new ArrayList<>();
    private List<String> itensSelecionados = new ArrayList<>();
    private EnumSet<Measures> medidasSet = EnumSet.allOf(Measures.class);

    public void adicionar(){
        listaCompras.add(item);
        item = new Item();
    }

    public void remover(){
        for(String item : itensSelecionados){
            listaCompras.removeIf(i -> i.getNomeItem().equalsIgnoreCase(item));
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Measures getMedida() {
        return medida;
    }

    public void setMedida(Measures medida) {
        this.medida = medida;
    }

    public List<Item> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Item> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<String> getItensSelecionados() {
        return itensSelecionados;
    }

    public void setItensSelecionados(List<String> itensSelecionados) {
        this.itensSelecionados = itensSelecionados;
    }

    public EnumSet<Measures> getMedidasSet() {
        return medidasSet;
    }

    public void setMedidasSet(EnumSet<Measures> medidasSet) {
        this.medidasSet = medidasSet;
    }

}
