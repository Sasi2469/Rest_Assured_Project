package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                 glue="org.stepdefinition",
                 dryRun=false ,
                 plugin= {"pretty",
                		 "html:src\\test\\resources\\reports\\HtmlReport",
                         "json:src\\test\\resources\\reports\\JsonReport\\report.json",
                         "junit:src\\test\\resources\\reports\\JunitReport\\junitreport.xml"}
            //   ,tags="@deleteissue,@getissue"
            	   )
public class TestRunner {

}
