/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contactos.controller;

import ec.edu.ups.estructura.arboles.contactos.models.Contacto;
import ec.edu.ups.estructura.arboles.contactos.models.Node;

/**
 *
 * @author alexr
 */
public class ArbolesContactos {
    private Node raiz;

    public ArbolesContactos() {
        this.raiz = null;
    }
    
    public void insert(Contacto newContacto){
        if(raiz == null){
            raiz = new Node(newContacto);
        }else{
            insertRecursivo(raiz,newContacto);
        }
    }
    
    private void insertRecursivo(Node node, Contacto newContacto){
        
        if(newContacto.getNombre().compareTo(node.getContacto().getNombre()) < 0){
            if(node.getLeft() == null){
                node.setLeft(new Node(newContacto));
            } else{
                insertRecursivo(node.getLeft(), newContacto);
            }
        }else if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) > 0){
            if(node.getRight()== null){
                node.setRight(new Node(newContacto));
            }else{
                insertRecursivo(node.getRight(), newContacto);
            }
        }else{
            //Si el nombre del contacto nuevo es igual a uno existente
            
        }
        
    }
    
    public boolean estaEquilibrado(){
        return verificarBalance(raiz);
        
    }
    private boolean verificarBalance(Node node){
        if(node == null){
            return true; // Arbol vacio, se considera equilibrado
        }
        
        int alturaIzquierda = obtenerAltura(node.getLeft());
        int alturaDerecha = obtenerAltura(node.getRight());
                
        int diferencia = Math.abs(alturaIzquierda - alturaDerecha);
        // verificamos la diferecia de las alturas
        if(diferencia > 1){
            return false;
        }
        
        return verificarBalance(node.getLeft())&& verificarBalance(node.getRight());
    }
    
    private int obtenerAltura(Node node){
        if(node == null){
            return 0;
        }
        int alturaIzquierda = obtenerAltura(node.getLeft());
        int alturaDerecha = obtenerAltura(node.getRight());
        
        return Math.max(alturaIzquierda, alturaDerecha)+1;
    }
}
