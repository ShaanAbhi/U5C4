import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		ArrayList<String> s1 =new ArrayList<>();
		s1.add(model);
		if(mobiles.containsKey(company)) {
			mobiles.get(company).add(model);

			return "Mobile added successfully";
		}
		mobiles.put(company,s1 );
		
		return "Mobile added successfully";

		
		}
		public List<String> getModels(String company)throws InvlidMobileException{
			
			//This method return the list of all the models of the supplied company
		//if we supply any invalid company name then it should throw a checked exception
		
			if(mobiles.containsKey(company)) {
				return mobiles.get(company);
			}else {
				throw new InvlidMobileException();
			}
		}
		
		
		
		public static void main(String[] args) {
			Mobile mobile=new Mobile();
			mobile.addMobile("apple","Iphone13");
			mobile.addMobile("opoo","Red123");
			mobile.addMobile("vivo","note5");
			mobile.addMobile("sumsung","note10");
			mobile.addMobile("mi","redmi9i");
			
			try {
				System.out.println(mobile.getModels("apple"));
				System.out.println(mobile.getModels("sumsung"));
				
			} catch (InvlidMobileException e) {
				
				e.printStackTrace();
			}

			System.out.println(" main method  terminated normally");
		}
		
}

