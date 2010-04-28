package se.mindspring.jaxrs.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import se.mindspring.jaxrs.model.Task;
import se.mindspring.jaxrs.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	private final List<Task> tasks;
	private int taskId = 1;

	public TaskServiceImpl() {
		tasks = new ArrayList<Task>(Arrays.asList(new Task(taskId++, new Date(), "Svamla om JAX-RS", Task.Status.NEW, "David D")));
	}

	@Override
	public Task addTask(String description, String assignee) {
		Task task = new Task(taskId++, new Date(), description, Task.Status.NEW, assignee);
		tasks.add(task);
		return task;
	}

	@Override
	public List<Task> getTasks() {
		return tasks;
	}
}
