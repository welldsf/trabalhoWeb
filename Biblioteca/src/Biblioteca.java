
import biblioteca.Dados.ControladorInterfaces;
import java.io.Serializable;

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
    public static void main(String[] args) {
        ControladorInterfaces teste = new ControladorInterfaces();
        teste.getIFuncionario().inicia();
    }
    
}
