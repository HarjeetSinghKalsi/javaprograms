package retry_concept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer
{

	int initialcount=0;
	int retrycount=2;
	@Override
	public boolean retry(ITestResult result)
	{
		if(initialcount<retrycount)
		{
			initialcount++; 
			return true;
			
		}
		
		return false;
	}

}
