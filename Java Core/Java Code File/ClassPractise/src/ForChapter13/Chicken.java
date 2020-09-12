/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForChapter13;

/**
 *
 * @author Students
 */
class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return "Chicken: cockekeke"; 
    }

    @Override
    public String howToEat() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return "Chicken: Fly it"; 
    }
    
}
