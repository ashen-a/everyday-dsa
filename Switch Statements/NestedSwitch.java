import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
            System.out.println("Ayush Das");    
            break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                    default:
                        System.out.println("No department entered");
                    
                }
                break;
            default:
                System.out.println("Enter correct empID");    
        }
    }
    
}
