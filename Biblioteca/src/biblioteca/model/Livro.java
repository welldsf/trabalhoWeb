/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.model;

import java.io.Serializable;

/**
 *
 * @author Matheus
 */
public class Livro implements Serializable{
    
    private int codigo;
    private int codUsuario;
    private String nome;
    private String autor;
    private String editora;
    private int edicao;
    private int volume;
    private int paginas;
    private double preco;
    private Genero genero;
    

    public Livro(int cont,String nome, String editora, String autor, int preco) {
        this.codigo = cont;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
    }

    
    
    public Livro(int cont, String nome, String autor, String editora, int edicao, int volume, int paginas, Genero genero, int preco) {
        this.codigo = cont;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.volume = volume;
        this.paginas = paginas;
        this.genero = genero;
        this.preco = preco;
    }

    
    @Override
    public String toString() {
        return "\nLivro{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", editora=" + editora + ", edicao=" + edicao + ", volume=" + volume + ", paginas=" + paginas+ ", preco=" + preco + ", genero=" + genero + '}';
    }
   
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
}
