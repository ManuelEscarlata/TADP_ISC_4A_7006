public class Logica {
    private int num1;
    private int num2;
    private double resultado;
    private String op;
    
    public Logica(String operacion){
        this.op=operacion;
    }
    
    public void descifrarOperacion(){
        switch (op) {
            case "+":
                resultado=num1+num2;
                break;
            case "*":
                resultado=num1*num2;
                break;
            case "/":
                if (num2==0) {
                    resultado=-0;
                }else{
                    resultado=num1/num2;  
                }
                break;
            case "-":
                resultado=num1-num2;
                break;
            case "^":
                resultado=Math.pow(num1, num2);
                break;
            default:
                break;
        }
    }
    public String getResultado(){
        String resulta=""+resultado;
        return resulta;
    }
    public void setNum1(int num){
        this.num1=num;
    }
    public void setNum2(int num){
        this.num2=num;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    } 
}
