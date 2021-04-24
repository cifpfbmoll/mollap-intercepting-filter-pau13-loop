package edu.pingpong.mollapInterceptingFilter.filter;

public class Authentication implements Filter{
    // Constructor
    public Authentication() {}

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request OK for " + request);
    }
}
