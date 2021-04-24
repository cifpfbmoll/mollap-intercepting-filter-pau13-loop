package edu.pingpong.mollapInterceptingFilter.admin;

import edu.pingpong.mollapInterceptingFilter.filter.Filter;
import edu.pingpong.mollapInterceptingFilter.target.Target;

public class TaskProgrammer {

    private Tasks tasks;

    // Constructor
    public TaskProgrammer(Target target) {
        this.tasks = new Tasks();
        tasks.setTask(target);
    }
    
    // Getter
    public Tasks getTask() {
        return this.tasks;
    }

    // Setter
    public void setTask(Filter filter) {
        tasks.addTask(filter);
    }

    public void execute(String request) {
        this.tasks.execute(request);
    }
}