/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganizantion = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganizantion);
        
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        
        LabOrganization labOrganization = new LabOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        
        Employee employee = new Employee();
        employee.setName("Admin XYZ");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        account.setEmployee(employee);
        
        adminOrganizantion.getEmployeeDirectory().getEmployeeList().add(employee);
           
        adminOrganizantion.getUserAccountDirectory().getUserAccountList().add(account);  
        
        Employee docEmployee = new Employee();
        docEmployee.setName(" Jackie");
        
        UserAccount docAccount = new UserAccount();
        docAccount.setUsername("doctor");
        docAccount.setPassword("doctor");
        docAccount.setRole("Doctor");
        docAccount.setEmployee(docEmployee);
        
        doctorOrganization.getEmployeeDirectory().getEmployeeList().add(docEmployee);
       
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(docAccount);
        
        Employee labEmployee = new Employee();
        labEmployee.setName(" Ben");
        
        UserAccount labAccount = new UserAccount();
        labAccount.setUsername("lab");
        labAccount.setPassword("lab");
        labAccount.setRole("Lab Assistant");
        labAccount.setEmployee(labEmployee);
        
        labOrganization.getEmployeeDirectory().getEmployeeList().add(labEmployee);
        
        labOrganization.getUserAccountDirectory().getUserAccountList().add(labAccount);
        
        return business;
    }
    
}
