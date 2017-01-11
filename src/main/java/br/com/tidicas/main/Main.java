package br.com.tidicas.main;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Classe responsável por disparar o job de teste do SpringBatch
 * 
 * @author Evaldo Junior
 *
 */
public class Main {
	public static void main(String[] args) {

		String[] springConfig  = 
			{	
				"spring/batch/jobs/batchContext.xml" 
			};
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("testJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Status: " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}
		context.close();
		System.out.println("Terminado.");
		
	}
}
