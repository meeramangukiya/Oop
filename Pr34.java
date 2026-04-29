import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.*;

public class Main extends Application {

    public void start(Stage stage) {

        GridPane g = new GridPane();
        g.setVgap(10);
        g.setHgap(10);

        TextField r = new TextField();
        TextField n = new TextField();
        TextField a = new TextField();
        TextField e = new TextField();

        Button b = new Button("Submit");

        g.add(new Label("Roll No"), 0, 0); g.add(r, 1, 0);
        g.add(new Label("Name"), 0, 1); g.add(n, 1, 1);
        g.add(new Label("Age"), 0, 2); g.add(a, 1, 2);
        g.add(new Label("Email"), 0, 3); g.add(e, 1, 3);
        g.add(b, 1, 4);

        b.setOnAction(x -> {
            try {
                int roll = Integer.parseInt(r.getText());
                int age = Integer.parseInt(a.getText());
                String name = n.getText();
                String email = e.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                FileChooser fc = new FileChooser();
                File f = fc.showSaveDialog(stage);

                if (f != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                    bw.write(roll + " " + name + " " + age + " " + email);
                    bw.close();
                }

                new Alert(Alert.AlertType.INFORMATION,
                        "Success\n" + roll + " " + name + " " + age + " " + email).show();

            } catch (NumberFormatException ex) {
                new Alert(Alert.AlertType.ERROR, "Roll No & Age must be numbers").show();
            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, ex.getMessage()).show();
            }
        });

        stage.setScene(new Scene(g, 300, 200));
        stage.setTitle("Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
