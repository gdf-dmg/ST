import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class LangTest {
	
	@Test
	public void test_addall()
	{
		String a1[] = {"1", "2", "3"};
		String a2[] = {"a", "b", "c"};
		String a3[] = (String[])MyLang.addAll(a1, a2);
		for (String s : a3) {
			System.out.println(s);
		}
		int b1[] = {1,2};int b2[] = {3,4};
		int b3[] = MyLang.addAll(b1,b2);
		int b4[] = {1,2,3,4};
		Assert.assertArrayEquals(b3,b4);
		boolean c1[] = {true};boolean c2[] = {false};
		boolean c3[] = MyLang.addAll(c1,c2);
		boolean c4[] = {true,false};
		Assert.assertArrayEquals(c3,c4);
		double d1[] = {1,2};double d2[] = {3,4};
		double d3[] = MyLang.addAll(d1,d2);
		double d4[] = {1,2,3,4};
		Assert.assertTrue("pass!",Arrays.equals(d3,d4));
		char e1[] = {'1'};char e2[] = {'2'};
		char e3[] = MyLang.addAll(e1,e2);
		char e4[] = {'1','2'};
		Assert.assertArrayEquals(e3,e4);
		long f1[] = {1,2};long f2[] = {3,4};
		long f3[] = MyLang.addAll(f1,f2);
		long f4[] = {1,2,3,4};
		Assert.assertArrayEquals(f3,f4);
		
	}
	
	@Test
	public void test_add()
	{
		boolean a1[] = {true,false};
		int a2[] = {1,2,3};
		double a3[] = {123,234,345};
		char a4[] = {'a','b','c'};
		float a5[] = {1,2,3};
		long a6[] = {12,13,14};
		a1 = MyLang.add(a1,true);
		a2 = MyLang.add(a2,4);
		a3 = MyLang.add(a3,456);
		a4 = MyLang.add(a4,'d');
		a5 = MyLang.add(a5,4);
		a6 = MyLang.add(a6,15);
		boolean b1[] = {true,false,true};
		int b2[] = {1,2,3,4};
		double b3[] = {123,234,345,456};
		char b4[] = {'a','b','c','d'};
		float b5[] = {1,2,3,4};
		long b6[] = {12,13,14,15};
		Assert.assertArrayEquals(a1,b1);
		Assert.assertArrayEquals(a2,b2);
		Assert.assertTrue("pass!",Arrays.equals(a3,b3));
		Assert.assertArrayEquals(a4,b4);
		Assert.assertTrue("pass!",Arrays.equals(a5,b5));
		Assert.assertArrayEquals(a6,b6);
	}
	
	@Test
	public void test_contains()
	{
		boolean b1;
		boolean a1[] = {true,false};
		int a2[] = {1,2,3};
		double a3[] = {123,234,345};
		char a4[] = {'a','b','c'};
		float a5[] = {1,2,3};
		long a6[] = {12,13,14};
		b1 = MyLang.contains(a1,true);
		Assert.assertEquals(true,b1);
		b1 = MyLang.contains(a2,0);
		Assert.assertEquals(false,b1);
		b1 = MyLang.contains(a3,234);
		Assert.assertEquals(true,b1);
		b1 = MyLang.contains(a4,'d');
		Assert.assertEquals(false,b1);
		b1 = MyLang.contains(a5,1);
		Assert.assertEquals(true,b1);
		b1 = MyLang.contains(a6,15);
		Assert.assertEquals(false,b1);
	}

}

