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
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Visitante p4 = new Visitante();
        Bolsista p5 = new Bolsista();
        
        p1.setNome("Pessoa");
        p2.setNome("Aluno");
        p3.setNome("Professor");
        p4.setNome("Visitante");
        p5.setNome("Bolsista");
        
        p1.ver();
        p2.ver();
        p3.ver();
        p4.ver();
        p5.ver();
        
        p2.cancelarMatr();
        p3.receberAum(100);
        p5.renovar();
        p5.cancelarMatr();

        
    }
    
}
