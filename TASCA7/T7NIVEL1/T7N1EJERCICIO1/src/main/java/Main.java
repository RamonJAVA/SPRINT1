import Hierarchy.PhysicalEmployee;
import Hierarchy.VirtualEmployee;

public class Main {

    public static void main(String[] args){

        VirtualEmployee ve1 = new VirtualEmployee("Gabriel", "Shear", 20f, 60);
        PhysicalEmployee pe1 = new PhysicalEmployee("John", "Doe", 7.25f, 50);



        System.out.println("The salary of the Virtual Employee is: " + ve1.calculateSalary(160) + "€.");
        System.out.println("The salary of the Physical Employee is: " + pe1.calculateSalary(160) + "€.");

    }

}
