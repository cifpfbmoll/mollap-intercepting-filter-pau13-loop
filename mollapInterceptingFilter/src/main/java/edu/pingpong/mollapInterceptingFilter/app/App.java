package edu.pingpong.mollapInterceptingFilter.app;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;
import edu.pingpong.mollapInterceptingFilter.targget.Vehicle;
import edu.pingpong.mollapInterceptingFilter.filter.Authentication;
import edu.pingpong.mollapInterceptingFilter.filter.Authoritzation;
import edu.pingpong.mollapInterceptingFilter.client.Mollapp;

public final class App {
    public static void main(String[] args) {

        /**
         * Configure the Task Programmer of the system 
         * with the selected Target from Vehicles to
         * anything that could accept the reception of
         * the message
        */
        TaskProgrammer taskProgrammer = new TaskProgrammer(new Vehicle());

        /**
         * Add to the system the tasks that the system has to
         * execute when gets a request from the client
        */
        taskProgrammer.setTask(new Authentication());
        taskProgrammer.setTask(new Authoritzation());

        /**
         * Configure the client app to execute the 
         * programmed tasks and to send a message 
         * to the system
        */
        Mollapp mollapp = new Mollapp();
        mollapp.setTaskProgrammer(taskProgrammer);
        mollapp.sendRequest("Francesc");
    }
}