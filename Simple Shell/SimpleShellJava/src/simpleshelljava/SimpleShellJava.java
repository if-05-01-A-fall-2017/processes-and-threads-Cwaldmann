/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleshelljava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Clemi
 */
public class SimpleShellJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            System.out.println("Console :");
            String input = br.readLine();
            Process p = Runtime.getRuntime().exec(input);
            p.waitFor();
            InputStream s = p.getInputStream();
            int b = s.read();
            while (b != -1) {
                System.out.print((char)b);
                b = s.read();
            }
            System.out.println();
        }
    }
    
}
