package se.mindspring.jaxrs.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import se.mindspring.jaxrs.model.Task;
import se.mindspring.jaxrs.service.TaskService;

import com.sun.jersey.spi.inject.Inject;

/**
 * This is the class handling the Rest calls.
 * 
 * @author david
 */
@Path("/task")
@Produces(MediaType.APPLICATION_JSON)
public class TaskResource {
	@Inject
	private TaskService taskService;

	@GET
	@Path("list")
	public List<Task> getTasks() {
		List<Task> tasks = taskService.getTasks();

		return tasks;
	}

	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@POST
	public Task addTask(@FormParam("description") String description, @FormParam("assignee") String assignee) {
		return taskService.addTask(description, assignee);
	}

	@Path("/completed/{taskId}")
	@POST
	public void setCompleted(@PathParam("taskId") int taskId) {

	}

	@Path("/assign/{taskId}/{assignee}")
	@POST
	public void setAssignee(@PathParam("taskId") int taskId, @PathParam("assignee") String assignee) {

	}

	@Path("/description/{taskId}/{description}")
	@POST
	public void setDescription(@PathParam("taskId") int taskId, @PathParam("description") String description) {
		System.out.println("setDescription(" + taskId + ", " + description + ") called!");
	}
}
