package biblioteca.controller;
import biblioteca.model.Biblioteca;
import biblioteca.model.Usuario;
import biblioteca.model.Usuarios;
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

/**
 *
 * @author well_
 */
public class UsuarioSerializa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    static String arquivo = null;
    static Usuarios usuario = new Usuarios();
    static Scanner in = new Scanner(System.in);
    static boolean executando = true;
    static Integer contador = 0;
          
    public static void criaUsuario(){
        int matricula = contador;
        String nome;
        String usuario;
        String senha;
        
       
        System.out.println("\nDigite o primeiro nome:");
        nome = in.next();

        System.out.println("\nDigite usuario:");
        usuario = in.next();

        System.out.println("\nDigite a senha:");
        senha = in.next();
        
        Usuario user = new Usuario(matricula,nome,usuario,senha);
        
        contador++;
        UsuarioSerializa.usuario.addUser(user); 
    }

    public static void criarArquivo() {
        arquivo = "newUsers.txt";
        executando = false;
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        
        try {
            fos = new FileOutputStream(arquivo);
            
            out = new ObjectOutputStream(fos);
            
            out.writeObject(usuario);
            
            fos.close();
            out.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void carregarArquivo() throws ClassNotFoundException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
       
       File file = new File("newUsers.txt");
        if(file.exists()){
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                usuario = (Usuarios) ois.readObject();
                
                fis.close();
                ois.close();
             
            } catch (FileNotFoundException ex) {
               Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
               Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
           }
                    

        }else{
            System.out.println("Arquivo não encontrado");
        }

           
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        while(executando){
            System.out.println("\n Digite 0 para abrir uma usuario"+
                                "\n Digite 1 para salvar e sair"+
                                "\n Digite 2 para listar todos usuarios"+
                                "\n Digite 3 para adicionar um usuario");
            
            int resposta = in.nextInt();
            
            switch(resposta){
                case 0:       
                    carregarArquivo();
                    break;
                case 1:
                    criarArquivo();
                    break;
                case 2:
                    System.out.println(usuario.toString());
                    break;
                case 3:
                    criaUsuario();
                    break;
            }
        }
        System.exit(0);
    }
}
    

