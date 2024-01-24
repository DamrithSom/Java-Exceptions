import java.util.*;
public class Try_and_Catch {
	//public int number;
	 int numBer()
		{
			try
				{
				int[] myNumbers = {1, 2, 3};
				return myNumbers[10];
				}
			catch (IllegalArgumentException e)
			{
				System.out.println("Exceptions : "+e.getMessage());
				return -1;
			}
		}
}
