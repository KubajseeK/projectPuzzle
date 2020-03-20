package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public Button btnStart;
    public Button btnReset;
    public Button btnEnd;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    private Game game;

    public Controller() {
        game = new Game();
    }

    public void clickBtn(ActionEvent event) {

    }

    public void reset(ActionEvent actionEvent) {
        game.resetGame();
        btnReset.setDisable(true);
        btnStart.setDisable(false);
        btnEnd.setDisable(false);
    }

    public void start(ActionEvent actionEvent) {
        game.startGame();
        btnStart.setDisable(true);
        btnReset.setDisable(false);
        btnEnd.setDisable(false);
    }

    public void end(ActionEvent actionEvent) {
        game.endGame();
        btnStart.setDisable(false);
        btnReset.setDisable(false);
        btnEnd.setDisable(true);
    }
}