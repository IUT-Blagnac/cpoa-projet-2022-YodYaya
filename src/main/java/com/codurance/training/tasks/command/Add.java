package com.codurance.training.tasks.command;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.Task;

public class Add {
	
	private final Map<String, List<Task>> tasks = new LinkedHashMap<>();
	 private final PrintWriter out = null;
	 private long lastId = 0;
	 
	   @SuppressWarnings("unused")
	private void add(String commandLine) {
	        String[] subcommandRest = commandLine.split(" ", 2);
	        String subcommand = subcommandRest[0];
	        if (subcommand.equals("project")) {
	            addProject(subcommandRest[1]);
	        } else if (subcommand.equals("task")) {
	            String[] projectTask = subcommandRest[1].split(" ", 2);
	            addTask(projectTask[0], projectTask[1]);
	        }
	    }
	   

	    private void addProject(String name) {
	        tasks.put(name, new ArrayList<Task>());
	    }
	    
	   

	    private void addTask(String project, String description) {
	        List<Task> projectTasks = tasks.get(project);
	        if (projectTasks == null) {
	            out.printf("Could not find a project with the name \"%s\".", project);
	            out.println();
	            return;
	        }
	        projectTasks.add(new Task(nextId(), description, false));
	    }
	    
	    
	    private long nextId() {
	        return ++lastId;
	    }

}

