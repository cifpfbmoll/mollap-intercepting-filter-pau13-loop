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
    public void setTask(Filter task) {
        tasks.addTask(task);
    }

    // Execute
    public void executeTasks(String request) {
        this.tasks.execute(request);
    }
}
