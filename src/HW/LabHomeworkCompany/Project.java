package HW.LabHomeworkCompany;

import java.util.Calendar;

public class Project {

    // projectName: String startDate: java.util.Calendar state: boolean
    String projectName;
    Calendar startDate;
    boolean state;

    public Project(String pName, Calendar startDate, String state) {
        projectName = pName;
        this.startDate = startDate;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        if (state) {
            return "Open";
        } else
            return "Close";
    }

    public void setState(String state) throws Exception {
        if (state.equals("Open")) {
            this.state = true;
        } else if (state.equals("Close")) {
            this.state = false;
        } else throw new Exception("Invalid state!!");
    }
    public void close(){
        if (state){
            state=false;
        }
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", state=" + state +
                '}';
    }


}
