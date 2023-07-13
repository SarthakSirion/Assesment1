// Author: Sarthak Shrivastava

import java.util.ArrayList;
import java.util.List;

class Game {
    String gameName;
    String authorName;
    float price;

    public Game(String gameName, String authorName, float price) {
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game Name: " + this.gameName + "\t" + "Author Name: " + this.authorName + "\t" + "Price: "
                + this.price;
    }
}

class GameService {
    private static List<Game> games = new ArrayList<Game>();

    static {
        games.add(new Game("SnowBird", "Danny", 300f));
        games.add(new Game("FreshFood", "Ram", 450f));
        games.add(new Game("Batsman", "Kate", 400f));
        games.add(new Game("Pokiman", "Steeve", 600f));
        games.add(new Game("YammyTommy", "Narayan", 350f));
    }

    static List<Game> viewAll() {
        return games;
    }

    static String authorSearch(String author) {
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).authorName.equals(author)) {
                return games.get(i).gameName;
            }
        }
        return "Game by author name " + author + " not found.";
    }
}
