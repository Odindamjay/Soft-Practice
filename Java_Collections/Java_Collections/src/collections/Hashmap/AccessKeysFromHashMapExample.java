package collections.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {
    public static void main(String[] args) {
        Map<String, String> userCityMapping = new HashMap<>();

        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

        userCityMapping.put("John", "Nwoke");
        userCityMapping.put("Justice", "Adeleye");
        userCityMapping.put("Theo", "Rowoli");

        System.out.println("userCityMapping HashMap : " + userCityMapping);

        System.out.println("We have the city information of " + userCityMapping.size() + " users");

        String userName = "Wale";
        if(userCityMapping.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        } else {
            System.out.println("City details not found for user " + userName);
        }

        if(userCityMapping.containsValue("Nigeria")) {
            System.out.println("There is a user in the userCityMapping who lives in Nigeria");
        } else {
            System.out.println("There is not user in the userCityMapping who lives in Nigeria");
        }

        userCityMapping.put(userName, "Osun State");
        System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);
        System.out.println("Tolu's city : " + userCityMapping.get("Lisa"));
    }
}
