package edu.pingpong.mollapInterceptingFilter.admin;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.mollapInterceptingFilter.filter.Filter;
import edu.pingpong.mollapInterceptingFilter.target.Target;

public class Tasks {

    private List<Filter> taskList = new ArrayList<>();
    private Target target;

    // Constructor
    public Tasks() {}

    // Getters
    public List<Filter> getTasks() {
        return this.taskList;
    }

    public Target getTarget() {
        return this.target;
    }

    // Add an element to the list
    public void addTask(Filter filter) {
        this.taskList.add(filter);
    }

    // Execute list
    public void execute(String request) {
        this.taskList.forEach(t -> t.execute(request));
    }
    
    // Setter
    public void setTask(Target target) {
        this.target = target;
    }
}
