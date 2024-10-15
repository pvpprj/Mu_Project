package BDD.MyRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/BDD/Feature/Login.feature" ,
        glue = "src/test/java/BDD/Step"
       )
public class TestRunner {



}
