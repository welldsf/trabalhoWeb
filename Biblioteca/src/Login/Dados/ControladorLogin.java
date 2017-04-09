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


    
    public ControladorLogin(ControladorGeral ControladorGeral) {
        this.owner = new ControladorGeral();
    }
    
    
    
    public void verifica(String usuario, String senha, ArrayList<Usuario> listaUsuarios) {
        for (int i = 0; i < listaUsuarios.size() - 1; i++) {
            if (listaUsuarios.get(i).getUsuario() == usuario) {
                if (listaUsuarios.get(i).getSenha() == senha) {
                    if (listaUsuarios.get(i).isGerente()) {
                        System.out.println("Abre interface de gerente");
                    } else {
                        System.out.println("Abre interface funcionario");
                    }

                } else {
                    System.out.println("Senha incorreta");
                }
            } else {
                System.out.println("Usuario nao existe");
            }
        }

    }
}
    

