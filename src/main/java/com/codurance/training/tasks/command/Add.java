package com.codurance.training.tasks.command;


import com.codurance.training.tasks.TaskList;
import com.codurance.training.tasks.objects.Project;
import com.codurance.training.tasks.objects.Task;


public class Add {
	
	
    public Add(String commandLine) {
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
        TaskList.projetsList.add(new Project(name));
    }

    
    
    private void addTask(String project, String description) {
    	
    	int idProject = getProject(project);
        if (idProject == -1) {
            TaskList.sayConsole("Could not find a project with the name \""+project+"\".",false);
            
            return;
        }
        TaskList.projetsList.get(idProject).addTask(new Task(TaskList.lastIdTask,description,false));
        
        TaskList.lastIdTask++;
    }
    	
    	


	private int getProject(String projectName) {
	
	
		for(int i=0;i<TaskList.projetsList.size();i++) {
		
			if(TaskList.projetsList.get(i).getName().equals(projectName)) return i ;
		
		}
	
		return -1;
	
}
	    
	    


}
