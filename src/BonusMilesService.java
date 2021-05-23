public class BonusMilesService {
    public int calculate(int cost) {
        int accrueBonus = 20; //за каждых 20 руб бонус;
        int miles = cost / accrueBonus;
        return miles;
    }
}
