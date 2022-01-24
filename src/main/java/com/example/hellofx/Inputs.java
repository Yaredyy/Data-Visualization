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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;
// import java.util.ArrayList;l

//import of exception
import java.io.IOException;

//class signature
public class Inputs extends Application {
    //main page
    @Override
    public void start(Stage stage) throws IOException {

        //header
        Text head = new Text("Inputs");
        head.setFont(Font.font("Arial", FontWeight.BOLD, 36));

        //header HBox
        HBox header = new HBox(head);
        header.setAlignment(Pos.BASELINE_CENTER);

        //input fields

        //field 1
        Text text1 = new Text("Input field 1: ");
        TextField field1 = new TextField();

        HBox textField1 = new HBox(text1, field1);

        //field 2
        Text text2 = new Text("Input field 2: ");
        TextField field2 = new TextField();

        HBox textField2 = new HBox(text2, field2);

        //field 3
        Text text3 = new Text("Input field 3: ");
        TextField field3 = new TextField();

        HBox textField3 = new HBox(text3, field3);

        //field 4
        Text text4 = new Text("Input field 4: ");
        TextField field4 = new TextField();

        HBox textField4 = new HBox(text4, field4);

        //field 5
        Text text5 = new Text("Input field 5: ");
        TextField field5 = new TextField();

        HBox textField5 = new HBox(text5, field5);


        VBox fields = new VBox(textField1, textField2, textField3, textField4, textField5);

        fields.setAlignment(Pos.BASELINE_CENTER);

        //button for adding
        // Button addField = new Button();
        
        
        // addField.setText("Add input field");
        // addField.setOnAction(actionEvent ->  {
        //     //change
        // });
        
        //button for removing a field
        // Button removeField = new Button();
        
        // removeField.setText("Remove input field");
        // removeField.setOnAction(actionEvent ->  {
        //     //change
        // });

        //button for computing a field
        Button compute = new Button();
        
        compute.setText("Graph input fields");
        compute.setOnAction(actionEvent ->  {
            grapher(textField1, textField2, textField3, textField4, textField5);
        });
        
        
        //vbox for options
        HBox options = new HBox(compute);
        options.setAlignment(Pos.BASELINE_CENTER);

        //main screen
        BorderPane screen = new BorderPane();

        //border components
        screen.setTop(header);
        screen.setCenter(fields);
        screen.setBottom(options);


        //outputs to screen
        Scene scene = new Scene(screen, 495,810);
        stage.setTitle("Inputs!");
        stage.setScene(scene);
        stage.show();

    }


    //compute graph
    public void grapher(Object textField1, Object textField2, Object textField3, Object textField4, Object textField5){

        //header
        Text graphText = new Text("Graph");
        graphText.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        
        //header hbox
        HBox graphHeader = new HBox(graphText);
        graphHeader.setAlignment(Pos.BASELINE_CENTER);
        
        //graph

        //rectangle 1
        Rectangle chart1 = new Rectangle();
        chart1.setWidth(10);
        chart1.setHeight(Integer.parseInt(((Text) textField1).getText()));

        //rectangle 2
        Rectangle chart2 = new Rectangle();
        chart2.setWidth(10);
        chart2.setHeight(Integer.parseInt(((Text) textField2).getText()));

        //rectangle 3
        Rectangle chart3 = new Rectangle();
        chart3.setWidth(10);
        chart3.setHeight(Integer.parseInt(((Text) textField3).getText()));

        //rectangle 4
        Rectangle chart4 = new Rectangle();
        chart4.setWidth(10);
        chart4.setHeight(Integer.parseInt(((Text) textField4).getText()));

        //rectangle 5
        Rectangle chart5 = new Rectangle();
        chart5.setWidth(10);
        chart5.setHeight(Integer.parseInt(((Text) textField5).getText()));


        VBox graphBox = new VBox(chart1, chart2, chart3, chart4, chart5);
        //borderpane
        BorderPane graph = new BorderPane();
        graph.setTop(graphHeader);
        graph.setCenter(graphBox);

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