public class Main {
    public static void main(String[] args) {
        Units Bear = new Units("Bear", 2, 2, "Vanilla", false); // object creation
        Units Cat = new Units("Cat", 3, 1, "Vanilla", false);
        Units FourTwo = new Units("FourTwo", 4, 2, "Trample", false);

        // set up String [] arrays
        // economy system?? so user can increase team size (team array)
        // building phase
        // system print team, shop, gold, level
        // combat phase
        // do math
        // declare winner

    }

    // keywords: Vanilla, Trample, Gives +1/+0
    static class Units {
        String name;
        int power;
        int health;
        //boolean hasAbility; // put on the stack? // rewrite as a string to read for keywords
        String keyword;
        boolean isDead;

        Units(String name, int power, int health, String keyword, boolean isDead){ // constructor
            this.name = name;
            this.power = power;
            this.health = health;
            this.keyword = keyword;
            this.isDead = isDead; // set to false as default?


        }

    }
}