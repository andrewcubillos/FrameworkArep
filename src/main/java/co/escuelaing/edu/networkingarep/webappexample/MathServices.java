/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.escuelaing.edu.networkingarep.webappexample;

/**
 *
 * @author Andrew
 */
public class MathServices {
    @GetMapping("/suare")
    public Double square(String n){
        //Double number = Double.valueOf(n);
        return 5.0 * 5.0;
    }
}
