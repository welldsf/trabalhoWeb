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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author well_
 */
public class UsuarioSerializa {
    
    String arquivo = null;
    private List<Usuario> usuarios = new ArrayList<Usuario>();
   
    
    public UsuarioSerializa() throws FileNotFoundException {
    }
    
    public void serializa(Usuario usuario) throws FileNotFoundException, IOException{

        
        
    }
        
    
    
    
    
    public List pega() throws FileNotFoundException, IOException{
        FileInputStream fis = null;
       ObjectInputStream ois = null;
       
       File file = new File(arquivo+".ser");
       List listaUsuarios = null;
        if(file.exists()){
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
            
                listaUsuarios = (List<Usuario>) ois.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UsuarioSerializa.class.getName()).log(Level.SEVERE, null, ex);
            }

                fis.close();
                ois.close();

            
        }else{
            System.out.println("Arquivo não encontrado");
        }

        return listaUsuarios;
    }
    
}
    

