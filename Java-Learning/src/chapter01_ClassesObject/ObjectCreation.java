package chapter01_ClassesObject;
class EmployeeData{
		private int id;
		private String name;
		private String City;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}

}

public class ObjectCreation {
	public static void main(String[] args) {

		EmployeeData data= new EmployeeData();
		data.setId(10);
		data.setName("Nitesh");
		data.setCity("Pune");
		
		System.out.println(data.getId() +" "+ data.getName() +" "+ data.getCity());
	}
}
