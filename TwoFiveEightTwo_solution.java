public class TwoFiveEightTwo_solution {
    public int passThePillow(int n, int time) {
        int rest = time%(2*(n-1));
        return 1+Math.min(rest,2*(n-1)-rest);
    }
}
