class Calculators {
    public int add(int num1, int num2){
        return num1 + num2;
}
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
        public double add(double num1, double num2){
            return num1 + num2 ;
        }
}

public class AdditionOverLoading {
    public static void main(String[] args) {
        Calculators obj = new Calculators();
        int sum1 = obj.add(5, 10);
        int sum2 = obj.add(1, 2, 3);
        double sum3 = obj.add(4.5,5.5);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
