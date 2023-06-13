package es.sanitas.gitleaks.demo.application.scheduled;

import org.springframework.stereotype.Component;

import es.sanitas.arquitectura.bravocloud.autoconfigure.scheduled.BravoCloudScheduled;

/**
 * 
 * Class called when the scheduler is running.
 * 
 * @author Sanitas
 *
 */
@Component
public class RunScheduler implements BravoCloudScheduled {

    /**
     * 
     * Method called by scheduler.
     * 
     */
    @Override
    public void run() {
      //Run a job

    }

}
