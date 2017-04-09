/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Genero {
    
    private List<String> nome = new ArrayList<String>();

    public Genero(){
        this.nome.add("Fantasia");
        this.nome.add("Terror");
        this.nome.add("Romance");
        this.nome.add("Aventura");
        this.nome.add("Ficção");
        this.nome.add("Infantis");
        this.nome.add("Didático");
    }

    public List<String> getNome() {
        return nome;
    }

    public void setNome(List<String> nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Genero{" + "nome=" + nome + '}';
    }
    
  
}
