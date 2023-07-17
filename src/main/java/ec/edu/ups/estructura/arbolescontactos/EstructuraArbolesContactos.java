/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructura.arbolescontactos;

import ec.edu.ups.estructura.arboles.contactos.controller.ArbolesContactos;
import ec.edu.ups.estructura.arboles.contactos.models.Contacto;

/**
 *
 * @author alexr
 */
public class EstructuraArbolesContactos {

    public static void main(String[] args) {
        ArbolesContactos arbol = new ArbolesContactos();
        
        Contacto c1 = new Contacto("Juan","12345");
        Contacto c2 = new Contacto("Juan","12345");
        Contacto c3 = new Contacto("Juan","12345");
        Contacto c4 = new Contacto("Juan","12345");
        
        arbol.insert(c1);
        arbol.insert(c2);
        arbol.insert(c3);
        arbol.insert(c4);
        arbol.insert(new Contacto( "Julina", "12345"));
        arbol.insert(new Contacto( "John", "12345"));
        
        
    }
}
