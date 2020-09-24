package nl.novi.javaprogrammeren;

public class House {
    private String strStreet;
    private int iHouseNr;
    private Person owner;

    public House(String strStreet, int iNumber , Person owner) {
        this.strStreet = strStreet;
        this.iHouseNr = iNumber;
        this.owner = owner;
    }


}
