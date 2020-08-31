package org.onedatashare.transferservice.odstransferservice.service.listner;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class JobCompletionListener extends JobExecutionListenerSupport {

    @Override
    public void beforeJob(JobExecution jobExecution){
        System.out.println("BEFOR JOB-----------"+jobExecution.getJobParameters());

    }
    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("After JOB-----------");
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            System.out.println("BATCH JOB COMPLETED SUCCESSFULLY");
        }
    }


}