package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;

@CucumberOptions(features="src/test/java/features/DeleteLeadFeatures.feature" ,glue="steps" ,monochrome=true,publish=true)
public class DeleteLeadRunner extends BaseClassCucumber{

}
