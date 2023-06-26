package swp.demointelij;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

    @FXML
    private Label textLabel1;

    @FXML
    private Label textLabel2;

    public void initialize() {
        String randomLine1 = getRandomLineFromFile(Main.FILE1_PATH);
        String randomLine2 = getRandomLineFromFile(Main.FILE2_PATH);
        String modifiedLine1 = ("Ich " + randomLine1);
        String modifiedLine2 = (" in " + randomLine2);

        textLabel1.setText(modifiedLine1);
        textLabel2.setText(modifiedLine2);
    }

    private String getRandomLineFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!lines.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(lines.size());
            return lines.get(randomIndex);
        }

        return "";
    }
}

