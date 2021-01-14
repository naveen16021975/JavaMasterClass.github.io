package learn.l2;

import java.util.Arrays;

/**
 * L2 Assignment Solution
 * 
 * @author Manoj Tyagi
 */
public class ArrayAssignment {

    /**
     * L2A1
     */
    private int[] moveZeros(int [] arr) {
        if(arr==null || arr.length<2) return arr;
        int slow =0;
        int fast =0;
        while(fast < arr.length){
            if(arr[fast] == 0){
                fast++;
                continue;
            }
            arr[slow] = arr[fast];
            slow++;
            fast++;
        }
        while(slow < arr.length){
            arr[slow++] = 0;
        }
        return arr;
    }

    /**
     * L2A1 - Second way
     */
    private int[] moveZerosWithCopy(int [] arr) {

        if(arr==null || arr.length<2) return arr;
        int[] arr2 = new int[arr.length];
        
        int cnt=0;
        for(int i:arr) {
            if(i!=0) {
                arr2[cnt]=i;
                cnt++;
            }
        }
        for(int i=cnt;i<arr.length;i++) {
            arr2[i]=0;
        }

        return arr2;
    }

    /**
     * L2A2
     * @param values
     * @return
     */
    private int[] sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    private void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * L2A3
     * @param Type {'random': random numbers in range 0 to value, 'fill': fill with value, 'sort': assending if value is positive else decending}
     * @return int[] of specified type
     */
    private int[] generate(int size, int value, String type) {
        int[] arr = new int[size];
        if(type.equalsIgnoreCase("random")) {            
            Arrays.setAll(arr, e -> (int) (Math.random() * value));
        } else if(type.equalsIgnoreCase("fill")) {
            Arrays.fill(arr, value);
        } else if(type.equalsIgnoreCase("sort")) {

        } 
        return arr;
    }

    public static void main(String[] args) {

        ArrayAssignment maz  = new ArrayAssignment();
        int arr[] = {0,0,1,2,0,5,6,7,0};
        maz.moveZeros(arr);
        System.out.println(Arrays.toString(arr));  
        int arr2[] = {0,0,1,2,0,5,6,7,0};
        int arr3[] = {0,0,1,2,0,5,6,7,0,8,0,9,0};
        int arrR[] = maz.moveZerosWithCopy(arr2);
        int arrR3[] = maz.moveZerosWithCopy(arr3);
        System.out.println(Arrays.toString(arrR));  
        System.out.println(Arrays.toString(arrR3)); 
        System.out.println();
        testArraySort();          
        testArrayFill();     
    }

    private static void testArraySort() {
        int[] rval = new int[10];
        Arrays.setAll(rval, e -> (int) (Math.random() * 10000));
        printArray(rval);
        Arrays.sort(rval);
        printArray(rval); 

        System.out.println("Sorting through our sort method");
        ArrayAssignment maz  = new ArrayAssignment();

        int[] rval1 = new int[10];
        Arrays.setAll(rval1, e -> (int) (Math.random() * 1000));
        printArray(rval1);
        maz.sort(rval1);
        printArray(rval1); 
    }   

    private static void testArrayFill() {
        System.out.println("Testing ArrayFill");
        ArrayAssignment maz  = new ArrayAssignment();
        int arr[] = maz.generate(10, 100, "random");
        printArray(arr); 
        arr = maz.generate(10, 50, "fill");
        printArray(arr); 
    }

    private static void printArray(int[] array) {
        System.out.printf("%s%n", Arrays.toString(array));
    }
    
}
