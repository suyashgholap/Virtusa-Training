import java.util.*;
class Student
{
    int roll;
    String name;
    Scanner sc = new Scanner(System.in);
    void accept() {
        System.out.print("Enter Roll :");
        roll = sc.nextInt();
        System.out.print("Enter Name :");
        name = readLine();
    }
}
class Main
{
	public static void main(String[] args){
	    Student st = new Student();
	    st.accept();
		System.out.println(st.roll);
		System.out.println(st.name);
	}
}
