class Player {
    String name;
    int score;

    Player(String name) {
        this.name = name;
        score = 0;
    }

    public String toString() {
        return name + " Score: " + score;
    }
}