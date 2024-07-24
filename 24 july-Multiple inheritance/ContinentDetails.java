import java.util.*;
class Continent {
    private String name;

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
 class Country extends Continent {
    private String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
 class State extends Country {
    private String stateName;

    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }
}

 class City extends State {
    private String cityName;
    private String place;

    public City(String continentName, String countryName, String stateName, String cityName, String place) {
        super(continentName, countryName, stateName);
        this.cityName = cityName;
        this.place = place;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPlace() {
        return place;
    }

    public void displayDetails() {
        System.out.println("Place: " + getPlace());
        System.out.println("City: " + getCityName());
        System.out.println("State: " + getStateName());
        System.out.println("Country: " + getCountryName());
        System.out.println("Continent: " + super.getCountryName());
    }
}


public class ContinentDetails {
    public static void main(String[] args) {
        City city = new City("Asia", "India", "Maharashtra", "Pune", "Pimple Gurav");
        city.displayDetails();
    }
}