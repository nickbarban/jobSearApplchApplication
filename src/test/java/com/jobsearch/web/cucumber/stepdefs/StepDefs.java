package com.jobsearch.web.cucumber.stepdefs;

import com.jobsearch.web.JobSearApplchApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JobSearApplchApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
