import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class College {
    List<College_Student> student=new ArrayList<>();
    public void addStudent(){
        Scanner sc=new Scanner(System.in);
        College_Student s=new College_Student();
        System.out.println("enter the student name:");
        String name=sc.next();
        System.out.println("enter register number");
        int register_number=sc.nextInt();
        s.setName(name);
        s.setRegister_number(register_number);
        student.add(s);
    }
    public void showStudent(){

       for(College_Student i :student){
           System.out.println(" Name="+i.getName() +" Register number= "+ i.getRegister_number());
       }
    }
    public void removeStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the register number:");
        int r=sc.nextInt();
        for(College_Student j:student){
            if(j.getRegister_number()==r){
                student.remove(j);
                break;
            }

        }
    }
    public void specificStudentDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the register number:");
        int a=sc.nextInt();
        for(College_Student k:student){
            if(k.getRegister_number()==a){
                System.out.println(k.getRegister_number()+"  "+k.getName());
                break;
            }
        }
    }
    public static void main(String[] args){
        int option;
        College college = new College();
        do{
            System.out.println();
            System.out.println("enter the option:");
            System.out.println();

            Scanner sc=new Scanner(System.in);
            System.out.println("1.add student detail\n 2.view student detail\n 3.remove studennt detail\n 4.specific student detail\n 5.exit");
            option=sc.nextInt();
            switch (option){
                case 1:
                    college.addStudent();
                    break;
                case 2:
                    college.showStudent();
                    break;
                case 3:
                    college.removeStudent();
                    break;
                case 4:
                   college.specificStudentDetail();
                    break;

                case 5:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("you entered worng option");
            }

        }
        while(option!=5);


    }
}
