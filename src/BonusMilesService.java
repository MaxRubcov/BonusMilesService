public class BonusMilesService {

    public int calculate(int price) {
        int pricePerMile = 20;
        int bonus;
        if (price < 20) {
            bonus = 0;
        } else {
            bonus = price / pricePerMile;
        }
        return bonus;
    }
}
