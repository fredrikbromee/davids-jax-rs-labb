package se.mindspring.jaxrs.service;

import java.util.List;

import se.mindspring.jaxrs.model.Task;

/**
 * Keep track of tasks.
 * 
 * @author david
 * 
 */
public interface TaskService {
	List<Task> getTasks();

	Task addTask(String description, String assignee);
}
