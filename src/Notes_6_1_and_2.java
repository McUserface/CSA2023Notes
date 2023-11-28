import java.util.Arrays;

public class Notes_6_1_and_2
{

    public static void main(String[] args) {
        // Creating an empty array that can hold 8 ints
        int x = 5;
        int[] nums = {1, 2, 3, 4};
        System.out.println(x);
        System.out.println(Arrays.toString(nums));
        dubs(x);
        dubs(nums);
        System.out.println(x);
        System.out.println(Arrays.toString(nums));
    }

    //doubles the value of an int
    public static void dubs(int num){
        num = num*2;
    }

    //doubles the elements of an array
    public static int[] dubs(int[] arr){
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = 2*arr[i];
        }

        return arr2;
}


}
