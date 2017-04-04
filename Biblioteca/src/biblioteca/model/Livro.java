/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.model;

/**
 *
 * @author Matheus
 */
public class Livro {
    
    private String nome;
    private String autor;
    private String editora;
    private int edicao;
    private int volume;
    private int paginas;
    private int quantidade;
    private Genero genero;

    public Livro(String nome, String editora, String autor, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    
    
    public Livro(String nome, String autor, String editora, int edicao, int volume, int paginas, int quantidade, Genero genero) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.volume = volume;
        this.paginas = paginas;
        this.quantidade = quantidade;
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
