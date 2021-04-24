package edu.pingpong.mollapInterceptingFilter.client;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;

public interface Client {
    public void setTaskProgrammer(TaskProgrammer taskProgrammer);

    public void sendRequest(String request);
}
