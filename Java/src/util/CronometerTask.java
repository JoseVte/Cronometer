/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import javafx.scene.text.Text;

/**
 *
 * @author josrom
 */
public class CronometerTask implements Runnable {
    private Text time;
    private final SimpleDateFormat formatter;
    private long now = 0;
    private boolean stopped;
    
    public CronometerTask() {
        super();
        formatter = new SimpleDateFormat("HH:mm:ss.SSS");
    }

    @Override
    public void run() {
        while(!Thread.interrupted()) {
            while(!stopped && !Thread.interrupted()) {
                String str = formatter.format(now);
                time.setText(str.substring(0,str.length()-2));
                now+=100;
                try {
                    sleep(100);
                } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }
            }
            try {
                sleep(10);
            } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }
        }
    }

    public void setText(Text time) {
        this.time = time;
    }

    public void setStart(long time) {
        now = time;
    }

    public void stoped() {
        stopped = true;
    }

    public void started() {
        stopped = false;
    }
}
