/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Dados;

import Login.Dados.ControladorLogin;

/**
 *
 * @author well_
 */
public class ControladorGeral {
    ControladorInterfaces ControladorInterfaces;
    ControladorLogin ControladorLogin;

    public ControladorGeral() {
        this.ControladorInterfaces = new ControladorInterfaces(this);
        this.ControladorLogin = new ControladorLogin(this);
    }

    public ControladorInterfaces getControladorInterfaces() {
        return ControladorInterfaces;
    }

    public void setControladorInterfaces(ControladorInterfaces ControladorInterfaces) {
        this.ControladorInterfaces = ControladorInterfaces;
    }

    public ControladorLogin getControladorLogin() {
        return ControladorLogin;
    }

    public void setControladorLogin(ControladorLogin ControladorLogin) {
        this.ControladorLogin = ControladorLogin;
    }
    
    
    
    
}
