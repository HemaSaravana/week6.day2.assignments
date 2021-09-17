package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;
@CucumberOptions(features="src/test/java/features" 
                 ,glue="steps" 
                 ,monochrome=true
                 ,publish=true
                 ,tags="@functional")
public class CucumberRunner extends BaseClassCucumber{

}
