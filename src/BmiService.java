public class BmiService {
    public int calculate(double heightM, int weightKilo) {
        double heightSquared;
        heightSquared = heightM * heightM;

        double bodyMassIndex = weightKilo / heightSquared;
        //bodyMassIndex = weightKilo / heightSquared;

        return (int) bodyMassIndex;

    }


}
