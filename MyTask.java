public class MyTask
{
	String myFirst(String s,char f,char new)
	{
                int i;
		char[] arr= data.toCharArray();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==f)
			{
				arr[i]=new;
				break;
			}
		}
		String res=new String(arr);
		return  res;
	}
	String myLast(String s,char l,char new)
	{
                int i;
		char[] arr= data.toCharArray();
		for(i=arr.length-1;i>=0;i--)
		{
			if(ar[i]==l)
			{
				arr[i]=new;
				break;
			}
		}
		String res=new String(arr);
		return  res;
	}
public static void main(String[] args) 
{
	String str="HELLO";
	MyTask m=new MyTask();
	String str1= m.myFirst(str, 'L', 'Y');
	String str2= m.myLast(str, 'L', 'Y');
	System.out.println(str1);
	System.out.println(str2);
}
}