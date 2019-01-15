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
public interface IPodeCantar {
    //int numero= 2; //public final 
    public abstract void cantar(); //al ser abstracto no puedo poner cuerpo; ni tampoco las llaves 'limpias'
    //void cantar; poniendolo así ya entiende que es public abstract...
    
    
//    public default void metodoDefault(){
//        System.out.println("+++++");
//    }
}
