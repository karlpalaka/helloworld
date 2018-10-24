package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Board;
import model.Cards;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        Cards gp = new Cards();
        Board board = new Board();

        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello world.");

        GridPane grid = new GridPane();
        Label label = new Label("Hello world.");
        Scene scene = new Scene(grid, 300, 275);
        grid.add(label, 0, 0);

        System.out.println(board.board[2][0]);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
