package com.example.proyectoaplicacionlenguajesignos.models;

import com.example.proyectoaplicacionlenguajesignos.app.MyApplication;

import io.realm.RealmObject;

public class Palabra extends RealmObject {
    private int id;
    public String palabra;
    public int drawable;
    public String categoria;
    public String subcategoria;
    public Palabra(){}
    public Palabra(String palabra, int drawable, String categoria, String subcategoria){
        this.id = MyApplication.elementId.getAndIncrement();
        this.palabra = palabra;
        this.drawable = drawable;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
    }

}
