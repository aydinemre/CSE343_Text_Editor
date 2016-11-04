/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aliya
 */
public class FtpBoxController implements Initializable {

    public VBox ftpScene;
    public Button cancelButton;
    public Button saveButton;
    public TextField ipText;
    public TextField portText;
    public TextField idText;
    public PasswordField passText;
    public TextField fileNameText;
    public PasswordField filePassText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void save() {
        FtpSave saveFile;
//        saveFile.uploadToFTP(, , , , );
        System.err.println(passText.getText() + "\n" + filePassText.getText());
        ((Stage) (ftpScene.getScene().getWindow())).close();
    }

    public void cancel() throws Exception{

        Stage secondWindow = new Stage();
        secondWindow.initModality(Modality.APPLICATION_MODAL);
        secondWindow.setTitle("Error");

        Parent errorLayout = FXMLLoader.load(getClass().getResource("ErrorBox.fxml"), new MyResources("Hata", "Get cucked!"));

        
        Scene scene = new Scene(errorLayout);
        secondWindow.setScene(scene);
        secondWindow.showAndWait();
        
        
        
        ((Stage) (ftpScene.getScene().getWindow())).close();
    }

}
