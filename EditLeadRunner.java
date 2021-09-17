package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;

@CucumberOptions(features="src/test/java/features/EditLeadFeatures.feature" ,glue="steps" ,monochrome=true,publish=true)
public class EditLeadRunner extends BaseClassCucumber{

}
