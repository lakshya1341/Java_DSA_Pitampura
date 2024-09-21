package Week5.Day2;

public class StringPractice {


    ////////////////////function to reverse a string////////////////////
//     public static void main(String[] args) {
//         String original = "Potato";
//         String reversed = reverseString(original);
//         System.out.println(reversed);  // Output: otatoP
//     }

//     public static String reverseString(String s) {
//         StringBuilder reversed = new StringBuilder(s);
//         return reversed.reverse().toString();
//     }


////////////////////Check Pallindrome////////////////////
// static boolean check(String s1) {
//     int i=0;
//     int j=s1.length()-1;
//     while(i<=j){
//         if(s1.charAt(i)!=s1.charAt(j)){
//             return false;
//         }
//         i++;
//         j--;
//     }
//     return true;
// }
// public static void main(String[] args) {
//     String s1="detartrated";
//     System.out.println(check(s1));
//     }


////////////////////Maximum occuring element in string(Sorted)////////////////////
// static char findMaxOcc1(String s){
//     int countMaxElement=0;
//     char maxElement= '*';
//     int countCurrEleme= 0;
//     char currElement= '*';
//     for(int i=0;i<s.length()-1;i++){
//         if(s.charAt(i)!=currElement){
//             if(countCurrEleme>countMaxElement){
//                 countMaxElement=countCurrEleme;
//                 maxElement=currElement;
//             }
//             currElement=s.charAt(i);
//             countCurrEleme=1;
//         }
//         else{
//             countCurrEleme++;
//         }
//     }
//         if(countCurrEleme>countMaxElement){
//             countMaxElement=countCurrEleme;
//             maxElement=currElement;
//         }
//     return maxElement;
// }
// public static void main(String[] args) {
//     String s2="aabbbbbbccccccccdd";
//     System.out.println(findMaxOcc1(s2));
// }


////////////////////Maximum occuring element in string(Unsorted)////////////////////
// static char findMaxOcc2(String s){
//     int[] arr= new int[26];
//     for(int i=0;i<s.length();i++){
//         arr[s.charAt(i)-'a']++;
//     }
//     int index=0;
//     int maxOcc=0;
//     for(int i=0;i<arr.length;i++){
//         if(arr[index]<arr[i]){
//             index=i;
//         }
//     }
//     return (char)('a'+index);
// }
// public static void main(String[] args) {
//     String s1="aabbbbbbbccccccccddaaaaaaaaaa";
//     System.out.println(findMaxOcc2(s1));
// }


////////////////////Reverse the words of a string////////////////////
static void reverse(String s){
    String []arr=s.split("\\s");
    System.out.print("!");
    String temp="";
    for(int i=arr.length-1;i>=0;i--){
        // System.out.print(arr[i]+" ");
        temp+=arr[i]+" ";
    }
    temp=temp.trim();
    System.out.print(temp);
    System.out.print("!");
}
public static void main(String[] args) {
    String s="the bird is flying";
    reverse(s);
}
}