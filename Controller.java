package menuDom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import java.util.*;
import java.lang.*; 
import java.util.ResourceBundle;
import java.net.URL;
import javafx.scene.control.TextField;
import javafx.scene.control.SplitMenuButton; 
import javafx.scene.control.ComboBox; 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;




public class Controller extends Application implements Initializable {
	 @Override
	    public void initialize(URL url, ResourceBundle rb)
	    {
			
	    } 
   @FXML private void buttonQuit(ActionEvent event) {
	   System.exit(0);
   }
  // @FXML private void players2(ActionEvent event) {
  // }
   
   // @FXML private void players3(ActionEvent event) {
	//   Main.changeScene("test3.fxml");
 //  }
  // @FXML private void players4(ActionEvent event) {
	//   Main.changeScene("test3.fxml");
  // }
   @FXML CheckBox check;
   @FXML
    TextField name;
    @FXML private ComboBox color;
   public ObservableList<String> lesCouleurs = FXCollections.observableArrayList("1","2","3","4");
    
    @FXML public Label warn;
   	
    
   
   public String handle(ActionEvent event) {
    final String nom=name.getText();
   
     final String couleurStr = color.getSelectionModel().getSelectedItem().toString();
   final boolean ia=check.isSelected();
  
  final String ai = String.valueOf(ia);
     
   
   if(nom.length()<1 ) {
	   warn.setOpacity(1);
	   System.out.println("Output : ");
	   return("");
	  
   }
   else {
	   String output=(new StringBuilder()).append(nom+", ").append(couleurStr+", ").append(ai).toString();
	   System.out.println("Output : "+output);
	   return(output);
   }



}
   
   public String back(ActionEvent event) {
	   
   }
   
   @FXML
   public Button back;
   
   @FXML
   private void handleBack (ActionEvent event) throws Exception {
       Stage stage;
       Parent root;
      
       if(event.getSource()==back){
           stage = (Stage) back.getScene().getWindow();
           root = FXMLLoader.load(getClass().getResource("test2.fxml"));
           System.out.println("back");
       }
       else {
           stage = (Stage) back.getScene().getWindow();
           root = FXMLLoader.load(getClass().getResource("test2.fxml"));
           System.out.println("back2");
       }
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setResizable(false);
       stage.show();
       
   }
}
   

     
     
     
   
