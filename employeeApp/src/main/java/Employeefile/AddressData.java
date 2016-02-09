package Employeefile;

import java.io.*;
import java.util.*;

import Employeefile.Address.AddressType;

public class AddressData {
	public static final String infile="E:/address.txt";
	 double ContactId;
	 AddressType addressType;
	 int id;
	 int houseNo;
	 String street;
	 String area;
	 String city;
	 double pinCode;
	 String state;
	 String landmark;
	 double phoneNo;
	 String email;
	 String skypeid;
	 
	 public static void main(String[] args) throws IOException {
		
	}
	
	
	

	@SuppressWarnings("resource")
	public List<Address> setValue(int EmployeeId) throws IOException{
		List<Address> list = new ArrayList<Address>();
		File file = new File(infile);
		FileReader fileReader = new FileReader(file);
		BufferedReader  bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine() ) != null){
			StringTokenizer stringTokenizer = new StringTokenizer(line,",");
			while(stringTokenizer.hasMoreElements()){
				id = Integer.parseInt(stringTokenizer.nextToken());
				if(EmployeeId == id){
				ContactId = Double.parseDouble(stringTokenizer.nextToken());
				addressType = AddressType.valueOf(stringTokenizer.nextToken());
				houseNo = Integer.parseInt(stringTokenizer.nextToken());
				street = stringTokenizer.nextToken();
				area = stringTokenizer.nextToken();
				city = stringTokenizer.nextToken();
				pinCode = Double.parseDouble(stringTokenizer.nextToken());
				state = stringTokenizer.nextToken();
				landmark = stringTokenizer.nextToken();
				phoneNo = Double.parseDouble(stringTokenizer.nextToken());
				email = stringTokenizer.nextToken();
				skypeid = stringTokenizer.nextToken();
				
				Address address = new Address(id,ContactId, houseNo, street, area, city, pinCode, state, landmark, phoneNo, email, skypeid,addressType);
				list.add(address);
				}
				else{
					break;
				}
			}
		}
		return list;
	}


}
