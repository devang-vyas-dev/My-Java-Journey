public class variable{
    public static void main(String[] args){
        // Variables are containers to store values and it conatins the value to be stored in the memory.
        // In Java we have to specify the datatype of the variable but there is a way we can use var keyword
        int myNum = 23; //This is an Integer variable
        double price = 19.99; //This is a Double datatype it takes point values
        char alpHabet = 'A'; //This is a char Datatype it takes single character and stores 
        long debt = 900000; //This is the long datatype it stores big values 
        boolean isSleeping = true; //This is the Boolean it takes the True or False
        float pi = 3.141f; //This stores the shorter point values.
        System.out.println("This is the Example of Float Value: "+ pi);
        System.out.println("This is the Example of Boolen Value: "+ isSleeping);       
        System.out.println("This is the Example of Long: "+ debt);
        System.out.println("This is the Example of the char operator in Java: "+ alpHabet);
        System.out.println("This is the Example of Double: "+ price);
        System.out.println("This is the Example of Integer Type: "+ myNum);

        // We have Another Keyword for declaring variable and that is var keyword
        var x = 45; //This automatically declares datatypes based on values
        System.out.println(x);
    }
}
