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
        
        p1.setNome("Rafael");
        p2.setNome("Agatha");
        p3.setNome("Vero");
        p3.ver();
        
        p2.cancelarMatr();
        p3.receberAum(100);

        
    }
    
}
