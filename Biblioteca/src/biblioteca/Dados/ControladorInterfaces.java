/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Dados;

import biblioteca.Interfaces.ICadastroLivro;
import biblioteca.Interfaces.IDevolucao;
import biblioteca.Interfaces.IEmprestimo;
import biblioteca.Interfaces.IFuncionario;
import biblioteca.Interfaces.IGerente;
import biblioteca.Interfaces.IListarLivros;
import Login.Interfaces.ILogin;

/**
 *
 * @author UFSC-420
 */
public class ControladorInterfaces {
    ControladorGeral owner;
    ICadastroLivro ICadastroLivro;
    IDevolucao IDevolucao;
    IEmprestimo IEmprestimo;
    IFuncionario IFuncionario;
    IGerente IGerente;
    IListarLivros IListarLivros;
    ILogin ILogin;

    public ControladorInterfaces(ControladorGeral owner) {
        this.owner = owner;
        this.ICadastroLivro = new ICadastroLivro(this);
        this.IDevolucao = new IDevolucao(this);
        this.IEmprestimo = new IEmprestimo(this);
        this.IFuncionario = new IFuncionario(this);
        this.IGerente = new IGerente(this);
        this.IListarLivros = new IListarLivros(this);
        this.ILogin = new ILogin(this);
    }

    public ICadastroLivro getICadastroLivro() {
        return ICadastroLivro;
    }

    public void setICadastroLivro(ICadastroLivro ICadastroLivro) {
        this.ICadastroLivro = ICadastroLivro;
    }

    public IDevolucao getIDevolucao() {
        return IDevolucao;
    }

    public void setIDevolucao(IDevolucao IDevolucao) {
        this.IDevolucao = IDevolucao;
    }

    public IEmprestimo getIEmprestimo() {
        return IEmprestimo;
    }

    public void setIEmprestimo(IEmprestimo IEmprestimo) {
        this.IEmprestimo = IEmprestimo;
    }

    public IFuncionario getIFuncionario() {
        return IFuncionario;
    }

    public void setIFuncionario(IFuncionario IFuncionario) {
        this.IFuncionario = IFuncionario;
    }

    public IGerente getIGerente() {
        return IGerente;
    }

    public void setIGerente(IGerente IGerente) {
        this.IGerente = IGerente;
    }

    public IListarLivros getIListarLivros() {
        return IListarLivros;
    }

    public void setIListarLivros(IListarLivros IListarLivros) {
        this.IListarLivros = IListarLivros;
    }

    public ILogin getILogin() {
        return ILogin;
    }

    public void setILogin(ILogin ILogin) {
        this.ILogin = ILogin;
    }
    
    
    
}
