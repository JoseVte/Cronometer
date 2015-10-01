/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometer;

import util.CronometerTask;
import java.util.Date;
import javafx.scene.text.Text;

/**
 *
 * @author josrom
 */
public class Cronometer {
    private final Text time;
    private final CronometerTask c;
    private final Thread thread;

    Cronometer(Text time) {
        this.time = time;
        this.time.setText("00:00:00:0");
        this.c = new CronometerTask();
        this.thread = new Thread(c, "timer");
        c.setText(time);
        c.setStart(new Date(0,0,0,0,0,0).getTime());
        c.stoped();
    }
    
    public void start() {
        System.out.println("start");
        if (!thread.isAlive()) {
            thread.start();
        }
        c.started();
    }
    
    public void stop() {
        System.out.println("stop");
        c.stoped();
    }
    
    public void reset() {
        System.out.println("reset");
        time.setText("00:00:00:0");
        c.setStart(new Date(0,0,0,0,0,0).getTime());
    }
}
