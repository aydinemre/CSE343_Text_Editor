/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Habibe
 */
public class AskChangesController implements Initializable {
    
    @FXML
    public Button save;
    @FXML
    public Button dontSave;
    @FXML
    public Button cancel;
    @FXML
    public ImageView Image;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Save"); 
        //EditorController.save();
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("Don't Save"); 
        //EditorController.save();
    }
    
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        cancel();
    }
    public void cancel() {
        ((Stage) (cancel.getScene().getWindow())).close();
    }
    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle rb) {
        Image.setImage(new Image("file:src/Assets/64x64_panda_icon.png"));
    }
    
    public void askToChanges() throws IOException{
        
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Error"); 
        Parent root = FXMLLoader.load(getClass().getResource("AskToChanges.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
 
    
}
