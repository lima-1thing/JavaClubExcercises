package com.codenext.day6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapListExamples {

  private static void simpleMap() {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out
        .println(capitalCities); //{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
    capitalCities.get("England"); //London
    capitalCities.remove("England"); //{USA=Washington DC, Norway=Oslo, Germany=Berlin}

    System.out.println(capitalCities.keySet());
    System.out.println(capitalCities.values());
    for (Map.Entry<?, ?> element : capitalCities.entrySet()) {
      System.out.println(String.format("%10s -> %10s", element.getKey(), element.getValue()));
    }

    for (String key : capitalCities.keySet()) {
      System.out.println(String.format("%10s -> %10s", key, capitalCities.get(key)));
    }
  }

  private static void teamRoster() {
    ArrayList<HashMap<String, String>> clubRoster = new ArrayList<>();

    HashMap<String, String> tom = new HashMap<>();
    tom.put("name", "Tom");
    tom.put("email", "tom@codenext.com");
    clubRoster.add(tom);

    HashMap<String, String> bob = new HashMap<>() {{
      put("name", "Bob");
      put("email", "bob@codenext.com");
    }};
    clubRoster.add(bob);

    clubRoster.add(new HashMap<>() {{
      put("name", "jane");
      put("email", "jane@codenext.com");
      put("note", "Participated Android Club in 2020");
    }});

    System.out.println(clubRoster);
  }

  private static void curriculum(){
    HashMap<Integer, ArrayList<String>> curriculums = new HashMap<>();
    curriculums.put(9, new ArrayList<>());
    curriculums.get(9).add("Math");
    curriculums.get(9).add("Science");
    curriculums.get(9).add("History");

    ArrayList<String> grade10 = new ArrayList<>();
    grade10.add("Algebra");
    grade10.add("Science");
    grade10.add("Spanish");
    curriculums.put(10, grade10);

    curriculums.put(11, new ArrayList<>(Arrays.asList("History", "Science", "Spanish", "PE")));

    System.out.println(curriculums);
  }
  public static void main(String[] args) {
    simpleMap();
    teamRoster();
    curriculum();
  }
}
