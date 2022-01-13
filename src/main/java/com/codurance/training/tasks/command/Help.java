package com.codurance.training.tasks.command;

import com.codurance.training.tasks.TaskList;

public class Help  {

	
	public Help() {
		
	String chaine ="";	
		
	chaine += ""; 
		
	chaine += "Commands:";
	chaine += "  show";
	chaine += "  add project <project name>";
	chaine += "  add task <project name> <task description>";
	chaine += "  check <task ID>";
	chaine += "  uncheck <task ID>";
    
	TaskList.sayConsole(chaine,true);
    }
	
	
}
