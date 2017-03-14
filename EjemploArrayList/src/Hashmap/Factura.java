/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashmap;

import ejemploarraylist.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private int id;
    private HashMap<String,Producto>b;
    
    public Factura(int id){
        this.b= new HashMap<>();
    }
    
    public void adicionar(Producto p){
        this.b.put(p.getName(),p);
    }
    public double calculartotal(){
        double total=0;
        for(Producto p : b.values()){
          
            total+=p.getPrecio();
        }
        return total;
    }
    
    public Producto buscar(String name){
        
        
        return this.b.get(name);
    }
    
}
