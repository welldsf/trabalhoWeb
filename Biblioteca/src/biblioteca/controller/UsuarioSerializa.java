package biblioteca.controller;
import biblioteca.model.Biblioteca;
import biblioteca.model.Usuario;
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
    static UsuarioSerializa us = new UsuarioSerializa();
    private static List<Usuario> usuarios;
    static Scanner in = new Scanner(System.in);
    static boolean executando = true;
    static Integer contador;
    
    public void addUser(Usuario usuario){
        this.usuarios.add(usuario);
    }
    public UsuarioSerializa(){
       this.usuarios = new ArrayList<>();
    }
    @Override
    public String toString() {
        
        String total = "";
        Iterator<Usuario> i = usuarios.iterator();
        
        while(i.hasNext()){
            Usuario l = (Usuario) i.next();
            total = total + l.toString();
        }
        return total;
    }
    
          
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
        us.addUser(user); 
    }

    public static void criarArquivo() {
        System.out.println("Digite o nome do arquivo: ");
        arquivo = in.next()+".ser";
        executando = false;
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        
        try {
            fos = new FileOutputStream(arquivo);
            
            out = new ObjectOutputStream(fos);
            
            out.writeObject(us);
            
            fos.close();
            out.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static UsuarioSerializa carregarArquivo(String arquivo) throws FileNotFoundException, IOException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
       
       File file = new File(arquivo+".ser");
        if(file.exists()){
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                
                us = (UsuarioSerializa) ois.readObject();
                
                fis.close();
                ois.close();
                
                String total = "";
                Iterator<Usuario> i = usuarios.iterator();
                
                while(i.hasNext()){
                    Usuario u = (Usuario) i.next();
                    total = total + u.toString();
                }
                System.out.println(total);
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
            }
                    

        }else{
            System.out.println("Arquivo não encontrado");
        }

        return us;
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
                    System.out.println("Digite o nome do arquivo que você quer abrir:");
                          
                    carregarArquivo(in.next());
                    break;
                case 1:
                    criarArquivo();
                    break;
                case 2:
                    System.out.println(us.toString());
                    break;
                case 3:
                    criaUsuario();
                    break;
            }
        }
        System.exit(0);
    }
}
    

