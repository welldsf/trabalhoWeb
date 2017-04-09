package biblioteca.model;


import biblioteca.controller.ControladorGeral;
import biblioteca.controller.ControladorInterfaces;
import biblioteca.model.Livro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Biblioteca() {
        this.colecao = new ArrayList<Livro>();
    }
    
    public void addLivro(Livro livro){
        colecao.add(livro);
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
