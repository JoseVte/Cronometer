/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometer;

import javafx.scene.text.Text;

/**
 *
 * @author josrom
 */
public class Cronometer {
    private final Text time;

    Cronometer(Text time) {
        this.time = time;
    }
    
    public void start() {
        System.out.println("start");
    }
    
    public void stop() {
        System.out.println("stop");
    }
    
    public void reset() {
        System.out.println("reset");
    }
}
