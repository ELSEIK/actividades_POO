/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_github;

/**
 *
 * @author isak
 */
public class operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=20,b=10,c=0,d=20,e=40,f=30;
        boolean condition=true;
        
        //operador pre-incremento
        
        //a=a+1 entonces c=a
        c=++a;
        System.out.println("valor de c++a) ="+c);
        
        //operador post incremento (b toma valor 11
        //cunado c=b entonces b=b+1
        System.out.println("valor de c (b++) :" +c);
        
        //operador predecremento
        //d=d-1 entonces c=d
        c=-d;
        System.out.println("vlor de c(-d) :"+c);
        
        //operador de post decremento ( e toma valor de 39)
        
        c=-e;
        System.out.println("valor de c(e-)= "+c);
        
        //operador logico not
        System.out.println("valor de !condition= " + !condition);
        //c=e entonces e=e-1
        
    }
    
}
