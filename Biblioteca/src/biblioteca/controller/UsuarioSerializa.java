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
public class UsuarioSerializa {
    
    static String arquivo = null;
    private List<Usuario> usuarios;
    static Scanner in = new Scanner(System.in);
    static boolean executando = true;
    static UsuarioSerializa us;
    
    public void addUser(Usuario usuario){
        usuarios.add(usuario);
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
        int matricula;
        String nome, usuario, senha;
        
        System.out.println("\nDigite o primeiro nome:");
        nome = in.next();

        System.out.println("\nDigite usuario:");
        usuario = in.next();

        System.out.println("\nDigite a senha:");
        senha = in.next();
        
        System.out.println("\nDigite a matricula:");
        matricula = in.nextInt();


        Usuario user = new Usuario(matricula,nome,usuario,senha);
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
    
    public static List carregarArquivo() throws FileNotFoundException, IOException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
       
       File file = new File(arquivo+".ser");
       List listaUsuarios = null;
        System.out.println("Digite o nome do arquivo que você quer abrir:");
        if(file.exists()){
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
            
                listaUsuarios = (List<Usuario>) ois.readObject();
                fis.close();
                ois.close();
                
                System.out.println(listaUsuarios.toString());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            System.out.println("Arquivo não encontrado");
        }

        return listaUsuarios;
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
    

