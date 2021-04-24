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

    // Setter
    public void setTask(Target target) {
        this.target = target;
    }

    // Getters
    public List<Filter> getTasks() {
        return this.taskList;
    }

    public Target getTarget() {
        return this.target;
    }

    // Add an element to the list
    public void addTask(Filter task) {
        this.taskList.add(task);
    }

    // Execute list
    public void execute(String request) {
        getTasks().forEach(t -> t.execute(request));
        if (target != null) {
            getTarget().execute(request);
        }
    }
}
