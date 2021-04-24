package edu.pingpong.mollapInterceptingFilter.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.mollapInterceptingFilter.admin.TaskProgrammer;
import edu.pingpong.mollapInterceptingFilter.admin.Tasks;
import edu.pingpong.mollapInterceptingFilter.filter.Authentication;
import edu.pingpong.mollapInterceptingFilter.filter.Authoritzation;
import edu.pingpong.mollapInterceptingFilter.filter.Filter;
import edu.pingpong.mollapInterceptingFilter.target.Target;
import edu.pingpong.mollapInterceptingFilter.target.Vehicle;

public class AppTest {

    private TaskProgrammer taskProgrammer;
    private Tasks tasks;
    private Target target; 
    private Filter authoritzation;
    private Filter authentication;

    @Before
    public void setupApp() {
        tasks = new Tasks();
        taskProgrammer = new TaskProgrammer(target);

        // Filters
        authoritzation = new Authoritzation();
        authentication = new Authentication();
    }

    @Test
    public void testTarget() {
        assertEquals(target, tasks.getTarget());
    }

    @Test
    public void testAddFiltersToList() {
        tasks.addTask(authoritzation);
        tasks.addTask(authentication);

        assertEquals(2, tasks.getTasks().size());
    }

    @Test 
    public void testGetTaskByPosition() {
        tasks.addTask(authoritzation);
        tasks.addTask(authentication);

        assertEquals(authoritzation, tasks.getTasks().get(0));
        assertEquals(authentication, tasks.getTasks().get(1));
    }
}
