package com.codurance.training.tasks.objects;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Project {
	
	private final String name;
	private final ArrayList<Task> tasks;
	private long NbTaskAdded;
	
	
	
    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<Task>();
        this.NbTaskAdded = 0;
    }
    
    
    public String getName() {
        return name;
    }


    public Task getTask(long idTask) {
        return this.tasks.get((int) idTask);
    }
    
    public ArrayList<Task> getTaskList() {
        return this.tasks;
    }


    public void addTask(Task task) {
        this.tasks.add(task);
        this.NbTaskAdded++;
    }
    
    public long getNbTaskAdded() {
    	return this.NbTaskAdded;
    }
    
    
    


}
    
	
