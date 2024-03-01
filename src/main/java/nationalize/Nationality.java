package nationalize;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import org.apache.commons.lang3.builder.ToStringStyle;

@lombok.Data
public class Nationality {

    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;

    @lombok.Data

    public static class Country {

        private String countryId;
        private float probability;

        public Country(String countryId, float probability) {
            this.countryId = countryId;
            this.probability = probability;
        }

    }
}
