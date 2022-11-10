/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosesmeues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Joaquín
 */
public class Consola {
public static String lligText() throws IOException {
 BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
 return lector.readLine();
}     
}
