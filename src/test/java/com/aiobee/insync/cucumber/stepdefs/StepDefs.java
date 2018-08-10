package com.aiobee.insync.cucumber.stepdefs;

import com.aiobee.insync.InsyncApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InsyncApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
