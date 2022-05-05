//Reverse array without using extra space - Java Code
public class ReverseArray {
public static void reverse(int[] arr) {
//Declare two variables start and end
int start = 0;
int end = arr.length - 1;
//Run a loop while start is less than end
while(start < end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
}
public static void main(String[] args) {
int[] arr = {1, 7, 8, 9};
reverse(arr);
System.out.println("After reversing an array ");
for(int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}
}
}

/* After reversing an array 
   9 8 7 1 
   */