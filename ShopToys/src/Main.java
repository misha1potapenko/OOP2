import Servise.AddToy;
import Servise.Game;

public class Main {
    public static void main(String[] args) throws Exception {
        AddToy add = new AddToy();
        add.addToy();

        Game newGame = new Game();
        newGame.showToy();
        newGame.showGame();

    }
}