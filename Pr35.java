import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BarChartFX extends Application {

    public void start(Stage stage) {

        VBox projects = createBar("Projects — 20%", 80, Color.RED);
        VBox quizzes = createBar("Quizzes — 10%", 40, Color.BLUE);
        VBox midterm = createBar("Midterm — 30%", 120, Color.GREEN);
        VBox finalExam = createBar("Final — 40%", 160, Color.ORANGE);

        HBox root = new HBox(20, projects, quizzes, midterm, finalExam);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String label, int height, Color color) {
        Rectangle bar = new Rectangle(40, height);
        bar.setFill(color);

        Text text = new Text(label);

        VBox box = new VBox(5, bar, text);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
