
public class largestPalindromeProduct {
	public static void main(String[] args) 
	{
			int largestPalindrome = 0;
		    int firstFactor = 0;
		    int secondFactor = 0;

		    // Loop through all pairs of 3-digit numbers
		    for (int i = 999; i >= 100; i--) 
		    {
		        for (int j = i; j >= 100; j--) 
		        {
		            int product = i * j;
		            String str = "" + product;
		            int len = str.length();
		            Boolean isPalindrome = false;
		            for (int k = 0; k < len / 2; k++) 
		            {
		                if (str.charAt(k) != str.charAt(len - k - 1)) 
		                {
		                    isPalindrome = false;
		                    break;
		                }
		                isPalindrome = true;
		            }		            
		                
		            if (isPalindrome && product > largestPalindrome) 
		            {
		                largestPalindrome = product;
		                firstFactor = i;
		                secondFactor = j;
		            }
		        }		
		}
		System.out.printf("Largest number made from the product of two 3-digit numbers is %d = %d x %d", largestPalindrome, firstFactor, secondFactor);
	}
}
