package br.com.Ingrediente;

import br.com.Ingrediente.Ingrediente;

import java.util.ArrayList;
import java.util.List;
public class Pizza {
    private String nome;
    private double valor;
    private String tamanho;
    private boolean possuiBordaRecheada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(boolean possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    ArrayList lista = new ArrayList<Ingrediente>();

    public int getQuantidadeIngredientes (){
        return lista.size();
    }
    public void getAdicionarIngredientes(Ingrediente Ingrediente){
        lista.add(Ingrediente);

    }
    public double calculaPizza(double valorPizza){
        if(tamanho=="G"){
            valorPizza=45;
            return valorPizza;
        } if (tamanho=="M") {
            valorPizza=30;
            return valorPizza;
        }
        if(tamanho=="P"){
            valorPizza = 20;
        }
        if(lista.size()>5){
            valorPizza+=5;
            return valorPizza;
        }
        if(possuiBordaRecheada=true){
            valorPizza+=8;
            return valorPizza;
        }
        return 0;

    }
    


}
