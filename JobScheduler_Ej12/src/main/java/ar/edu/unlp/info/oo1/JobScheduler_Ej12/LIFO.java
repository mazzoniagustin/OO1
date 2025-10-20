package ar.edu.unlp.info.oo1.JobScheduler_Ej12;
import java.util.List;

public class LIFO implements Strategy{
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (jobs != null) {
	        nextJob = jobs.get(jobs.size()-1);
		}
		return nextJob;
	}
}
