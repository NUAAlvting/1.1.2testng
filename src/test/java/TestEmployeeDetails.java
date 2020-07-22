import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
    EmployeeDetails employeeDetails =new EmployeeDetails();
    @Test
    public void testCaculateAppriasal(){
        employeeDetails.setName("LvTing");
        employeeDetails.setAge(24);
        employeeDetails.setMonthlySalary(8000);
        double appraisal =empBusinessLogic.calculateAppraisal(employeeDetails);
        Assert.assertEquals(500,appraisal,0.0,"500");
    }

}
