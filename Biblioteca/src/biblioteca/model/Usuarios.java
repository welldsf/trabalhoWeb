/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private List<Usuario> colecao;

    public Usuarios() {
        this.colecao = new ArrayList<Usuario>();
    }
    
    public void addUser(Usuario user){
        colecao.add(user);
    }

    @Override
    public String toString() {
        
        String total = "";
        Iterator<Usuario> i = colecao.iterator();
        
        while(i.hasNext()){
            Usuario l = (Usuario) i.next();
            total = total + l.toString();
        }
        return total;
    }
    
}
