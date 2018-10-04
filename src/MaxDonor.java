import java.util.ArrayList;

public class MaxDonor {
     public String generous(String[] orgs, int[] amount) {
    	 ArrayList<String> organizations = new ArrayList<String>();
    	 for (int i = 0; i < orgs.length; i++) {
    		 if (!organizations.contains(orgs[i])) {
    			 organizations.add(orgs[i]);
    		 }
    	 }
    	 int max = 0;
    	 int totalForOrg = 0;
    	 String maxOrg = "";
    	 for (int i = 0; i < organizations.size(); i++) {
    		 totalForOrg = 0;
    		 for (int j = 0; j < orgs.length; j++) {
    			 if (orgs[j].equals(organizations.get(i))) {
    				 totalForOrg = totalForOrg + amount[j];
    			 }
    		 }
    		 if (totalForOrg > max) {
    			 max = totalForOrg;
    			 maxOrg = organizations.get(i);
    		 }
    	 }
    	 
    	 
    	 return maxOrg + ":$" + max;
     
     }
 }