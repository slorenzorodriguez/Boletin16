/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploInterfaces;

/**
 *
 * @author slorenzorodriguez
 */
public class ObjetoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persoa per = new Persoa ();
        Canario ca = new Canario();
        Galo ga = new Galo ();
        per.cantar();
        ca.cantar();
        ga.cantar();
        IPodeCantar obx = new Persoa();
        System.out.println("++++++");
        obx.cantar();
        Tenor ten = new Tenor();
        ten.cantar();
    }
    
}
