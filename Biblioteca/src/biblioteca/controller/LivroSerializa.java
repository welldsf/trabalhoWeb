/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.controller;

import biblioteca.model.Biblioteca;
import biblioteca.model.Livro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 09372774952
 */
public class LivroSerializa {
    static String arquivo = null;
    static Scanner in = new Scanner(System.in); //naovamosprecisar
    static boolean executando = true; //naovamosprecisar
    static Biblioteca lib = new Biblioteca();
    static Integer contador = 0;
    
    public static void main(String[] args) throws ClassNotFoundException {
        while(executando){
            System.out.println("\n Digite 0 para abrir uma biblioteca"+
                                "\n Digite 1 para salvar e sair"+
                    "\n Digite 2 para listar todos os livros da biblioteca"+
                    "\n Digite 3 para adicionar um livro a biblioteca");
            
            int resposta = in.nextInt();
            
            switch(resposta){
                case 0:
                    carregarArquivo();
                    break;
                case 1:
                    salvarESair();
                    break;
                case 2:
                    System.out.println(lib.toString());
                    break;
                case 3:
                    addBook();
                    break;
            }
        }
        System.exit(0);
        
    }
    
    public static void carregarArquivo() throws ClassNotFoundException {
       FileInputStream fis = null;
       ObjectInputStream ois = null;
       
       File file = new File("Livros.txt");
       if(file.exists()){
           try {
               fis = new FileInputStream(file);
               ois = new ObjectInputStream(fis);
               lib = (Biblioteca) ois.readObject();
               
               fis.close();
               ois.close();
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
           System.out.println("Arquivo não encontrado");
       }
    }
    
    public static void salvarESair() {
        
        arquivo = "Livros.txt";
        executando = false;
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(arquivo);
            out = new ObjectOutputStream(fos);
            
            out.writeObject(lib);
            
            fos.close();
            out.close();
            
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void addBook() {
       String nome, editora, autor; 
       int preco, cont;
       
        System.out.println("\nDigite o nome:");
        nome = in.next();
        System.out.println("\nDigite a editora:");
        editora = in.next();
        System.out.println("\nDigite o autor:");
        autor = in.next();
        System.out.println("\nDigite o preço:");
        preco = in.nextInt();
        cont = contador;
        Livro book = new Livro(cont, nome,editora,autor,preco);
        contador++;
        lib.addLivro(book);
    }
}