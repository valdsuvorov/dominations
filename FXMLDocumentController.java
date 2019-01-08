package menuDom;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    
    
    @FXML
    public Button players2, players3;
    
    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;
       
        if(event.getSource()==players2){
            stage = (Stage) players2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("test3.fxml"));
            System.out.println("p2");
        }
        else {
            stage = (Stage) players3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("test3.fxml"));
            System.out.println("p3");
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
    
    @FXML private void buttonQuit(ActionEvent event) {
 	   System.exit(0);
    }
}