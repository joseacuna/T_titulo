/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phobos
 */

package appArriendos;
import javax.swing.JProgressBar;
public class HiloProgreso extends Thread {
    
     JProgressBar progreso;


     
    public HiloProgreso(JProgressBar progreso1)
    {        
        super();
        this.progreso=progreso1;
    }
    
    
    public void run()
{
    for(int i=1;i<=100;i=i+9)
    {
        progreso.setValue(i);

        pausa(80);
        
       
    }
}
   
    public void pausa(int mlSeg)
{
    try
    {
        // pausa para el splash
        Thread.sleep(mlSeg);
       
        
    }catch(Exception e){}
}
    
}
