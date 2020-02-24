
public class Student extends Person {
				int id;
				double cgpa;
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public double getCgpa() {
					return cgpa;
				}
				public void setCgpa(double cgpa) {
					this.cgpa = cgpa;
				}
				public Student(int id, double cgpa) {
					super();
					this.id = id;
					this.cgpa = cgpa;
				}
				public Student() {
					super();
				} 
				public void show()
				{
					System.out.println(name+" : " +age+ " : " +id+" : "+cgpa+" ");
				}
	

}
