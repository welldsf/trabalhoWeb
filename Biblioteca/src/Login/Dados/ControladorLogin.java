/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.Dados;

import biblioteca.controller.ControladorGeral;
import biblioteca.model.Usuario;
import java.util.ArrayList;


/**
 *
 * @author well_
 */
public class ControladorLogin {
    ControladorGeral owner;
    ArrayList<Usuario> listaUsuarios;

    
    public ControladorLogin(ControladorGeral ControladorGeral) {
        this.owner = new ControladorGeral();
    }
    
    
    
    public int verifica(String usuario, String senha) {
        for (int i = 0; i < this.listaUsuarios.size() - 1; i++) {
            if (this.listaUsuarios.get(i).getUsuario() == usuario) {
                if (this.listaUsuarios.get(i).getSenha() == senha) {
                    if(this.listaUsuarios.get(i).isGerente()){
                        return 1;
                    }else{
                        return 2;
                    }
                } else {
                    System.out.println("Senha incorreta");
                    return 3;
                }
            } else {
                System.out.println("Usuario nao existe");
                return 4;
            }
        }
        return 0;
    }
    
    // Se retornar 0 = erro
    // Se retornar 1 = é Gerente
    // Se retornar 2 = é Funcionario
    // Se retornar 3 = Senha incorreta
    // Se retornar 4 = Usuario inexistente
}
    
    

    

    

