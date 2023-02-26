/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flag.panel;

import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @FXML
    private Label label;
    
 @FXML
    private Button BUTTON1;

    @FXML
    private Button BUTTON2;

    @FXML
    private Button BUTTON3;

    @FXML
    private Button BUTTON4;

    @FXML
    private Button BUTTON5;

    @FXML
    private Button BUTTON6;
    
    @FXML
    private Rectangle rectangle;

    @FXML
    private Rectangle rectangle1;

    @FXML
    private Rectangle rectangle2;
    
    public static boolean checkRelationship(String key, String value) {
    HashMap<String, String> hashmap = new LinkedHashMap<String, String>();

    // Adding Key and Value pairs to HashMap
    hashmap.put("BLUE","WHITE");
    hashmap.put("RED","YELLOW");
    hashmap.put("BLUE","BLACK");
     hashmap.put("RED","WHITE");
      hashmap.put("RED","BLACK");

    boolean flag=false;
    if(hashmap.containsKey(key)&&hashmap.containsValue(value))
        flag=true; 
    else
        flag=false;

    return flag;
}
     @FXML
    void ESTONIA(ActionEvent event) {
   this.rectangle.setStroke(Color.BLACK);
    rectangle.setStrokeWidth(1);
this.rectangle.setFill(Color.LIGHTBLUE);
 rectangle1.setStrokeWidth(1);
       this. rectangle1.setFill(Color.BLACK);
        rectangle2.setStrokeWidth(1);
       this. rectangle2.setFill(Color.WHITE); 
}
 @FXML
    void CLEAR(ActionEvent event) {
        this.rectangle.setStroke(Color.BLACK);
   this.rectangle.setFill(null);
       this. rectangle1.setFill(null);
        this.rectangle2.setFill(null); 
    }
@FXML
    void AUSTRIA(ActionEvent event) {
        this.rectangle.setStroke(Color.BLACK);
         rectangle.setStrokeWidth(1);
  this. rectangle.setFill(Color.RED);
   rectangle1.setStrokeWidth(1);
      this.  rectangle1.setFill(Color.WHITE);
       rectangle2.setStrokeWidth(1);
       this. rectangle2.setFill(Color.RED);   
    }
@FXML
    void LESOTHO(ActionEvent event) {
       this.rectangle.setStroke(Color.BLACK);
         rectangle1.setStrokeWidth(1);
      Rectangle rectangle =new Rectangle();
   this. rectangle.setFill(Color.BLUE);
       this. rectangle1.setFill(Color.WHITE);
        rectangle1.setStrokeWidth(1);
       this. rectangle2.setFill(Color.GREEN); 
        rectangle2.setStrokeWidth(1);
    }
@FXML
    void SYRIA(ActionEvent event) {
        this.rectangle.setStroke(Color.BLACK);
      this.   rectangle.setFill(Color.RED);
       rectangle.setStrokeWidth(1);
    this.rectangle1.setFill(Color.WHITE);
     rectangle1.setStrokeWidth(1);
       this. rectangle2.setFill(Color.BLACK);
        rectangle2.setStrokeWidth(1);
 }
 @FXML
    void SPAIN(ActionEvent event) {
        this.rectangle.setStroke(Color.BLACK);
         rectangle.setStrokeWidth(1);
 this. rectangle.setFill(Color.RED);
  rectangle1.setStrokeWidth(1);
   this. rectangle1.setFill(Color.YELLOW);
    rectangle2.setStrokeWidth(1);
       this. rectangle2.setFill(Color.RED);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
