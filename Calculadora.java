
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;
    private int rdo;
    private int base, exponente;
    private Operacion op;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        num1 = 0;
        num2 = 0; 
        op=op.SUMA;
        
    }
    
    public void ponNum1(int n1)
    {
        // put your code here
        this.num1=n1;
    }
    
    public void ponNum2(int n2)
    {
        // put your code here
        this.num2=n2;
    }

    public void ponBase(int base)
    {
        // put your code here
             this.base = base;
        
    }
    
    public void ponExponente(int exponente)
    {
        // put your code here
             this.exponente = exponente;
        
    }
    
    public void opera()
    {
        switch(op){
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                break;
            case DIVIDE:
                rdo=num1/num2;
                break;
            
            case POTENCIA:
                rdo=(int)Math.pow(base,exponente);
                break;
            case RAIZ:
                rdo=(int)Math.pow(num1,1/num2); 
                break;
            case FACTORIAL:
                for(int Factorial = 1 ; Factorial <=num1; num1++)
                num1 *= Factorial;
                break;  
            case LOG:
                    rdo=(int)Math.log10(num1);
                    break;
            
                
        }
    }
    public void ponOperacion(String opera){
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        case "POTENCIA":
            op=op.POTENCIA;
            break;
        case "RAIZ": 
            op=op.RAIZ;
            break;
        case "FACTORIAL": 
            op=op.FACTORIAL;
            break;
            case "LOG":
            op=op.LOG;
            break;    
            
        }
    }
    public int dameResultado()
    {
        // put your code here
        return rdo;
    }
    
    public void muestraTodosResultados(){
        System.out.println("Num1="+Integer.toString(num1)+" Num2=" + Integer.toString(num2));
        System.out.println("Suma :" + Integer.toString(num1+num2));
        System.out.println("Resta :"+ Integer.toString(num1-num2));
        System.out.println("Multiplica :" + Integer.toString(num1*num2));
        System.out.println("Divide :"+ Integer.toString(num1/num2));
        System.out.println("Potencia:" + Integer.toString(rdo=(int)Math.pow(num1,num2)));
        System.out.println("Raiz :" + Integer.toString(rdo=(int)Math.pow(num1,1/num2)));
        System.out.println("LOG : " + Integer.toString(rdo=(int)Math.log10(num1)));
    }
}
