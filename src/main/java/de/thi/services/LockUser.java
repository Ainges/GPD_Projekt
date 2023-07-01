package de.thi.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* Hubertus Seitz
* */
public class LockUser implements JavaDelegate {

    private static final Logger LOG = LoggerFactory.getLogger(LockUser.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        // Routine to lock user
        // Is called when User does not react to membership fee change

        LOG.info("!!!!!!!!!!!!!!!!!!!!!");
        LOG.info("Locking User: "
                + execution.getVariable("vorname")
                + " "
                + execution.getVariable("nachname")
                + " ...");
        LOG.info("!!!!!!!!!!!!!!!!!!!!!");

    }
}
