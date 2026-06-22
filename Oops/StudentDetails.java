class Student{
        int id;
        String name;
        int marks;
        //	Student(int id,String name,int marks){
//		this.id=id;
//		this.name=name;
//		this.marks=marks;
//	}
        void display() {
            System.out.println("Id: "+ id + "\nName: " + name + "\nMakrs: "+marks);
        }
    }
public class StudentDetails {
        public static void main(String[] args) {
            Student s = new Student();
            s.id=101;
            s.name="Karthik";
            s.marks=85;
//		System.out.print("Id: "+ s.id + "\nName: " + s.name+" \nMarks: "+s.marks);;
            s.display();
        }
    }

