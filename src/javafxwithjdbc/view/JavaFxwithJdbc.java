
package javafxwithjdbc.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxwithJdbc extends Application{

    //object of leftPane & rightPane
    static LeftPane leftpane=new LeftPane();
    static RightPane rightPane=new RightPane();
    
    //start method
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //create Hbox . add left and right pane
        HBox main=new HBox();
        main.getChildren().addAll(leftpane,rightPane);
        
        //binding property
        leftpane.prefWidthProperty().bind(main.widthProperty().divide(4));
        rightPane.prefWidthProperty().bind(main.widthProperty().subtract(main.widthProperty().divide(4)));
        
        //set scene
        Scene scene=new Scene(main,1100,700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //main method
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
