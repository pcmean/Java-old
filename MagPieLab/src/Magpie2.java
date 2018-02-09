/**

 * A program to carry on conversations with a human user.

 * This is the initial version that:

 * <ul><li>

 *       Uses indexOf to find strings

 * </li><li>

 *                                Handles responding to simple words and phrases

 * </li></ul>

 * This version uses a nested if to handle default responses.

 * @author Laurie White

 * @version April 2012

 */

public class Magpie2

{

    /**

     * Get a default greeting

     * @return a greeting

     */

    public String getGreeting()

    {

        return "Hello, let’s talk.";

    }


    /**

     * Gives a response to a user statement

     *

     * @param statement

     *            the user statement

     * @return a response based on the rules given

     */

    public String getResponse(String statement)

    {
        int responseNum;
        String response = "";
        if (statement.indexOf("no") >= 0){
            responseNum = 0;
        }else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0){
            responseNum = 1;
        }else{
            responseNum = 2;
        }
        switch(responseNum){
            case 0:
            response = "Why so negative?";
            break;
            
            case 1:
            response = "Tell me more about your family!";
            break;
            
            case 2:
            response = getRandomResponse();
            break;
        }
        return response;
    }


    /**

     * Pick a default response to use if nothing else fits.

     * @return a non-committal string

     */

    private String getRandomResponse()

    {

        final int NUMBER_OF_RESPONSES = 6;

        double r = Math.random();

        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);

        String response = "";
        
        switch(whichResponse){
            case 0:
            response = "Interesting, tell me more.";
            break;
            
            case 1:
            response = "Hmmm.";
            break;
            
            case 2:
            response = "Do you really think so?";
            break;
            
            case 3:
            response = "You don’t say.";
            break;
            
            case 4:
            response = "You don’t say.";
            break;
            
            case 5:
            response = "WOW!";
            break;
        }
        return response;

    }

}