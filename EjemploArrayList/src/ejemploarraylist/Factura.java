/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private int id;
    private ArrayList<Producto>b;
    
    public Factura(int id){
        this.b= new ArrayList<>();
    }
    
    public void adicionar(Producto p){
        this.b.add(p);
    }
    public double calculartotal(){
        double total=0;
        for(int i =0; i < this.b.size();i++){
            Producto p = this.b.get(i);
            total+=p.getPrecio();
        }
        return total;
    }
    
    public Producto buscar(String name){
        for(Producto b : b){
            if(b.getName().equals(name))
                return b;
        }
        return null;
    }
    
}
