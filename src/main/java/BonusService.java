public class BonusService {

    public int calcBonus(int amount, boolean isRegictered) {
        int percent = isRegictered ? 3 : 1;
        int bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = 500;

        }
        return bonus;
    }
}
