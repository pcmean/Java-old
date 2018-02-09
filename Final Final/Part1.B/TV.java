
public abstract class TV {
	private boolean tvON;
	
	public abstract String tvType();
	
	public void setTvOn(boolean in){
		this.tvON=in;
	}
	public boolean getTvOn(){
		return tvON;
	}
	
	public TV() {
		tvON=false;
	}
	public TV(boolean onoff) {
		tvON=onoff;
	}

}
