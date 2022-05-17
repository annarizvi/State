package Project7;

public class State {

    //5 instance variables
    private String name;
    private String capital;
    private int rank;
    private int length;
    private int width;

    //default constructors
    public State() {
        name = "";
        capital = "";
        rank = 0;
        length = 0;
        width = 0;
    }

    //parameterized constructor
    public State(String aName, String aCapital, int aRank, int aLength, int aWidth ) {
        name = aName;
        capital = aCapital;
        rank = aRank;
        length = aLength;
        width = aWidth;

    }

    //GETTERS AND SETTERS for each instance variable

    //getter for name
    public String getName() {
        return name;
    }
    //setter for name
    public void setName(String aName) {
        name = aName;
    }


    //getter for capital
    public String getCapital() {
        return capital;
    }
    //setter for capital
    public void setCapital(String aCapital) {
        capital = aCapital;
    }


    //getter for rank
    public int getRank() {
        return rank;
    }
    //setter for rank
    public void setRank(int aRank) {
        rank = aRank;
    }


    //getter for length
    public int getLength() {
        return length;
    }
    //setter for length
    public void setLength(int aLength) {
        length = aLength;
    }


    //getter for width
    public int getWidth() {
        return width;
    }
    //setter for width
    public void setWidth(int aWidth) {
        width = aWidth;
    }



    //toString method returning each instance variable ??? ask prof
    public String toString() {
        return String.name;
        return String.capital;
        return int.rank;
        return int.length;
        return int.width;
    }



}
