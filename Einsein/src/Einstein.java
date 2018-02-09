public class Einstein{

    private static final double C = 3.0E8; //speed of light in m/s
    private static final String[]QUOTES=
        {"A person who never made mistakes never tried anything new.",
            "We cannot solve problems with the same thinking we used when we create them.",
            "Insanity: doing the same thing over and over again and expecting different results.",
            "Logic will get you from a to B, imagination will take you everywhere"
        };

    public static double calcEnergy(double mass)
    {
        return mass*C*C;
    }

    public static String wordsOfWisdom(){

        int index= (int) (QUOTES.length*Math.random());
        return QUOTES[index];

    }

}//end class
