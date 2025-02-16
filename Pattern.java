public class Pattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < 4; i++) {
            for (j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
        System.out.println();
        for ( i = 1; i <= 4; i++) {
            if (i % 2 == 1) { 
                for (j = i; j <= 4; j++) {
                    System.out.print(j + " ");
                }
            } else { 
                for (j = 4; j >= i; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
