import java.io.PrintStream;

/*Sample for SRP
 * Adding two number 
 */
public class CalculatorSRP {
	public int getAdd(int x,int y)
	{
		return x+y;
	}

}
/*Getting the Stream to display*/
class PrintStreamDecider
{
	public static PrintStream getPrintStream()
	{
		return System.out;
	}
}

/*Displaying the values*/
class ResultPrinter
{
	public static void printResult(int value)
	{
		PrintStreamDecider.getPrintStream().print(value);
	}
}
