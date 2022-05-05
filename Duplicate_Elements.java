//Print Duplicate Elements in Array
import java.util.*;
public class Duplicate_Elements {
 public static void main(String[] args) {
  int arr[] = {1,2,3,4,5,6,2,3,5};
  Set<Integer> s = new HashSet<Integer>();
  List<Integer> x = new ArrayList<>();
  for(Integer y:arr){
   if(!s.add(y)){
    x.add(y);
   }
  }
  System.out.println(x);  //[2, 3, 5]
 }
}