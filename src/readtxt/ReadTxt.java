/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readtxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ulisses
 */
public class ReadTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String file = new Scanner(new File("test.txt")).useDelimiter("\\Z").next();
            System.out.println(file);
        } catch (FileNotFoundException e ) {
            System.err.println(e);
        }
        
    }
    
}
