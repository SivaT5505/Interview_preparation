//Find second lowest number in an array
public class SecondSmallest {
public static int getSecondSmallest(int arr[]) {
//Integer.MAX_VALUE is 2147483647
int smallest = Integer.MAX_VALUE;
int secondSmallest = Integer.MAX_VALUE;
//Traverse an array
for(int i = 0; i < arr.length; i++) {
if(arr[i] < smallest) { 
secondSmallest = smallest;
smallest = arr[i]; 
} 
if(arr[i] > smallest && arr[i] < secondSmallest ) {
secondSmallest = arr[i];
}
}
return secondSmallest;
}
public static void main(String[] args) {
int arr[] = {-1, 70, 10, 34, 18, 78};
//Method Call
int result = getSecondSmallest(arr);
System.out.println(" Second smallest number " + result);
}
}

//Output: Second smallest number 10