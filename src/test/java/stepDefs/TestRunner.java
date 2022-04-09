package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin = {"html:target/html-cucmber","json:target/cucumber.json"},
		
		features ="src/test/java/features",
		tags = {"@F_Login"},
		//tags = {"@Negative"},
		//tags = {"@Sanity"}, //run single tag
		//tags = {"@Sanity or @Regression"}, //to run multiple tags (can use "," or "or"
		///tags = {"@Regression and @Rapid"}, // and condition 
		//tags = {"@Regression", "@Rapid"}, // another way of writing and condition
		//tags = {"@Sanity or (@Regression and @Rapid)"}, //to run rapid for sanity as well
		//tags = {"not @Sanity"}, // can use "~" as well instead of "not"
		glue = {"stepDefs"} //should point to package
		)

public class TestRunner {

}
