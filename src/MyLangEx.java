import java.util.Arrays;
public class MyLangEx extends MyLang {
	
	int location;
	int[] removed=null;
	public int indexOf(final int[] array, final int valueToFind)
	{
		int e = valueToFind;
		int l = location;
		int i;
		for(i=0;i<array.length;i++)
		{
			if(array[i]==e)	
			break;
		}
		if(i==l)
		{
			System.out.println("removeElement方法内部获取删除的元素位置正确！");
			return i;
		}
		else
		{
			System.out.println("removeElement方法内部获取删除的元素位置错误！");
			return -1;
		}
		
	}
	
	public int[] remove(final int[] array, final int loc) 
	{
        int l=loc;
		int[] a = new int[array.length-1];
		int i,j=0;
		for(i=0;i<array.length;i++)
		{
			if(i==l)
			{
				continue;
			}
			else
			{
				a[j]=array[i];
				j++;
			}
		}
		if(Arrays.equals(a,removed))
		{
			System.out.println("removeElement方法内部删除元素成功！");
		}
		else
		{
			System.out.println("removeElement方法内部删除元素失败！");
		}
		return array;
		
	}

}
