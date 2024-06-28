import java.util.*;
class LengthStr
{
public void split(String a)
{
int i;
int c=1;
String h=" ";
int m=0;int d=1;
int l=a.length();
for(i=0;i<l;i++)
{
char ch=a.charAt(i);
if(ch==' ')
{
c=c+1;
}
if(ch=='.')
{
System.out.println("Sentences are:"+a.substring(m,i+1)+" " +c);
if(d<c)
{
d=c;
h=a.substring(m,i);
}
c=1;
m=i+1;
}
}
System.out.println("Longest word is:"+ h + " Word Count is:"+d);
}
public static void main(String args[])
{
LengthStr obj=new LengthStr();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Paragraph");
String j=sc.nextLine();
obj.split(j);
}
}