/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

import java.util.List;
import java.util.ArrayList;

/**
 * Se crea la clase nodo ArbolAvl en donde se coloca dato, factor de equilibrio
 * Los hijos izquierdos y derechos y una lista que guarda los datos duplicados
 * Dicha lista se encuentra dentro del nodo
 */

public class NodoArbolAVL {
     int dato, fe;
         NodoArbolAVL hijoIzquierdo;
         NodoArbolAVL hijoDerecho;
         List<Integer>duplicados;
        
   public static int correlativo=1;
    public final int id;    
    
    
   
    
        public NodoArbolAVL(int d){
            this.dato = d;
            this.fe = 0;
            this.hijoIzquierdo = null;
            this.hijoDerecho = null;
            this.id=correlativo++; 
            duplicados=new ArrayList<>();
        }
}
