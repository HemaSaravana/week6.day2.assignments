package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;

@CucumberOptions(features="src/test/java/features" 
                          ,glue="steps"
                          ,monochrome=true
                          ,publish=true
                          ,tags="@sanity")
public class DuplicateLeadRunner extends BaseClassCucumber{

}
