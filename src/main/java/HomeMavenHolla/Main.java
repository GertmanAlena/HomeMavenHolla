package HomeMavenHolla;

public class Main {
    public static void main(String[] args) {

        Players player1 = new Players("Вася", false);
        long victoriesOld = Game.checkOldChoice(1000);
        System.out.printf("%s выиграл %d раз", player1, victoriesOld);

        System.out.println();
        System.out.println("----------------");
        Players player2 = new Players("Алёша", true);
        long victoriesNew = Game.checkNewChoice(1000);
        System.out.printf("%s выиграл %d раз", player2, victoriesNew);



    }
}