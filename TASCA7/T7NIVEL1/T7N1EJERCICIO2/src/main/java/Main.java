import Hierarchy.PhysicalEmployee;
import Hierarchy.VirtualEmployee;

public class Main {
@SuppressWarnings("deprecation")
    public static void main(String[] args){

        VirtualEmployee ve1 = new VirtualEmployee("Gabriel", "Shear", 20f, 60);
        PhysicalEmployee pe1 = new PhysicalEmployee("John", "Doe", 7.25f, 50);

        System.out.println(ve1.calculateSalary(160));
        System.out.println(pe1.calculateSalary(160)+ "\n");

        System.out.println("Deprecated" + "\n");

        System.out.println(ve1.salaryWithGas(160));
        System.out.println(pe1.calculateSalaryNoGas(160));


    }

}
