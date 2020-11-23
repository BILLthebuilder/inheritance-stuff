/*
 * First Approach with two methods and the main method
 */
public class Mku{
    public void bitClass(){
        System.out.println("MKU BIT CLASS");
    }
    public void mainCampus(){
        System.out.println("MKU MAIN CAMPUS");
    }
	public static void main(String[] args) {
		Mku mku = new Mku();
		mku.bitClass();
		mku.mainCampus();
	}
}

/*
 * Second Approach using superclass
 */
//public class Mku extends SuperClass{
//    public static void main(String[] args) {
//	Mku mku = new Mku();
//	mku.bitClass();
//    }
//}