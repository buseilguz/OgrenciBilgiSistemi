
public class Main {

	public static void main(String[] args) {

        Teacher t1=new Teacher("ALi","1111111","YZLM");
        Teacher t2=new Teacher("Veli","222222","ELK");
        Teacher t3=new Teacher("Ahmet","33333","ÝMG");

        Course c1=new Course(t1,"PROGRAMLAMA","aaa","123", 101,80,0.8,0.2);
        Course c2=new Course(t2,"ELEKTRONÝK","bbb","345",101,70,0.25,0.75);
        Course c3=new Course(t3,"GÖRÜNTÜLEME","ccc","789",205,100,0.10,0.9);

        Student s1=new Student("Selma","123", 1,c1,c2,c3);
        Student s2=new Student("Hakan","3456",456,c1,c2,c3);
        Student s3=new Student("Meral","582",789,c1,c2,c3);

        s1.addBulkExamNote(100,50,75);
       
        s1.isPass();
        s2.addBulkExamNote(80,50,90);
        s2.isPass();
        s3.addBulkExamNote(100,20,30);
        s3.isPass();


        c1.addTeacher(t1);
        c1.printTeacher();
        c2.addTeacher(t2);
        c2.printTeacher();
        c3.addTeacher(t3);
        c3.printTeacher();

	}

}
