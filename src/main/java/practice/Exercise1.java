package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Exercise1 {


    public static void main(String[] args) {
        int [] nums = {5,11,3,6,0,8,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }


    public static int[] sortArray(int [] num1){
        for (int i = 0; i < num1.length; i++){
            for (int j = 0; j < num1.length; j++){
                if (num1[i] < num1[j]){
                    int temp = num1[i];
                    num1[i] =num1[j];
                    num1[j]=temp;
                }
            }
        }
        return num1;
    }

    @Test
    public void sortedArrayTest(){
        int [] arr = {6,25,74,22,-6,-3};
        sortArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                Assert.fail();
            }else {
                Assert.assertTrue(true);
            }
        }
    }

    @Test
    public void sortedArrayTest1(){

        int [] input = {12,2,3,-4,8};
        int [] expected = {-4,3,2,12,8};
        Assert.assertEquals(sortArray(input),sortArray(expected));

    }


}
