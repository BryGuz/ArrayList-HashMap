/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

/**
 *
 * @author Estudiante
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setName("A");
        p1.setPrecio(30);
        
        Producto p2 = new Producto();
        p2.setName("B");
        p2.setPrecio(10);
        
        Factura x = new Factura(1);
        x.adicionar(p1);
        x.adicionar(p2);
        
        double total = x.calculartotal();
        System.out.println("Sus prodcutos son = " + p1.getName()  + " y " + p2.getName());
        System.out.println("Su total es = " + x.calculartotal());
        
        // Busca en el Arraylist
        
        Producto b = x.buscar("A");
        if(b!=null)
            System.out.println("Producto = " + b.getName() + " Precio =" + b.getPrecio());
    }
    
}
