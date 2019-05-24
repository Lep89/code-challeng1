package challenge2;

public class Info {
	
	int id;
	String name;
	String phone;
	String address;
	
	Info(int id,String name,String phone,String address){
		this.id = id;
		this.name=name;
		this.phone=phone;
		this.address = address;
	}
	
	Info returndetails(Info in){
		in = new Info(1001,"Tom","123456","123 main st");
		System.out.println("id is" +in.id);
		System.out.println("phone number is" +in.phone);
		System.out.println("name is" +in.name);
		System.out.println("address is" +in.address);
		return in;
			
	}

}
