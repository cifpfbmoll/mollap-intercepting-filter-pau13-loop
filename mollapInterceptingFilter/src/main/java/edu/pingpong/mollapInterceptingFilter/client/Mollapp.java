package edu.pingpong.mollapInterceptingFilter.client;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;

public class Mollapp implements Client{

    private TaskProgrammer taskProgrammer;

    // Constructor
    public Mollapp() {}

    @Override
    public void setTaskProgrammer(TaskProgrammer taskProgrammer) {
        this.taskProgrammer = taskProgrammer;
    }

    @Override
    public void sendRequest(String request) {
        this.taskProgrammer.executeTasks(request);
    }
}
