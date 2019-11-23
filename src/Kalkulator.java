public class Kalkulator {

    private float firstNumber;
    private float secondNumber;

    public Kalkulator(float firstNb, float secondNB){
        firstNumber =firstNb;
        secondNumber = secondNB;
    }
    public float multiplication(){
        return firstNumber*secondNumber;
    }

    public float division(int switcher) {
        switch(switcher) {
            case 1:{
                try {
                    return firstNumber/secondNumber;
                }catch (ArithmeticException e) {
                    System.out.println("Dzielenie przez zero");
                }
            }
            case 2:{
                try {
                    return secondNumber/firstNumber;
                }catch (ArithmeticException e) {
                    System.out.println("Dzielenie przez zero");
                }
            }
            default:{
                return division(switcher);
            }
        }
    }


    public float divisionFirstBySecond(){
        return firstNumber/secondNumber;
    }
    public float divisionSecondByFirst(){
        return secondNumber/firstNumber;
    }
    public float addition(){
        return firstNumber+secondNumber;
    }

    public float substract(int switchech) {
        switch(switchech) {
            case 1:
                return secondNumber-firstNumber;

            case 2:
                return firstNumber-secondNumber;

            default:{
                System.out.println("Podales bledna liczbe");
                return substract(switchech);
            }
        }
    }

    public float power(int switcher, int index) {
        if (index==0)
            return 1;
        else {
            float result;
            switch(switcher) {
                case 1:{
                    result=firstNumber;
                    for(int i=1;i<index;i++){
                        result=result*result;
                    }
                    return result;
                }
                case 2:{
                    result=secondNumber;
                    for(int i=1;i<index;i++){
                        result=result*result;
                    }
                    return result;
                }
                default:{
                    System.out.println("Podales bledna liczbe");
                    return power(switcher, index);
                }
            }
        }
    }
    public double sqrt(int switcher) {
        switch(switcher){
            case 1:{
                return Math.sqrt(firstNumber);
            }
            case 2:{
                return Math.sqrt(secondNumber);
            }
            default:{
                return sqrt(switcher);
            }
        }
    }
}
