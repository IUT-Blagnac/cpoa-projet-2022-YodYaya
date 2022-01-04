package com.codurance.training.tasks.command;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.objects.Task;

public class Help {
	
	private final Map<String, List<Task>> tasks = new LinkedHashMap<>();
	 private final PrintWriter out = null;
	
	 @SuppressWarnings("unused")
	private void help() {
	        out.println("Commands:");
	        out.println("  show");
	        out.println("  add project <project name>");
	        out.println("  add task <project name> <task description>");
	        out.println("  check <task ID>");
	        out.println("  uncheck <task ID>");
	        out.println();
	    }


}

