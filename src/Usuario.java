/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Usuario {
    private String nome;
    private String senha;
    
    public void setNome(String name){
        nome = name;
    }
    
    public void setSenha(String password){
        senha = password;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSenha(){
        return senha;
    }
}
