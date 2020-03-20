package sample;

public class Game {
    private Field field;
    private State state;

    public Game(){
        this.field=new Field();
        this.state=State.READY;
    }

    public Field getField() {
        return field;
    }

    public void startGame(){
        do {
            resetGame();
        } while (!field.isSolvable());
    }

    public void resetGame(){
        if (state!=State.READY){
            state=State.READY;
            this.field=null;
        }
    }

    public void endGame(){
        if (state!=State.RUNNING){
            state= State.FINISHED;
            this.field=null;
        }
    }
}
