package enums;

public enum MetalType {

    ALUMINIUM("aluminium"),
    LEAD("lead"),
    TITANIUM("titanium");

    private String metalName;

    MetalType(String metalName) {
        this.metalName = metalName;
    }

    public String getMetalName(){
          return metalName;
    }
}
