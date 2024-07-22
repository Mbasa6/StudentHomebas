package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.AddressHelper;
import za.ac.cput.util.Helper;

public class AddressFactory {
    public static Address buildAddress(String streetName, String suburb, String city, String postalCode){
        if(
        Helper.isNullOrEmpty(streetName) ||
        Helper.isNullOrEmpty(suburb) ||
        Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(postalCode)
        ){return null;}
        return new Address.AddressBuilder()
                .setStreet(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .buildAddress();
    }
}
