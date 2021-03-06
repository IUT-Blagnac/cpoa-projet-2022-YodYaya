package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.command.*;
import com.codurance.training.tasks.objects.Project;
import com.codurance.training.tasks.objects.Task;



public class Main {


    public static void main(String[] args) throws Exception {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);
            new TaskList(in, out).run();
        }
    
	
	

}
