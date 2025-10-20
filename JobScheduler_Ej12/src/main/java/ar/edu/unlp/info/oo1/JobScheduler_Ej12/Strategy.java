package ar.edu.unlp.info.oo1.JobScheduler_Ej12;
import java.util.List;

public interface Strategy {
	public JobDescription next(List<JobDescription> jobs);

}
