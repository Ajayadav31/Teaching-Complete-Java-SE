package arrays01;

public class InnerForLop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

    }
}

/*
 * i = 0 0<5 true
 * j = 0 0<5 true
 * j = 1 1<5 true
 * j = 2 2<5 true
 * j = 3 3<5 true
 * j = 4 4<5 true
 * j = 5 5<5 false
 * 
 * i = 1 1<5 true
 * j = 0 0<5 true
 * j = 1 1<5 true
 * j = 2 2<5 true
 * j = 3 3<5 true
 * j = 4 4<5 true
 * j = 5 5<5 false
 * 
 * i = 2 2<5 true
 * j = 0 0<5 true
 * j = 1 1<5 true
 * j = 2 2<5 true
 * j = 3 3<5 true
 * j = 4 4<5 true
 * j = 5 5<5 false
 * 
 * 
 * i = 3 3<5 true
 * j = 0 0<5 true
 * j = 1 1<5 true
 * j = 2 2<5 true
 * j = 3 3<5 true
 * j = 4 4<5 true
 * j = 5 5<5 false
 * 
 * i = 4 4<5 true
 * j = 0 0<5 true
 * j = 1 1<5 true
 * j = 2 2<5 true
 * j = 3 3<5 true
 * j = 4 4<5 true
 * j = 5 5<5 false
 * 
 * i = 5 5<5 false
 * 
 * 
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * 
 * 
 * 
 */
