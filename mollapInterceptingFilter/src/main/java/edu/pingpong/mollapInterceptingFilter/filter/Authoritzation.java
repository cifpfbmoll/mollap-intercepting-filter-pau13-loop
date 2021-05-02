package edu.pingpong.mollapInterceptingFilter.filter;

public class Authoritzation implements Filter{
    // Constructor
    public Authoritzation() {}

    @Override
    public void execute(String request) {
        System.out.print("\n\tAuthoritzation request OK for " + request);
    }
}
