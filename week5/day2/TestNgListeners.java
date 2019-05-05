package week5.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNgListeners  implements IRetryAnalyzer, IAnnotationTransformer{

	int count = 1;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, 
			Constructor testConstructor, Method testMethod) {
		System.out.println(testMethod.getName());
		if (testMethod.getName().equals("runCreateLead")) {
			annotation.setRetryAnalyzer(this.getClass());  
		}
	}

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && count<2) {
			count++;
			return true;
		}
		return false;
	}
}
