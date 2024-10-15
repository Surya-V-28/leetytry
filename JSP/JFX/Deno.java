package b2javafxdemo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class B2JavaFXDemo1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age");
        TextField nameText = new TextField();
        TextField ageText = new TextField();
        Label displayMsg = new Label();
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("FeMale");
        ToggleGroup gender = new ToggleGroup();
        male.setToggleGroup(gender);
        female.setToggleGroup(gender);
        Label genLabel = new Label("Gender");
        male.setSelected(true);
        Button btn = new Button("CLICK HERE");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
/*                String res;
                res = nameText.getText()+" Welcome to this class";
                res += " You are "+ageText.getText()+" years old";
                if (male.isSelected())
                    res += " you are male";
                else
                    res += " You are Female";*/
                  int n1,n2,n3;
                  n1 = Integer.parseInt(nameText.getText());
                  n2 = Integer.parseInt(ageText.getText());
                  n3 = n1 + n2;
                displayMsg.setText(String.valueOf(n3));
            }
        });
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,10,10));
       // root.setVgap(5);
        root.setHgap(10);
        root.addRow(0,nameLabel,nameText);
        root.addRow(1,ageLabel,ageText);
        root.addRow(2,genLabel,male,female);
        root.add(btn, 1, 3);
        root.add(displayMsg,1,4);
        
        Scene scene = new Scene(root, 500, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
