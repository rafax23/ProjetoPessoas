/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author Rafael
 */
public class Pessoa {
    
    //atributos
    private String nome;
    private String idade;
    
    //mensagem
    public void imp(String texto){
        System.out.println(texto);
    }
    
    public void ver(){
        imp("Pessoa Nome: " + getNome()
                + "\nPessoa Idade: " +getIdade()
        );
        
    }
    
    //métodos
    public void fazerAniv(){
        setIdade(getIdade() +1);
    
    }

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
    
    
    
}
