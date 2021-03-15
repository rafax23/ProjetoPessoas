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
public class Professor extends Pessoa {
    
    //atributos
    private String especialidade;
    private int salario;
    
    //metodos
    public void receberAum(int aumento){
        setSalario(getSalario() + aumento);
        imp(">>> Professor: Salario aumentado");
        
    }
    
    //getter setter

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
