import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class HelloWorld extends Application{
    private Text myLabel;
    public void start(Stage primaryStage){
        primaryStage.setTitle("");
        myLabel = new Text();
        Button myButton = new Button("Say Hello World!");
        myButton.setOnAction(e -> myLabel.setText("Hello 3035"));
        BorderPane pane = new BorderPane();
        pane.setTop(myButton);
        pane.setCenter(myLabel);
        Scene scene = new Scene(pane,450,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
