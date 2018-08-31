
package javafxwithjdbc.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafxwithjdbc.controller.UserControl;
import javafxwithjdbc.model.User;


public class RightPane extends VBox{
    
    //object from Uc
    UserControl uc=new UserControl();
    
    //searchPane
    HBox searchPane=new HBox();
     
    //txt &btn search
    TextField txtSearch=new TextField();
    Button btnSearch=new Button("Search");
    
    //tableView
    TableView<User> table=new TableView();
    
    //label 
    Label l =new Label("developed by mohamed hamdy elnagar \n 01281677572");
    
     //add  component to rightPane(constructor)
    public RightPane(){
        
        
                      //////////////start add component//////////

         //add allcomponant searchPane
        searchPane.getChildren().addAll(txtSearch,btnSearch);
        
        //add searchePane tableview
        
        this.getChildren().addAll(searchPane,table,l);
        
        //add to table view 
        TableColumn<User,Integer> columnId=new TableColumn("ID");
        TableColumn<User,String> columnName=new TableColumn(" Diagnosis");
        TableColumn<User,Integer> columnAge=new TableColumn(" Name Of Drug");
        TableColumn<User,Integer> columnYear=new TableColumn(" price     ");
        
        //add column (--id ,name ,age,year-->the same of db )
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        columnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        
        //add value of column to table
        table.getColumns().addAll(columnId,columnName,columnAge,columnYear);
        //set items in table 
        table.setItems(uc.getAllUsers());
                //////////////end add component//////////
        
                //////////start Actions///////        
        
        //table action
        table.setOnMouseClicked(e ->{
            User user=table.getSelectionModel().getSelectedItem();
            JavaFxwithJdbc.leftpane.txtName.setText(user.getName());
            JavaFxwithJdbc.leftpane.txtAge.setText(user.getAge()+"");
            JavaFxwithJdbc.leftpane.txtYear.setText(user.getYear()+"");
            JavaFxwithJdbc.leftpane.tempId=user.getId();
        });
        
        //action btnsearch
        btnSearch.setOnMouseClicked(e ->{
            this.table.setItems(uc.search(txtSearch.getText()));
        });
           //////////////////end actions////////
      
        
        
            //////////start css style/////////// 
       this.setSpacing(15);
       this.setPadding(new Insets(15));
       this.setAlignment(Pos.CENTER);
       
       //binding tableview
        columnId.prefWidthProperty().bind(table.widthProperty().divide(8));
        columnName.prefWidthProperty().bind(table.widthProperty().divide(3));
        columnAge.prefWidthProperty().bind(table.widthProperty().divide(3));
        columnYear.prefWidthProperty().bind(table.widthProperty().divide(5));
       
       //serchpane style
       searchPane.setSpacing(15);
       searchPane.setPadding(new Insets(15));
       searchPane.setAlignment(Pos.CENTER);
       
       //txtsearch
       txtSearch.setStyle("-fx-font-size:18");
       
       txtSearch.setPromptText("Enter searched name");
       
       //button
       btnSearch.setStyle("-fx-background-color:#2ecc71;-fx-font-size:18;-fx-text-fill:#FFF");
       
       //label
       l.setStyle(";-fx-font-size:15;-fx-text-fill:#2ecc71");
        //rightPane
        //this.setStyle("-fx-background-color:#3498db");
            //////////end css style///////////
        
    }
    
}
