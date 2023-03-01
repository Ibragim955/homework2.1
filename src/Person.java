import java.util.Arrays;

   class main {

       public static void main(String[] args) {
           task1();
           task2();
           task3();
           task4();

       }


       private static void task1() {
           int value = 33;
           changeValue(value);
           System.out.println(value);
       }

       private static void changeValue(int value) {
           value = 22;

       }

       private static void task2() {
           Integer value = 33;
           changeValue(value);
           System.out.println(value);

       }

       private static void changeValue(Integer value) {
           value = 22;
       }

       private static void task3() {
           Integer[] value = new Integer[]{3, 4};
           changeValue(value);
           System.out.println(Arrays.toString(value));
       }

       private static void changeValue() {
           Integer[] value = new Integer[]{1, 2};
       }


       private static void task4() {
           Integer[] value = new Integer[]{3, 4};
           changeValue(value);
           System.out.println(Arrays.toString(value));
       }

       private static void changeValue(Integer[] value) {
           value[0] = 99;
       }

   }


