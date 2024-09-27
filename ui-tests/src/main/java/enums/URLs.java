package enums;

public enum URLs {

    URLFORTEST("https://the-internet.herokuapp.com/");


    private final String url;

    URLs(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

