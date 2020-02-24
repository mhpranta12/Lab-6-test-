
public class Student extends Person{
			Person per;
			int id;
			double cgpa; 
			
			public Student() {
				super();
			}

			

			public Student(Person per, int id, double cgpa) {
				super();
				this.per = per;
				this.id = id;
				this.cgpa = cgpa;
			}



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

			public void show()
			{
				System.out.println(per+" :"+id+" :"+cgpa+" :");
			}
}
