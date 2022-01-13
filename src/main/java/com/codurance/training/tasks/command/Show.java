package com.codurance.training.tasks.command;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.TaskList;
import com.codurance.training.tasks.objects.Project;
import com.codurance.training.tasks.objects.Task;

public class Show {
	
	/**
	 * commande show
	 */
    public Show() {
    	
    	//afficher tout les projets
        for ( Project projet : TaskList.projetsList) {
        	
        	TaskList.sayConsole(projet.getName(),true);//affiche le nom du projet
        	
        	//leurs taches
            for (Task task : projet.getTaskList()) {
            	
            	String chaine = "    ";
            	
            	if(task.isDone()) chaine += "[x]";
            	else chaine += "[ ]";
            	
            	
                chaine += " "+task.getId()+": "+task.getDescription();
                TaskList.sayConsole(chaine,true);//afficher toute les taches
                
            }
            TaskList.sayConsole("",true);
        }
       
    }
}
