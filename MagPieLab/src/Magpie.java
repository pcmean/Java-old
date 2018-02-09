public class Magpie{
    public String getGreeting(){
        return "Hello, let’s talk.";
    }

    public String getResponse(String statement){
        int responseNum=0;
        String response = "";
        if (statement.indexOf("no") >= 0){responseNum = 0;}
        else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0){responseNum = 1;}
        else if (statement.indexOf("Robot") >= 0 || statement.indexOf("Robotics") >= 0){responseNum = 2;}
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0){responseNum = 3;}
        else if (statement.indexOf("Armstrong") >= 0 || statement.indexOf("Molmlund") >= 0){responseNum = 4;}
        else if (statement.indexOf("") >= 0){responseNum = 5;}
        else if (statement.indexOf("") >= 0){responseNum = 6;}
        else{response = getRandomResponse();}
        switch(responseNum){
            case 0: response = "Why so negative?"; break;
            case 1: response = "Tell me more about your family!"; break;
            case 2: response = "What about Robots."; break;
            case 3: response = "I wish I had a pet."; break;
            case 4: response = "He sounds like a greate teacher!"; break;
            case 5: response = "She sounds like a good teacher!"; break;
            case 6: response = "Tell me more about your family!"; break;
        }
        return response;
    }

    private String getRandomResponse(){
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        switch(whichResponse){
            case 0: response = "Interesting, tell me more."; break;
            case 1: response = "Hmmm."; break;
            case 2: response = "Do you really think so?"; break;
            case 3: response = "You don’t say."; break;
            case 4: response = "You don’t say."; break;
            case 5: response = "WOW!"; break;
        }
        return response;
    }
}