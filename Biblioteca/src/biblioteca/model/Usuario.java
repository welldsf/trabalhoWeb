/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.model;

import java.io.Serializable;

/**
 *
 * @author well_
 */
public class Usuario implements Serializable{
    private int matricula;
    private String nome;
    private String usuario;
    private String senha;
    private boolean gerente;

    public Usuario(int matricula,String nome, String usuario, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.gerente = false;
    }

    public boolean isGerente() {
        return gerente;
    }

    @Override
    public String toString() {
        return "\nUsuario{" + "matricula=" + matricula + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", gerente=" + gerente + '}';
    }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
