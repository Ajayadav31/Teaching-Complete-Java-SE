package arrays01;

/*
 * Arrays:- Array is a collection of similer kind of data store at contigeous memory location
 */
public class Main {
    public static void main(String[] args) {

        // first way
        int[] studentData = { 101, 102, 103, 104, 105 }; // static initi..

        // String students[] = { "Virat", "Hardik", "Rohit", "Shubman" };

        System.out.println(studentData[0] + " " + studentData[1] + " " + studentData[2] + " " + studentData[3] + " "
                + studentData[4]);

        // Second way
        int[] nums = new int[5]; // dynamic init...

        nums[0] = 78;
        nums[1] = 56;
        nums[4] = 76;
        nums[3] = 90;

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3] + " " + nums[4]);

        // int data[] = new int[100];
        // data[0] = 90;
        // .......
        // .......

    }
}
