package package1;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram2 {

	@Test
	public void anagram() {
		
		String str1 = "mariy";
		String str2 = "army";
		
		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		Assert.assertEquals(arr1, arr2, "Both strings are not equal");
		
//		if(Arrays.equals(arr1, arr2)) {
//			
//			System.out.println("String is Anagram");
//			
//		}
//		else {
//			System.out.println("String is not Anagram");
//		}

	}

}
