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

        LOG.info("!!!!!!!!!!!!!!!!!!!!!");
        LOG.info("Locking User: "
                + execution.getVariable("vorname")
                + " "
                + execution.getVariable("nachname")
                + " ...");
        LOG.info("!!!!!!!!!!!!!!!!!!!!!");

    }
}
