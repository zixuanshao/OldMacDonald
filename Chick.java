class Chick implements Animal {
    private String myType;
    private String mysound;
    private String mysound2;
    public Chick(String type, String sound1, String sound2)     {
        this.myType = type;
        this.mysound = sound1;
        this.mysound2 = sound2;
    }
    public String getType(){return myType;}
    public String getSound(){
        if (Math.random()>.5)
        {
            return this.mysound; 
        }
        else 
        {
            return this.mysound2;
        }
    }
}
