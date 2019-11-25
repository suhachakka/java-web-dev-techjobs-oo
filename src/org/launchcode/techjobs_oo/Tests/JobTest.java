package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;

    @Before
    public void createObject(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId(){
        int id1= job1.getId();
        int id2=job2.getId();
     assertEquals(true,job1.getId()!=job2.getId());
     assertTrue(job1.getId()!=job2.getId());
     assertFalse("Both object ID's must not equal",id1==id2);
     assertSame("Both ID's are differ by 1",id2-id1,1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        boolean jobClass = job3 instanceof Job;
        //System.out.println(jobClass);
        assertTrue(jobClass);
        assertTrue((job3.getEmployer().getValue()), true);
        assertTrue((job3.getLocation().getValue()), true);
        assertTrue((job3.getPositionType().getValue()), true);
        assertTrue((job3.getCoreCompetency().getValue()), true);
        assertEquals("ACME",job3.getEmployer().getValue(),"ACME");
        assertEquals("Persistence",job3.getCoreCompetency().getValue(),"Persistence");
        assertEquals("Quality control",job3.getPositionType().getValue(),"Quality control");
        assertEquals("Desert",job3.getLocation().getValue(),"Desert");
        assertEquals(job3.getName(),"Product tester");
    }
    @Test
    public void testJobsForEquality(){
       assertFalse(job3.equals(job4));
    }
}
