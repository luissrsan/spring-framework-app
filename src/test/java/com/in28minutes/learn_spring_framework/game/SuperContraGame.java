
package com.in28minutes.learn_spring_framework.game;


public class SuperContraGame implements GamingConsole{

  

   
    @Override public void up() {
        System.out.println("Jump");
        
    }
    
    @Override public void down() {
        System.out.println("Crouch");
    }
    @Override public void left() {
        System.out.println("Go Back");
    }
    @Override public void right() {
        System.out.println("Shoot a bullet");
    }
    
}
