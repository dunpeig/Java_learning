public class Example23 {
public static void main(String[] args){
int[] arr = {4,1,6,3,9,8};
int max = arr[0];
for (int i = 1; i < arr.length;i++){
    if (arr[i] > max) {
        max = arr[i];
    }
}
System.out.println("max of arr is " + max);
}
}
