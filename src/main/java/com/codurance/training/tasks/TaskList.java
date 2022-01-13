package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.codurance.training.tasks.command.Add;
import com.codurance.training.tasks.command.Check;
import com.codurance.training.tasks.command.Help;
import com.codurance.training.tasks.command.Show;
import com.codurance.training.tasks.command.Uncheck;
import com.codurance.training.tasks.objects.Project;

public class TaskList implements Runnable {
	
	
    public static ArrayList<Project> projetsList = new ArrayList<Project>();
    public static long lastIdTask = 1 ;
    private static BufferedReader in ;
    private static PrintWriter out ;
	
	
	
	
	
	public TaskList(BufferedReader in,PrintWriter out) {
	
		this.in = in;
		this.out = out;
		
	}
	
	public void run() {
	
    while (true) {
        out.print("> ");
        out.flush();
        String command;
        try {
            command = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (command.equals("quit")) {
            break;
        }
        execute(command);
    }
    
	}
	
	
	
	
	public static void sayConsole(String message,boolean retourLigne) {
				out.print(message);
				
				if(retourLigne) out.println();
		
	}
	

	 
	
    private void execute(String commandLine) {
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        switch (command) {
            case "show":
                new Show();
                break;
            case "add":
               new Add(commandRest[1]);
                break;
            case "check":
                new Check(commandRest[1]);
                break;
            case "uncheck":
                new Uncheck(commandRest[1]);
                break;
            case "help":
                new Help();
                break;
            default:
        		sayConsole(("I don't know what the command \""+command+"\" is."),true);
                break;
        }
    }

    

	
	
	
	
}
