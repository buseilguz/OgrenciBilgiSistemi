
public class Student {
	  String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double avarage;
	    boolean isPass;
		public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya
				) {
			super();
			this.name = name;
			this.stuNo = stuNo;
			this.classes = classes;
			this.mat = mat;
			this.fizik = fizik;
			this.kimya = kimya;
			
		}
		public void addBulkExamNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }

	    }

	    public void isPass() {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
	            System.out.println("Notlar tam olarak girilmemiþ");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("Sýnýfý Geçti. ");
	            } else {
	                System.out.println("Sýnýfta Kaldý.");
	            }
	        }
	    }

	    public void calcAvarage() {
	        this.avarage = ((this.fizik.note*fizik.rate+fizik.s_note*fizik.s_rate) + (this.kimya.note*kimya.rate+kimya.s_note*kimya.s_rate )+( this.mat.note*mat.rate+mat.s_note*mat.s_rate)) / 3;
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("=========================");
	        System.out.println("Öðrenci : " + this.name);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	    }

}
