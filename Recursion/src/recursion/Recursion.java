/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author David
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void Checkthis() {
    int a = 0;
    a += 4;
        System.out.println(a);
    while(a <= 96){
        System.out.println(a);
        Checkthis();
    }
    
} 
    
}
