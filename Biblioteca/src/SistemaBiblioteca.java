
import biblioteca.view.Biblioteca;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class SistemaBiblioteca {
   static String arquivo = null;
    static Scanner in = new Scanner(System.in);
    static boolean executando = true;
    static Biblioteca lib = new Biblioteca();
    
    public static void main(String[] args) throws ClassNotFoundException {
        while(executando){
            System.out.println("\n Digite 0 para abrir uma biblioteca"+
                                "\n Digite 1 para salvar e sair"+
                    "\n Digite 2 para listar todos os livros da biblioteca"+
                    "\n Digite 3 para adicionar um livro a biblioteca");
            
            int resposta = in.nextInt();
            
            switch(resposta){
                case 0:
                    System.out.println("Digite o nome do arquivo que você quer abrir");
                    carregarArquivo(in.next());
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
    
    public static void carregarArquivo(String arquivo) throws ClassNotFoundException {
       FileInputStream fis = null;
       ObjectInputStream ois = null;
       
       File file = new File(arquivo+".ser");
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
        System.out.println("Digite o nome do arquivo: ");
        arquivo = in.next()+".ser";
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
       int quantidade, preco;
       
        System.out.println("\nDigite o nome:");
        nome = in.next();
        System.out.println("\nDigite a editora:");
        editora = in.next();
        System.out.println("\nDigite o autor:");
        autor = in.next();
        System.out.println("\nDigite a quantidade:");
        quantidade = in.nextInt();
        System.out.println("\nDigite o preço:");
        preco = in.nextInt();
        
        Livro book = new Livro(nome,editora,autor,quantidade,preco);
        lib.addLivro(book);
        
    }
}
