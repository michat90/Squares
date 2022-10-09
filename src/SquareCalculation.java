public class SquareCalculation {
    public static void main(String[] args) {
        int a;
        a = 2;
        addCalculation(a);
        System.out.println("---------------------------");
        a=7;
        addCalculation(a);
        System.out.println("---------------------------");
        a=11;
        addCalculation(a);
        System.out.println("---------------------------");
        a=19;
        addCalculation(a);
    }
    public static void addCalculation(int length){
        System.out.println("Kwadrat od długości boku: " + length);
        System.out.println("Pole powierzchni kwadratu: " + (length*length));
        System.out.println("Obwód kwadratu: " + (length*4));
        System.out.println("Długość przekątnej kwadratu: " + (length*Math.sqrt(2)));
    }
}
