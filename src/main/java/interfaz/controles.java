/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author yosoy
 */
public class controles implements KeyListener{
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
       int s=e.getKeyCode();
       if(s==KeyEvent.VK_LEFT ){
           System.out.print("echo");
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
