package net.media.training.live.srp;

import net.media.training.live.srp.Employee;

public class Output extends Employee{

    Employee client ;
    int empId ;

    Output(Employee e){
        client =e ;
        empId = e.getEmpId();
    }
    
    public String convertToHtml(){
        String str = formateBasicDetailes() ;
        str += "<div class='right'><span>" + (totalLeaveAllowed - leaveTaken) + "</span>";
        str += "<span>" + Math.round(monthlySalary * 12) + "</span>";
        if (manager != null) str += "<span>" + manager + "</span>";
        else str += "<span>None</span>";
        int years = calculateYears() ;
        int totalLeaveLeftPreviously = calculateTotalLeaveLeftPreviosly();
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }

    public String formateBasicDetailes(){
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + empId + "'>" +
                "<span>" + name + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        return str ;
    }

}
