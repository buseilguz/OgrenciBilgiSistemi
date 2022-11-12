
public class Course {
    

	Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note=0;
    int s_note=0;
    double s_rate=0;
    double rate=0;
   

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Ýþlem baþarýlý");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamýþtýr.");
        }
    }

	public Course(Teacher courseTeacher, String name, String code, String prefix, int note, int s_note, double s_rate,double rate) {
		super();
		this.courseTeacher = courseTeacher;
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = note;
		this.s_note = s_note;
		this.s_rate = s_rate;
		this.rate=rate;
	}
}
