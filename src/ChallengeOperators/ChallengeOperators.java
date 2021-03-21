package ChallengeOperators;

public class ChallengeOperators {
    public static void main(String[] args) {

        double firstDoub = 20.00D;
        double secondDoub = 80.00D;
        double added = (firstDoub + secondDoub) * 100.00D;
        System.out.println("added total is = " + added);
        double rem = added % 40.00D;
        System.out.println("The remainder is = " + rem);
        boolean esCero = (rem == 0) ?true : false;
        System.out.println("esCero = " + esCero);
        if (!esCero) {
            System.out.println("Got some remainder!");
        }

    }
}
