package com.codurance.training.tasks.command;

import com.codurance.training.tasks.TaskList;
import com.codurance.training.tasks.objects.Project;
import com.codurance.training.tasks.objects.Task;

public class Check {


	public Check(String idString) {
		
        
		for(Project projet : TaskList.projetsList) {
			
			for (Task task : projet.getTaskList()) {
				
				if(task.getId() == Integer.parseInt(idString)) {
					task.setDone(true);
					return;
					
				}
				
			}
		}
		
		
		TaskList.sayConsole("Could not find a task with an ID of \""+idString+"\".",true);
		
		
		
    }
	
	
	
	
}
