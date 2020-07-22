import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmpBusinessLogic {
    EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
    EmployeeDetails employeeDetails =new EmployeeDetails();
    @Test
    public void testCalculateYearlySalary() {

        employeeDetails.setName("LvTing");
        employeeDetails.setAge(24);
        employeeDetails.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
        Assert.assertEquals(96000, salary, 0.0, "8000");
    }
}
