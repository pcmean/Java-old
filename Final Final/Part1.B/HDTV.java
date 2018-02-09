public class HDTV extends TV implements Digital {
	public void connectHDMI() {
		System.out.println("HDMI cable connected");
	}
	public String tvType() {
		String outhd = "I'm a High Def 24 million color TV";
		return outhd;
	}
}