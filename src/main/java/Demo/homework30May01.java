package Demo;

public class homework30May01 {
   public static void main(String[] args) {    
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    for (int k = 0; k < numbers.length; k++) {
                        if (k != i && k != j) {
<<<<<<< HEAD
=======
                           
>>>>>>> origin/master
                            System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                        }
                    }
                }
            }
        }
    }
}
