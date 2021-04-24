package edu.pingpong.mollapInterceptingFilter.app;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;
import edu.pingpong.mollapInterceptingFilter.target.Vehicle;
// import intercepting.clients.Mollapp;
// import intercepting.filtres.Authoritzation;
// import intercepting.targets.Vehicle;
// import intercepting.filtres.Autentication;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        TaskProgrammer taskProgrammer = new TaskProgrammer(new Vehicle());

        // /**
        //  * Afegir al sistema les tasques que volem que el sistema
        //  * executi al rebre la petició del client.
        //  */
        // taskProgrammer.setTask(new Authentication());
        // taskProgrammer.setTask(new Authoritzation());

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