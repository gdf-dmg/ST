import org.junit.Assert;
import org.junit.Test;

public class MyLang2Test {
	
	@Test
	public void test_removeElement()
	{
		MyLangEx list = new MyLangEx();
		int[] arr = {1,2,3};
		list.location = 0;
		list.removed = new int[] {2,3};
		arr = list.removeElement(arr, 1);
		Assert.assertEquals(3,arr.length);
		Assert.assertEquals(1,arr[0]);
	}
	
}
