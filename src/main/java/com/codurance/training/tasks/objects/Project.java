package com.codurance.training.tasks.objects;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Project {
	
	private final String name;
	private final ArrayList<Task> tasks;
	
	
	
	
    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<Task>();
    }
    
    
    public String getName() {
        return name;
    }


    public Task getTask(long idTask) {
        return this.tasks.get((int) idTask);
    }

/*
    public List<Task> getTasksDueFor(LocalDate date) {
        List<Task> tasksDue = new ArrayList<>();
        for (Task task : this.tasks.values()) {
            if (date.equals(task.getDeadline())) {
                tasksDue.add(task);
            }
        }
        return tasksDue;
    }*/

/*
    public List<Task> getTasksWithDeadline() {
        List<Task> tasksWithDeadline = new ArrayList<>();
        for (Task task : this.tasks.values()) {
            if (task.getDeadline() != null) {
                tasksWithDeadline.add(task);
            }
        }
        return tasksWithDeadline;
    }
*/

    public void addTask(Task task) {
        this.tasks.add(task);
    }
    


}
    
	

