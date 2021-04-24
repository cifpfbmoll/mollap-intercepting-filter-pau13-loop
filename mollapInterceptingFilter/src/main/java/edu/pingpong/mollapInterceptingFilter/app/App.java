package edu.pingpong.mollapInterceptingFilter.app;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;
import edu.pingpong.mollapInterceptingFilter.target.Vehicle;
import edu.pingpong.mollapInterceptingFilter.filter.Authentication;
import edu.pingpong.mollapInterceptingFilter.filter.Authoritzation;
// import intercepting.clients.Mollapp;
// import intercepting.filtres.Authoritzation;
// import intercepting.targets.Vehicle;
// import intercepting.filtres.Autentication;

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

        // /**
        //  * Configuració de l'app client per a que
        //  * executi les tasques programades i
        //  * enviï el misstage al sistema.
        //  */
        // Mollapp mollapp = new Mollapp();
        // mollapp.setTaskProgrammer(taskProgrammer);
        // mollapp.sendPetition("Francesc");
    }
}