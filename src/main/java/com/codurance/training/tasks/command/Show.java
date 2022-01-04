package com.codurance.training.tasks.command;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.Task;

public class Show {
	
	 private final Map<String, List<Task>> tasks = new LinkedHashMap<>();
	 private final PrintWriter out = null;
	 
	@SuppressWarnings("unused")
	private void show() {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            out.println(project.getKey());
            for (Task task : project.getValue()) {
                out.printf("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            out.println();
        }
    }

}
