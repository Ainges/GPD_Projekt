package de.thi.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutputUser implements JavaDelegate {
    private static final Logger LOG = LoggerFactory.getLogger(OutputUser.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        User user = (User) execution.getVariable("user");

        Integer loopCounter = (Integer) execution.getVariable("loopCounter");

        LOG.info("######################");
        LOG.info("Trying to output user of instance " + loopCounter);

        LOG.info("Vorame: " + user.getVorname());
        LOG.info("Nachname: " + user.getNachname());
        LOG.info("Alter: " + user.getAlter());
        LOG.info("Mitgliedschaft: " + user.getMitgliedschaft());
        LOG.info("Mitgliedschaftsdauer: " + user.getMitgliedschaftsdauer());
        LOG.info("Art der Aktivität: " + user.getArtDerAktivitaet());
        LOG.info("Ehrenmitglied: " + user.isEhrenmitglied());

        LOG.info("######################");

    }
}
