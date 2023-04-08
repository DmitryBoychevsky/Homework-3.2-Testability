public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bodyMassIndex = service.calculate (1.77, 96);
        System.out.println( " индекс массы тела " + bodyMassIndex);


    }
}
