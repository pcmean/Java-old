
public class BWTV extends TV implements Analog {
	public String tvType() {
		String outBW = "I'm a black and white TV";
		return outBW;
	}

	public void rotateRabbitEars() {
		System.out.println("Rabbit ears rotated 45 degrees");
	}	
}
