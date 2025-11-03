public class Visitors {

    String name;
    String departmentToVisit;
    String purpose;
    String date;
    String timeIn;
    String timeOut;

    //Constructors
    public Visitors(String name, String departmentToVisit, String purpose, String date, String timeIn, String timeOut) {
        this.name = name;
        this.departmentToVisit = departmentToVisit;
        this.purpose = purpose;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = ""; //initially empty
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public String getDepartmentToVisit(){
        return departmentToVisit;
    }

    public String getPurpose(){
        return purpose;
    }

    public String getDate() {
        return date;
    }

    public String getTimeIn(){
        return timeIn;
    }

    public void setTimeOut(String timeOut){
        this.timeOut = timeOut;
    }


    @Override
    public String toString(){
        return "Name: " + name +
                "\nDepartment: " + departmentToVisit +
                "\nPurpose: " + purpose +
                "\nDate: " + date +
                "\nTime In: " + timeIn +
                "\nTime Out: " + (timeOut.isEmpty() ? "N/A" : timeOut);
    }
}

