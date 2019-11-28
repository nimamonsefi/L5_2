/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Person{ 

    private static Person person; 
  
    private Person(){} 

    public static Person getInstance(){ 
        if (person == null){  
            person = new Person(); 
        } 
        return person; 
    }
    
    public void servic(){
        System.out.println("Here Is Your Servic Form !");
    }
    
    public void job(){
        System.out.println("Now You Have A Job !");
    } 
} 
