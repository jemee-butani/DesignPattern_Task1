package net.media.training.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    protected double monthlySalary;
    protected String name;
    protected String addressStreet;
    protected String addressCity;
    protected String addressCountry;
    protected int leavesTaken;
    protected int totalLeaveAllowed;
    protected int leaveTaken;
    protected String manager;
    protected int yearsInOrg;
    protected int thisYeard;
    protected int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public int getEmpId(){
        return this.empId;
    }

    public int calculateYears(){
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        return years ;
    }

    public int calculateTotalLeaveLeftPreviosly(){
        int totalLeaveLeftPreviously = 0;
        int years = calculateYears();
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously ;
    }


    public String toHtml() {
        Output helper = new Output(this);
        String finaloutput = helper.convertToHtml();
        return finaloutput ;

    }
    //other method related to customer
}
