package p2;

public class Laptop 
{
	String lname;
	int lprice;
	String lcolor;
	String los_type;
	String lRAM;
	public Laptop() //Parameterless const
    {
		String lname = "Lenovo";
		int lprice = 50000;
		String lcolor = "Black";
		String los_type = "UBUNTU";
		String lRAM = "64GB";
	}
	public Laptop(String lname, int lprice, String lcolor, String lRAM, String los_type)
	{
		this.lname = lname;
		this.lprice = lprice;
		this.lcolor = lcolor;
		this.lRAM = lRAM;
		this.los_type = los_type;
		
	}
	//setters
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLprice() {
		return lprice;
	}
	public void setLprice(int lprice) {
		this.lprice = lprice;
	}
	public String getLcolor() {
		return lcolor;
	}
	public void setLcolor(String lcolor) {
		this.lcolor = lcolor;
	}
	public String getLos_type() {
		return los_type;
	}
	public void setLos_type(String los_type) {
		this.los_type = los_type;
	}
	public String getlRAM() {
		return lRAM;
	}
	public void setlRAM(String lRAM) {
		this.lRAM = lRAM;
	}
	
	public void disp()
	{
		System.out.println("Laptop Name:="+lname +" Laptop Price:="+lprice+ " Laptop Colour:="+lcolor+" Laptop los_type:="+los_type+" Laptop RAM="+ lRAM);
	}

}// Class Laptop
