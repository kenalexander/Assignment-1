package product;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ProductView.fxml"));

        AnchorPane root = loader.load();

        Scene createProductScene = new Scene(root);
        primaryStage.setScene(createProductScene);
        primaryStage.setTitle("Inventory");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
