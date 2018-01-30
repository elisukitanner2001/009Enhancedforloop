public class oneDimArryays {

	int[] myInts = {5, 2, 8, 12, 43};
	String myStrings[] = {"hello", "happy", "Wednesday", "period", "a2"};
	float[] myFloat = new float[5];
	private void init_myFloat() {
		myFloat[0] = (float) 5.5;
		myFloat[1] = (float) 1.025;
		myFloat[2] = (float) 3.125;
		myFloat[3] = (float) 2.5;
		myFloat[4] = (float) 0.75;

	}
	public void sysoArray() {
		init_myFloat();
		for(int i = 0; i<myInts.length; i++) {
		System.out.println(myInts[i]);

	
	
	}
	for (int myValue : myInts) {
		System.out.println(myValue);
	}
	
	System.out.println("\n Starting String array test");
	for(int s=0; s<myStrings.length; s++)System.out.println(myStrings[s]);
	for (String myValue : myStrings) System.out.println(myValue);
	for (float myValue : myFloat) System.out.println(myValue);;
}
}
