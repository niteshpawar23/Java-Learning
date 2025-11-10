package chapter01_ClassesObject;
class EmployeeData{
		private int id;
		private int name;
		private int string;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getName() {
			return name;
		}
		public void setName(int name) {
			this.name = name;
		}
		public int getString() {
			return string;
		}
		public void setString(int string) {
			this.string = string;
		}
}

public class ObjectCreation {
	public static void main(String[] args) {

		EmployeeData data= new EmployeeData();
		data.setId(10);
		data.setName(200);
		data.setString(300);
		
		System.out.println(data.getId() +" "+ data.getName() +" "+ data.getString());
	}
}
