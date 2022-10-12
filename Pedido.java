package br.com.Ingrediente;

import java.util.ArrayList;

public class Pedido {
    String numPedido, dataPedido;
    Cliente cliente = new Cliente();

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    ArrayList pizza = new ArrayList<Pizza>();

    public double calculaValorPedido(){
        double valorTotalPizza = 0;
        for (int i = 0;i<pizza.size();i++){
            Pizza pizza1 = new 

        }
    }



}
