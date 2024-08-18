public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        int[] array1 = new int[]{1, 2, 3};

        double[] array2 = new double[]{1.57, 7.654, 9.986};

        int[] array3 = new int[4];
        array3[0] = 2;
        array3[1] = 4;
        array3[2] = 1;
        array3[3] = 8;


        System.out.println();
        //Task 2
        System.out.println("Task 2");

        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.print(array1[array1.length - 1]);

        System.out.println();

        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.print(array2[array2.length - 1]);

        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            if (i < array3.length - 1) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }

        System.out.println();


        //Task 3
        System.out.println("Task 3");

        for (int i = array1.length - 1; i > 0; i--) {
            System.out.print(array1[i] + ", ");
        }
        System.out.print(array1[0]);
        System.out.println();

        for (int i = array2.length - 1; i > 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.print(array2[0]);
        System.out.println();

        for (int i = array3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array1[i] += 1;
            }
            if (i < array1.length-1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
    }
}