package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.launchcode.techjobs_oo.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class JobTest {

     Job job1;
     Job job2;
     Job job3;
     Job sameFieldValuesJob4;
     Job job4;
     Job job5;
     Job job6;

    @Before
    public void createObject() {

        job1= new Job();
        job2= new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        sameFieldValuesJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job5 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        //System.out.println(job3.getId());
        //job6 = new Job(null,null,null,null,null);
    }

    @Test
    public void testSettingJobId() {
        int id1 = job1.getId();
        int id2 = job2.getId();
        assertEquals(false, job1.getId() == job2.getId());
        assertTrue(job1.getId() != job2.getId());
        assertFalse("Both object ID's must not equal", id1 == id2);
        assertSame("Both ID's are differ by 1", id2 - id1, 1);
        assertEquals(1, id2 - id1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        boolean jobClass = job3 instanceof Job;
        //System.out.println(jobClass);
        assertTrue(jobClass);
        assertTrue((job3.getEmployer().getValue()),true);
        assertTrue((job3.getLocation().getValue()),true);
        assertTrue((job3.getPositionType().getValue()),true);
        assertTrue((job3.getCoreCompetency().getValue()),true);
        assertEquals("ACME", job3.getEmployer().getValue(), "ACME");
        assertEquals("Persistence", job3.getCoreCompetency().getValue(), "Persistence");
        assertEquals("Quality control", job3.getPositionType().getValue(), "Quality control");
        assertEquals("Desert", job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getName(), "Product tester");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job3.equals(sameFieldValuesJob4));
    }

    @Test
    public void testBlankLineWithToString() {
        String expected = " ";
        assertTrue(expected, job3.toString().startsWith(""));
        assertEquals(true, job3.toString().endsWith(""));

    }

    @Test
    public void testJobOutputWithToString() {
        String output = " " + "\n " +
                  "Id :3"
                + "\n Name :Product tester" + '\n' +
                " employer :ACME" + '\n' +
                " location :Desert" + '\n' +
                " positionType :Quality control" + '\n' +
                " coreCompetency :Persistence" + '\n' +
                " ";
        System.out.println(job3.toString());
        assertEquals(output, job3.toString());

    }

    @Test
    public void testWithEmptyField() {
        //job5.getEmployer().setValue("");
        String output = " " + '\n' +
                " Id :6"
                + "\n Name :Ice cream taster" + '\n' +
                " employer :Data not available" + '\n' +
                " location :Home" + '\n' +
                " positionType :UX" + '\n' +
                " coreCompetency :Taste" + '\n' +
                " ";
        assertEquals(output, job5.toString());

    }
     @Test
    public void testwithOnlyJobId(){
         String output = "OOPS! This job does not seem exists";
         assertEquals(output,job1.toString());

     }

}

