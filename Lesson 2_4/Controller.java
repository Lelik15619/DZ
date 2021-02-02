package sample;

import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    private final ObservableList<String> startMSG = FXCollections.observableArrayList(
            "Сообщения"
    );
    @FXML
    void initialize() {
        listView.setItems(startMSG);

    }

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    @FXML
    void sendMSG() {
        String msg = inputField.getText().trim();
        if (msg.isBlank()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка ввода!!!");
            alert.setHeaderText("Вы ввели как буквы только наоборот!!!");
            alert.show();
        } else {
            addMsgToList(msg);


        }
        inputField.clear();
    }



        private void addMsgToList (String msg){
            listView.getItems().add(msg);
        }



        @FXML
        void showAbout () {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Чат LelikJan");
            alert.setHeaderText("Чат создан Lelik под чутким руководством сенсея Timofey Safronov");
            alert.show();
        }

        @FXML
        void exit () {
            System.exit(0);
        }
    }
