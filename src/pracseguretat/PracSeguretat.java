/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracseguretat;

import crypto.KeyAndIVGen;
import crypto.KeyIV;

/**
 *
 * @author Juancki
 */
public class PracSeguretat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyIV keyIV = KeyAndIVGen.getKeyAndIVGen();
        StringBuilder sb = new StringBuilder();
        for (byte b : keyIV.getIv()) {
            sb.append(String.format("%02X ", b));
        }
        System.out.println(sb.toString());
        
        sb = new StringBuilder();
        for (byte b : keyIV.getKey()) {
            sb.append(String.format("%02X ", b));
        }
        System.out.println(sb.toString());
        
    }
    
}
