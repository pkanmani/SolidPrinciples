/*Single Responsibility Principle:
 * Every class should have only one responsibility.
 */
/*The below class indicates threee responsibilty which violates the SRP
 * 1.For Adding two number
 * 2.Displaying the Result
 * 3.Choosing the outputstream
 */ 
public class Calculator {

	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
}
