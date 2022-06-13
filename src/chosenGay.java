import java.util.*;

public class chosenGay {
    private final int attempts = 1000;
    private int numPerson;
    private int numDay;

    public chosenGay(){}

    public chosenGay(int numPerson, int numDay){
        this.numPerson = numPerson;
        this.numDay = numDay;
    }

    public double probability(){
        double p = 0;
        Random rand = new Random();
        Integer[][] twoDimArray = new Integer[attempts][numPerson];
        for(int i=0;i<attempts;i++){
            for(int j=0;j<numPerson;j++){
                twoDimArray[i][j] = 0;
            }
        }

        for(int i=0;i<attempts;i++){
            for(int j=0;j<numDay;j++){
                int r = rand.nextInt(numPerson);
                twoDimArray[i][r]++;
            }
        }

        for(int i = 0; i<attempts; i++){
            if(Arrays.asList(twoDimArray[i]).contains(0))
                p++;
        }

        return p/attempts;
    }
}
