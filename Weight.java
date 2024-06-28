public class Weight
{
 public static void main(String args[])
 {
 String n = "3214";
 char[] arr = n.toCharArray();
 int pt = arr.length;
 double p,t=0;
 for(int i=0;i<arr.length;i++)
 {
     p = Math.pow(10,pt);
 boolean flag = Character.isDigit(arr[i]);
 if(flag)
 {
 int r = arr[i] - '0';
  t = t + (r*p);
  pt = pt-1;
 }
 
}
System.out.println(t);
}
}