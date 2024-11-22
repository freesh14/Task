package Task;

public class TextCounter {
    private int numberOfChar = 0;
    private int numberOfRow = 0;

    public void count(String input){
        if(input!=null && !input.equalsIgnoreCase("stop")){
            numberOfChar += input.length(); // lägg till teckenlängden för raden
            numberOfRow++; // öka antalet rader
        }
    }
    public int getNumberOfChar(){
        return  numberOfChar;

    }
    public int getNumberOfRow(){
        return numberOfRow;
    }

}
