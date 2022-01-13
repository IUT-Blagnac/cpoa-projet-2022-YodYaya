package com.codurance.training.tasks.objects;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 *  class objet d un projet
 */
public final class Project {
	
	private final String name;              //nom du projet
	private final ArrayList<Task> tasks;	//liste des tâches attribuees
	
	
	/**
	 * initialise un nouveau projet
	 * 
	 * @param nom du projet
	 */
    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<Task>();
    }
    
    /**
     * recuperer le nom du projet
     * 
     * @return le nom
     */
    public String getName() {
        return name;
    }

    /**
     * recuperer la tache
     * 
     * @param identifiant de la tache
     * @return la tache
     */
    public Task getTask(long idTask) {
        return this.tasks.get((int) idTask);
    }
    
    /**
     * recuperer la liste des taches
     * 
     * @return la liste
     */
    public ArrayList<Task> getTaskList() {
        return this.tasks;
    }

    /**
     * ajouter une nouvelle tache
     * 
     * @param la nouvelle tache
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }
    
    
    


}
    
	
