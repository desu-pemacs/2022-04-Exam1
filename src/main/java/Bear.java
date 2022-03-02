public class Bear {
    private String type;
    private double height;  // height in inches

    /**
     * Constructs a Bear with a default type of Kodiak that is
     * 8 ft or 96.0 inches tall.
     */
    public Bear(){
        type = "Kodiak";
        height = 96.0;
    }

    /**
     * Constructs a Bear with a type given by the parameter
     * type that is height long
     * @param type the type of this Bear
     * @param height the height of this Bear
     */
    public Bear(String type, double height){
        // TODO: replace this line with your code
    }

    /**
     * Returns the type of this Bear.
     * @return a String representing the type of this Bear
     */
    public String getType(){
        return type;
    }

    /**
     * Returns the height of this Bear in inches
     * @return the height of this Bear in inches
     */
    public double getHeightInInches(){
        return height;
    }

    /**
     * Returns the height of this Bear in cm.
     * @return the height of this Bear in cm
     */
    public double getHeightInCentiMeters(){
        // use 1in = 2.54cm
        // TODO: replace this line with your code
    }

    /**
     * Sets the type of this Bear
     * @param type a string representing the new type of this Bear
     */
    public void setType(String type){
        // TODO: replace this line with your code
    }

    /**
     * Sets the new height of this Bear in inches
     * @param height the new height of this Bear in inches
     */
    public void setHeight(double height) {
        this.height = height;
    }

    //===================== Do not touch code below this line =================
    /**
     * Converts this Bear to a string representation.
     * @return a String representing this Bear.
     */
    public String toString(){
        return type+":"+height;
    }
}
