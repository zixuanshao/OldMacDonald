class NamedCow extends Cow
{
    private String myname;
    public NamedCow(String name, String type, String sound)
    {
    	super(type, sound);
    	this.myname = name;
    }
    public String getName()
	{
		return this.myname;
	}
}
