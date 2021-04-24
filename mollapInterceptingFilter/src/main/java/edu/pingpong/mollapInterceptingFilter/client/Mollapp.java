package edu.pingpong.mollapInterceptingFilter.client;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;
// Import interface Client
import edu.pingpong.mollapInterceptingFilter.client.Client;

public class Mollapp implements Client{

    private TaskProgrammer taskProgrammer;

    // Constructor
    public Mollapp() {}

    public void setTaskProgrammer(TaskProgrammer taskProgrammer) {
        this.taskProgrammer = taskProgrammer;
    }

    public void sendRequest(String request) {
        this.taskProgrammer.executeTasks(request);
    }
}
