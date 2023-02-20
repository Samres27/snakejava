/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author yosoy
 */
import com.mycompany.mavenproject3.*;
import java.awt.*;
import static java.awt.Font.PLAIN;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;


public class interfazxx extends JFrame implements KeyListener{
    JPanel pl;
    moviminetos ml;
    Queue<cuerpo> puntos=new LinkedList<>();
    par[][] mtx16=new par[16][16];
    int tam;
    snake sp;
    int direccion=8;
    cuerpo punto;
    cuerpo puntoAx;
    boolean vivo=true;
    public interfazxx(){
        tam=16;
        ml =new moviminetos();
        for(int i=0;i<tam;i++){ Arrays.fill(mtx16[i],new par(0,(char)0));}
        punto=new cuerpo(1, 1, 's',8);
        puntoAx=punto;
        initpanel();
        initpantalla();
    }
    void initpanel(){
        pl=new JPanel();
        add(pl);
        pl.setPreferredSize(new Dimension(640,640));
    }
   
    
    @Override
    public void paint(Graphics g) {  
        //super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        Dimension dl= getSize();
        Image imanfe= createImage(dl.width,dl.height);
        Graphics gl=imanfe.getGraphics();
        
        if(vivo){
            gl.setColor(Color.red);
            gl.fillRoundRect(punto.getValorx()*40,punto.getValory()*40, 40,40,15,15);
            for(int i=0;i<tam;i++){
                for(int j=0;j<tam;j++){

                        if(mtx16[i][j].vacio()){
                            int v1=i*40;
                            int v2=j*40;
                            gl.setColor(Color.BLUE);
                            //gl.fillRect(v1,v2 ,40,40 );
                            gl.fillRoundRect(v1, v2, 40,40,15,15);

                        }
                    }

            }
        }else{
            String l2d1= "fin del juego"; 
             gl.setFont(new Font("time new roman", Font.BOLD + Font.ITALIC, 40));
            gl.setColor(Color.black);
            gl.drawString(l2d1, 200, 200);
            String l2d2= " puntaje de: " +sp.getTamanio(); 
             gl.setFont(new Font("time new roman", Font.BOLD + Font.ITALIC, 40));
            gl.setColor(Color.black);
            gl.drawString(l2d2, 200,400);
        }
        g.drawImage(imanfe, 0,0,this);
        
        
    }
    @Override
    public void update(Graphics g){
        paint(g);
    }
    
    
    void initpantalla(){

        setTitle("SNAKE:SAM");
        setSize(640,640);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    @Override
    public void keyTyped(KeyEvent e) {}
/*
@Override
    public void keyPressed(KeyEvent e) {
       int s=e.getKeyCode();
       if(s==KeyEvent.VK_LEFT ){
          
           mtx16=ml.mover(mtx16,1,2);
           this.repaint();   
       }
       if(s==KeyEvent.VK_RIGHT ){
           
           mtx16=ml.mover(mtx16,2,2);
           this.repaint();   
       }
       if(s==KeyEvent.VK_DOWN){
           
           mtx16=ml.mover(mtx16,3,2);
           this.repaint();   
       }
       if(s==KeyEvent.VK_UP){
           
           mtx16=ml.mover(mtx16,4,2);
           this.repaint();   
       }
    }*/
   
  @Override
    public void keyPressed(KeyEvent e) {
       int s=e.getKeyCode();
        
            if(s==KeyEvent.VK_LEFT ){

                //mtx16=ml.mover(sp, tam, 1);
                direccion=1;
               // this.repaint();   
            }
            if(s==KeyEvent.VK_RIGHT ){

                //mtx16=ml.mover(sp,tam,3);
                direccion=3;
              //  this.repaint();   
            }
            if(s==KeyEvent.VK_DOWN){

               // mtx16=ml.mover(sp,tam,2);
                direccion=2;
                 //this.repaint();   
            }
            if(s==KeyEvent.VK_UP){

                //mtx16=ml.mover(sp,tam,4);
                //this.repaint();
                direccion=4;
            }
        
            
       
       
    }  
    @Override
    public void keyReleased(KeyEvent e) {}

    public void modificarMatriz(par[][] ls){
        mtx16=ls;
    }
    public par[][] extraerMatriz(){
        return mtx16;
    }
    public void insertarserpiente(snake lp){
        sp=lp;
        mtx16=sp.crearTabla(mtx16,mtx16);
    }
    public static void main(String[] abs){
        interfazxx f=new interfazxx();
        controles ls=new controles();
        
        f.addKeyListener(ls);
    }
    public void iniciar(){
        while(vivo){
            int tm=sp.getTamanio();

            switch(Math.ceilDiv(tm, 5)){
                case 1: ml.esperar5_10();
                        break;
                case 2: ml.esperar10_15();
                        break;
                case 3: ml.esperar15_20();
                        break;
                case 4: ml.esperar20_25();
                        break;
                case 5: ml.esperar25_30();
                        break;
                case 6: ml.esperar30_35();
                        break;
                case 7: ml.esperar35_40();
                        break;
                default: ml.esperar40__();
            }
            //verificar
            cuerpo cl=sp.getinicio();
            int xc=cl.getValorx();
            int yc=cl.getValory();
            
            par[][] auxtab=ml.mover(sp,tam,direccion,mtx16);
            if(!sp.getViva()){
                vivo=false;
            }else{
                mtx16=auxtab;
                aniadircola();
                
            
            }
            repaint();
            
        }
    }
    public void aniadircola(){
        cuerpo fin=sp.getFin();
        cuerpo inicio=sp.getinicio();
        
        if(fin.getValorx()==punto.getValorx() && fin.getValory()==punto.getValory()){
            punto.setValora('o');
            //puntos.add(punto);
            sp.anoiadir(punto);
            
            punto= generarOtro();
            sp.aumentarPunto();
        }
       
           /* if(fin.getValorx()==puntoAx.getValorx() && fin.getValory()==puntoAx.getValory()){
                puntoAx.setValora('o');
                sp.anoiadir(puntoAx);
                 if(!puntos.isEmpty()){puntoAx=puntos.poll();}
            }*/
            
        
    
    }
    public cuerpo generarOtro(){
        return new cuerpo((int)(Math.random()*15), (int)(Math.random()*15), 's', tam);
    }
    
}
