package com.codurance.training.tasks.command;


import com.codurance.training.tasks.TaskList;
import com.codurance.training.tasks.objects.Project;
import com.codurance.training.tasks.objects.Task;


public class Add {
	
	/**
	 * Ajoute un projet ou une tâche
	 * 
	 * @param commandLine
	 */
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

    /**
     * ajouter un projet
     * 
     * @param nom du projet
     */
    private void addProject(String name) {
        TaskList.projetsList.add(new Project(name));
    }

    
    /**
     * Ajouter une tâche
     * 
     * @param nom du project concerné
     * @param description de la tâche
     */
    private void addTask(String project, String description) {
    	
    	int idProject = getProject(project);
        if (idProject == -1) {
            TaskList.sayConsole("Could not find a project with the name \""+project+"\".",false);
            
            return;
        }
        TaskList.projetsList.get(idProject).addTask(new Task(TaskList.lastIdTask,description,false));
        
        TaskList.lastIdTask++;
    }
    	
    	

/**
 * recupere l'indice du projet pour addTask
 * 
 * @param nom du projet
 * @return l'indice du projet
 */
	private int getProject(String projectName) {
	
	
		for(int i=0;i<TaskList.projetsList.size();i++) {
		
			if(TaskList.projetsList.get(i).getName().equals(projectName)) return i ;
		
		}
	
		return -1;
	
}
	    
	    


}
