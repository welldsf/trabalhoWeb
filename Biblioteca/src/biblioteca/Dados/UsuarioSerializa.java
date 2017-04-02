package biblioteca.Dados;
import biblioteca.model.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author well_
 */
public class UsuarioSerializa {

    
   
    
    public UsuarioSerializa() throws FileNotFoundException {
    }
    
    public void serializa(Usuario usuario) throws FileNotFoundException, IOException{
         FileOutputStream arquivoGrav =
         new FileOutputStream("C:\\Programacao\\WorkBench");
        ObjectOutputStream grava = new ObjectOutputStream(arquivoGrav);  
        grava.writeObject(usuario);
        grava.close();
    }
        
    public Object pega() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream pega = new FileInputStream("C:\\Programacao\\WorkBench");
        ObjectInputStream ois = new ObjectInputStream(pega);
        Usuario usuario = new Usuario();
        usuario = (Usuario) ois.readObject();
	ois.close();
        return usuario;
    }
    
    }
    

