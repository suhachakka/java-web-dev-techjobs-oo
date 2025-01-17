package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        if (this.getName()== null && this.getEmployer()== null && this.getLocation()==null
                && this.getPositionType()==null && this.getCoreCompetency()==null ) {
            return  "OOPS! This job does not seem exists";

        }


        if (this.getName().equals("")) {
            this.setName("Data not available");
        }
        if (this.employer.getValue().equals("") || this.employer.getValue().equals(null)){
            this.employer.setValue("Data not available");
        }
        if (this.location.getValue().equals("")) {
            this.location.setValue("Data not available");
        }
        if (this.positionType.getValue().equals("")) {
            this.positionType.setValue("Data not available");
        }
        if (this.coreCompetency.getValue() .equals( "")) {
            this.coreCompetency.setValue("Data not available");

        }

        return
                " " + '\n' +
                        " Id :" + id
                        + "\n Name :" + name + '\n' +
                        " employer :" + employer + '\n' +
                        " location :" + location + '\n' +
                        " positionType :" + positionType + '\n' +
                        " coreCompetency :" + coreCompetency + "\n" +
                        " ";
    }

}


