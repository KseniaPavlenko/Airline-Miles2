public class Main {

    public static void main(String[] args) {
        int ticketPrice = -12_550;
        int oneBonusMileCost = 20;
        int bonusMilesCount = ticketPrice / oneBonusMileCost;

        if (bonusMilesCount > 0) {

            System.out.println(bonusMilesCount);
        } else {
            System.out.println("Something goes wrong, please check the ticket price");
        }
    }
}
