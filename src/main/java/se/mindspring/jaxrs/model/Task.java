package se.mindspring.jaxrs.model;

import java.util.Date;

/**
 * A Task represent an activity or action that a member of Mindspring is responsible for performing.
 * 
 * It starts off as NEW and may transition to IN_PROGRESS, COMPLETED or never leave the state NEW.
 * 
 * @author david
 */
public class Task {
	public enum Status {
		NEW, IN_PROGRESS, COMPLETED
	};

	private final Date created;
	private final String description;
	private final Status status;
	private final String assignee;
	private final int id;

	public Task(int id, Date created, String description, Status status, String assignee) {
		this.id = id;
		this.created = created;
		this.description = description;
		this.status = status;
		this.assignee = assignee;
	}

	public Date getCreated() {
		return created;
	}

	public String getDescription() {
		return description;
	}

	public Status getStatus() {
		return status;
	}

	public String getAssignee() {
		return assignee;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", created=" + created + ", description=" + description + ", assignee=" + assignee + ", status=" + status + "]";
	}
}
