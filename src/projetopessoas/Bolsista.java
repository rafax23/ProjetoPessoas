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
public class Bolsista extends Aluno {
    //herda Aluno que herda Pessoa
    
    public void renovar(){
        imp(">>> É um bolsista");
    }
    
    //Método já existe em Aluno
    //Sobreescrito
    @Override
    public void cancelarMatr(){
        imp(">>> Especialização Bolsista: Matricula cancelada");
    }
    
}
