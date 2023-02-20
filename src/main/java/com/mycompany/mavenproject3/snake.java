/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author yosoy
 */
public class snake {
    int tamanio=0;
    boolean viva=true;
    private cuerpo ini;
    private cuerpo fin;
    public snake(cuerpo l){
    l.setAnterior(l);
    l.setSiguiente(l);
    ini=l;
    fin=l;
        
        tamanio=1;
    }
    public int getTamanio(){
        return tamanio;
    }
    public boolean getViva(){
        return viva;
               
    }
    //izq =1: der=3:arib=2:abajo=4
    void moverTodo(int vL,int mxtam){
        int gd=tamanio;
        //int guardameesta= 
        int nm=0;
        cuerpo elme=ini;
        int posd=ini.getPosm();
        if(vL==8||Math.abs(posd-vL)==2){
            vL=posd;
        }
      
        nm=vL;
        while(gd-->0){
            
            int v1=0;
            int v2=0;
            char v3=0;
            v1=elme.getValorx();
            v2=elme.getValory();
            v3=elme.getValora();
            
            if(vL==1){
                if(v1-1<0){
                    v1=mxtam-1;
                    
                }else{
                    v1=v1-1;
                }
            }
            if(vL==3){
                if(v1+1>mxtam-1){
                    v1=0;    
                }else{
                    v1=v1+1;
                }
            }
            if(vL==4){
                if(v2-1<0){
                    v2=mxtam-1;
                    
                }else{
                    v2=v2-1;
                }
            }
            if(vL==2){
                if(v2+1>mxtam-1){
                    v2=1;    
                }else{
                    v2=v2+1;
                }
            }
            elme.setposm(nm);
            elme.setValorx(v1);
            elme.setValory(v2);
            elme.setValora(v3);
            elme=elme.getSiguiente();
            if(gd>0){nm=vL;vL=elme.getPosm();}
        }
    }
     public void anoiadir (cuerpo t){
            t.setAnterior(fin);
            fin.setSiguiente(t);
            fin=t;
            //tamanio++;
            
        }
     public void aumentarPunto(){
         tamanio++;
     }
     public par[][] crearTabla(par[][] vacia, par[][]control){
         int nd=tamanio;
          cuerpo elm=ini;      
         while(nd-->0&& viva){
             int xp=elm.getValorx();
             int yp=elm.getValory();   
                if(!control[xp][yp].us && elm.soycabeza()){viva=false;}else{
                 par nvp=new par(elm.getPosm(),elm.getValora());
                 nvp.us=false;
                 vacia[xp][yp]=nvp;
                elm=elm.getSiguiente();
                }
         }
         return vacia;
     
     }
     public cuerpo getFin(){
         return fin;
     }
     public cuerpo getinicio(){
         return ini;
     }
     
}
