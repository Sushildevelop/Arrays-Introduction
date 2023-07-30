package Practice.Array;

public class Array_intro {
    public static void main(String[] args) {
        // Array is a data structure to store a group or
        // collection of (homogenous data) items, sequentially, inside memory.

    // The indexing of an array is 0-based i.e.the first element is at index 0.
        //  Memory allocation in arrays is contiguous i.e. elements are stored one after another.
        // It can be single-dimensional or multi-dimensional based on the utility and application.

//              Array Declaration and Creation

 /*       int intArray[];
        int [] intArr;
        byte byteArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[];

  */


//        Array initialization

     //   int [] intArray=new int[20];

//        Array Literal
       //   int [] intArr={1,2,3,4,5,6,7,8,9};



 /*       String colours[] ={"Red","Green","Blue","Yellow","Purple"};
//        for (int i=0;i<5;i++){
//            System.out.print(" "+colours[i]);
//         }
        for (String colour:colours){
            System.out.print(colour+" ");
        }
        System.out.println(colours[0]);
        System.out.println(colours[1]);
        System.out.println(colours[2]);
        System.out.println(colours[3]);

  */

  //      Multi-dimensional Array:

//        A multidimensional array is simply an array that consists of two or more dimennsion

  /*      int [][] items={
                {2,3},
                {5,6},
                {7,8}
        };
        System.out.println(items[0][0]);
        System.out.println(items[0][1]);

        System.out.println(items[1][0]);
        System.out.println(items[1][1]);

        System.out.println(items[2][0]);
        System.out.println(items[2][1]);

   */

        /// For each
        // Limitation is that it can only be used for traversing the whole array and not part of the array

    /*    int []a ={1,2,3,5,5,6,7};
        for (int i:a){
            System.out.print(i+" ");
        }

     */

        // Problems
//        sum of number  arr[]={1,5,3};
 /*       int arr[]={1,5,3};
        int sum=0;
  /*     for (int ar:arr){
            sum = sum+ar;
        }


        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

  */

        // Maximum value out of all the elements in the array
 /*       int arr[]={1,5,3,9};
        int max=arr[0];



        // for each loop
    /*    for (int ar:arr) {
            if (ar > max) {
                max = ar;
            }
        }
         System.out.println(max);



//        for loop

 /*
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println(max);

  */

     // given element x is present in the array or not and find the index.

        int arr[]={1,5,3};
        int x=5;
        int index=-1;
        for (int i=0;i<arr.length;i++){
          if (arr[i]==x){
              index=i;
          }
        }
        System.out.println(index);















    }
}
