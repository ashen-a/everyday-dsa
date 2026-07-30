public class ArraysIntro {
    public static void main(String[] args) {
        // Q: store a roll number 
        int a = 19;

        // Q: store 5 roll number's
        int rno1 = 23;
        int rno2 = 88;
        int rno3 = 66;
        int rno4 = 31;
        int rno5 = 21;

        // using ARRAYS

        int[] rnos = new int[5]; // the ref variable rnos is pointing to an array object that contains int type elements
        // Or directly
        int[] rnos2 = {23,34,45,56,76};  

        int[] ros; // declaration of array. ros is getting defined in the stack (COMPILE TIME)
        ros = new int[5]; // initialisation; actually here object is being created in the heap memory (RUN TIME) - DYNAMIC MEMORY ALLOCATION
        System.out.println(ros[1]); // [0, 0, 0, 0, 0] - An array by defualt
        
        // Array objects are in heap
        // Heap objects are not continous (Continous as in continous blocks of memory like in C/C++)
        // Dynamic Memory Allocation - Assigning memory at RUNTIME
        // Hence array objects may not be continous
        // new is used to create an object
        
        
        
        String[] arr = new String[5]; // This array is a collection of reference variables which point to objects stored in different parts of the memory
                                      // and the value of each reference variable is null 
        System.out.println(arr[0]);   // null - a special literal ( by default value of reference variables)

        String str =  null; // can be assigned to non-primitives only
        // int num = null;     can't be assigned to primitives
    
    
    
    }

}
