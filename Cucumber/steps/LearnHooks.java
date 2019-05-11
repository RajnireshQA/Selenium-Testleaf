package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks {
	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println("@Before started");
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());

	}
	@After
	public void afterScenario(Scenario sc) {
		System.out.println("@After started");
		System.out.println(sc.getStatus());
	}

}
