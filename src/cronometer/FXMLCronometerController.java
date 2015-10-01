/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometer;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 *
 * @author josrom
 */
public class FXMLCronometerController implements Initializable {
    private Cronometer cronometer;
    
    @FXML
    private Text time;
    
    @FXML
    protected void action(ActionEvent event){
        String action = ((Button)event.getSource()).getId();
        try {
            cronometer.getClass().getMethod(action).invoke(cronometer);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(FXMLCronometerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cronometer = new Cronometer(time);
    }    
    
}
