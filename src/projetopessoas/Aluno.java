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
public class Aluno extends Pessoa{
    //****** EXTENDS
    
    //atributos
    private int mat;
    private String curso;
    
    //metodos
    public void cancelarMatr(){
        setMat(getMat());
        System.out.println(">>> Aluno: Matricula cancelada");
    }
    
    
    
    //getter setter

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
