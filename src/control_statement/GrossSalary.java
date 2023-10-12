package control_statement;

public class GrossSalary
{


    public static void main(String[] args) {
        double Basic_Salary=18000;
        double HRA;
        double DA;
        if(Basic_Salary<=15000 )
        {
            HRA=((Basic_Salary*10)/100);
            DA=((Basic_Salary*90)/100);
            System.out.println("gross salary:"+(Basic_Salary+HRA+DA));

        }
        else
        {
            HRA=((Basic_Salary+500));
            DA=((Basic_Salary*98)/100);
            System.out.println("gross salary2:"+(Basic_Salary+HRA+DA));

        }
    }
}
