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
public class Canario implements IPodeCantar {

    @Override
    public void cantar() {
        System.out.println("pio pio pi o pi o ");
    }
    
}
