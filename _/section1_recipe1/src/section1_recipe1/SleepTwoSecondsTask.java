package section1_recipe1;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SleepTwoSecondsTask implements Callable<String> {
	
	public String call() throws Exception{
		TimeUnit.SECONDS.sleep(2);
		return new Date().toString();
	}
}
