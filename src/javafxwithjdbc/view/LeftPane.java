
package javafxwithjdbc.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafxwithjdbc.controller.UserControl;
import javafxwithjdbc.model.User;


public class LeftPane extends VBox{
    
     //temp variable to load id(use when delete)
    int tempId;
    
    //object from uc
    UserControl uc=new UserControl();
    
    //labels
    Label labelTitle=new Label("Pharmacist");
    Label labelTitle2=new Label("add new drug");
    
    //textFeild
    TextField txtName=new TextField();
    TextField txtAge=new TextField();
    TextField txtYear=new TextField();
    
    //button
    Button btnSave=new Button("insert");
    Button btnUpdate=new Button("Update");
    Button btnDelete=new Button("Delete");
    
   
    
    //add  component to leftPane(constructor)
    public LeftPane(){
        
                      /////////addcomponant////////
        this.getChildren().addAll(labelTitle,labelTitle2,txtName,txtAge,txtYear,btnSave,btnUpdate,btnDelete);
        
                           /////start css style////////// 
        this.setSpacing(15);
        this.setPadding(new Insets(15));
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color:#3498db");
        
        //label
        labelTitle.setStyle("-fx-font-size:25;-fx-text-fill:#FFF");
        labelTitle2.setStyle("-fx-font-size:15");
        
        //buttons
        btnSave.setStyle("-fx-background-color:#2ecc71;-fx-font-size:18;-fx-text-fill:#FFF");
        btnUpdate.setStyle("-fx-background-color:#2ecc71;-fx-font-size:18;-fx-text-fill:#FFF");
        btnDelete.setStyle("-fx-background-color:#2ecc71;-fx-font-size:18;-fx-text-fill:#FFF");
        
        btnSave.setPrefWidth(150);
        btnUpdate.setPrefWidth(150);
        btnDelete.setPrefWidth(150);
        
        //textField
        txtName.setStyle("-fx-font-size:18");
        txtAge.setStyle("-fx-font-size:18");
        txtYear.setStyle("-fx-font-size:18");
        
        txtName.setPromptText("Enter Diagnosis");
        txtAge.setPromptText("Enter NameOfDrug");
        txtYear.setPromptText("Enter price");
                //////////////////end css style////////////////////////
        
                     ////////start Actions////////////////
        //action btnsave
        btnSave.setOnMouseClicked(e ->{
            User usr=new User();
            usr.setName(txtName.getText());
            usr.setAge(txtAge.getText());
            usr.setYear(txtYear.getText());
            uc.insert(usr);
            
            //to add users in table view
            JavaFxwithJdbc.rightPane.table.setItems(uc.getAllUsers());
            
            //clear txtfield
            txtName.setText("");
            txtAge.setText("");
            txtYear.setText("");
        });
        ///////////////
        
        //action btnUpdate
        btnUpdate.setOnMouseClicked(e ->{
            User usr=new User();
            usr.setId(tempId);
            usr.setName(txtName.getText());
            usr.setAge(txtAge.getText());
            usr.setYear(txtYear.getText());
            
            uc.update(usr);
            
            //to add users in table view(refresh table)
            JavaFxwithJdbc.rightPane.table.setItems(uc.getAllUsers());
        });
        //////////////
        
        //action btnDelete
         btnDelete.setOnMouseClicked(e ->{
             uc.delete(tempId);
             //to add users in table view(refresh table)
            JavaFxwithJdbc.rightPane.table.setItems(uc.getAllUsers());
         });
        ////////////////
             ////////////////////////End Actions///////////////////////////
         
    }
    
}














