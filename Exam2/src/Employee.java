/**
 * 
 * @author Jessica Parker
 * @version Exam 2
 * 			CSCI 202
 * 			October 16, 2018
 *
 */
public abstract class Employee {

		private String name;
		private String idnum;
		
		public Employee ( String name, String idnum) {
			this.name = name;
			this.idnum = idnum;
		}
		
		public String getName() {
			return name;
		}
		
		public String getIdnum() {
			return idnum;
		}
		
		public abstract int getPay();
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			Employee e = (Employee) obj;
			return idnum.equals(e.idnum) && name.equals(e.name);
		}
		
		@Override
		public String toString() {
			return "Name: " + name +  " ID Number: " + idnum;
		}
}

