package edu.pingpong.mollapInterceptingFilter.targget;

public class Vehicle implements Target{
    // Constructor
    public Vehicle() {}

    @Override
    public void execute(String execute) {
        System.out.println("\n\n\tVehicle door opened for " + execute);
    }
}
