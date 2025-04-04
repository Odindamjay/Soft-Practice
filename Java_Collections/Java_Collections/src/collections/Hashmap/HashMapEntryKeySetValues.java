package collections.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValues {
    public static void main(String[] args) {
        Map<String, String> countryISOCodeMapping = new HashMap<>();

        countryISOCodeMapping.put("Nigeria", "NGN");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");
        countryISOCodeMapping.put("China", "CN");

        Set<Map.Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        Set<String> countries = countryISOCodeMapping.keySet();
        System.out.println("countries : " + countries);

        Collection<String> isoCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes : " + isoCodes);
    }
}
