package boasentregas.customer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address
{
    @JsonProperty("zipcode")
    Integer zipcode;

    @JsonProperty("type")
    String type;

    @JsonProperty("name")
    String name;

    @JsonProperty("number")
    String number;

    @JsonProperty("complement")
    String complement;

    @JsonProperty("neighborhoods")
    String neighborhoods;

    @JsonProperty("city")
    String city;

    @JsonProperty("state")
    String state;
}
