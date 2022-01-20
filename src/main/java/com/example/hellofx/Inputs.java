//required package currently, might get removed if alternative found.
package com.example.hellofx;

//import class
import javafx.application.Application;
import javafx.geometry.Pos;
// import javafx.event.Event;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.ArrayList;

//import of exception
import java.io.IOException;

//class signature
public class Inputs extends Application {
    //main page
    @Override
    public void start(Stage stage) throws IOException {
        int x = 1;
        int y = 1;
        ArrayList<TextField> inputs = new ArrayList<TextField>();

        //header
        Text head = new Text("Inputs");
        head.setFont(Font.font("Arial", FontWeight.BOLD, 36));

        //header HBox
        HBox header = new HBox(head);
        header.setAlignment(Pos.BASELINE_CENTER);

        
        //button for adding
        Button addField = new Button();
        
        
        addField.setText("Add input field");
        addField.setOnAction(actionEvent ->  {
            //change
        });
        
        //button for removing a field
        Button removeField = new Button();
        
        removeField.setText("Remove input field");
        removeField.setOnAction(actionEvent ->  {
            //change
        });

        //button for computing a field
        Button compute = new Button();
        
        compute.setText("Graph input fields");
        compute.setOnAction(actionEvent ->  {
            //change
        });
        
        
        //vbox for options
        HBox options = new HBox(addField, removeField, compute);
        options.setAlignment(Pos.BASELINE_CENTER);

        //main screen
        BorderPane screen = new BorderPane();

        //border components
        screen.setTop(header);
        // screen.setCenter();
        screen.setBottom(options);


        //outputs to screen
        Scene scene = new Scene(screen, 495,810);
        stage.setTitle("Inputs!");
        stage.setScene(scene);
        stage.show();

    }


    //compute graph
    public void grapher(){

        //header
        Text graphText = new Text("Graph");
        graphText.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        
        //header hbox
        HBox graphHeader = new HBox(graphText);
        graphHeader.setAlignment(Pos.BASELINE_CENTER);
        
        //y values


        
        
        
        
        
        
        
        //borderpane
        BorderPane graph = new BorderPane();
        graph.setTop(graphHeader);

        //uses method to show graph
        Scene scene = new Scene(graph,495,810);
        grapherStage(scene);
    }

    //show graph
    public void grapherStage(Scene scene){
        //creates window of inputed scene
        Stage stage2 = new Stage();
        stage2.setTitle("Graph");
        stage2.setScene(scene);
        stage2.show();
    }

    //runner
    public static void main(String[] args) {
        launch();
    }
}