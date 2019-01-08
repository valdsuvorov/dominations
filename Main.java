package menuDom;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import java.util.*;
import java.io.IOException;
import java.lang.*; 
import java.util.ResourceBundle;
import java.net.URL;
import javafx.scene.control.TextField;
import javafx.scene.control.SplitMenuButton; 
import javafx.scene.control.ComboBox; 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;



 
public class Main extends Application implements Initializable {
	// @FXML Button back;
   // @FXML Button players4;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
		
    } 
    
    public static void main(String[] args) {
        launch(args);
        
    }
    public static Stage pStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
    	
        URL url = getClass().getResource("test2.fxml");
        if (url == null) {
            System.out.println("Can't load FXML file");
            Platform.exit();
            pStage=primaryStage;
        }
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("demo.css").toExternalForm());
 
        primaryStage.setTitle("Domi'Nations");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
  /*  @FXML
    public void players2(ActionEvent event) {
        URL url2 =getClass().getResource("test3.fxml");
		try {
		Scene scene2 = new Scene(FXMLLoader.load(url2));
		
        pStage.setScene(scene2);
        pStage.setResizable(false);
        pStage.show();
        System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        
    } */
}
