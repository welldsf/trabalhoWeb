package biblioteca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author well_
 */
public class Biblioteca implements Serializable {

    
    /**
     * @param args the command line arguments
     */
    
    private List<Livro> colecao;
    private List<Livro> livros = new ArrayList<>();
    public Biblioteca() {
        this.colecao = new ArrayList<Livro>();
    }
    
    public void addLivro(Livro livro){
        colecao.add(livro);
    }
    public List addNoArray(List array){
        Iterator<Livro> i = array.iterator();
        while(i.hasNext()){
            Livro l = (Livro) i.next();
            livros.add(l);
        }
        return livros;
    }
    public void retornaLivro(int id){
        
       
        
    }
    @Override
    public String toString() {
        
        String total = "";
        Iterator<Livro> i = colecao.iterator();
        
        while(i.hasNext()){
            
            Livro l = (Livro) i.next();
            total = total + l.toString();
        }
        return total;
    }
    
    

    
}
