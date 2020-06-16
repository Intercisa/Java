package validateIPaddress;

public class ValidIPAddress {

	 public String validIPAddress(String IP) {
	        if(IP.matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$")) return "IPv4";
	        if(IP.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})")) return "IPv6";
	        return "Neither";
	    }
	
}




