public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы");
        int [] task = {1, 2, 3, 4};
        System.out.println("Задание " + task[0]);
        int [] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        double [] floatArray = {1.57, 7.654, 9.986};
        double [] newArray = new double[]{12.345, 0.000_000_001, 9.99, 875.497};
        System.out.println("Задание " + task[1]);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i]);
            if (i < floatArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}