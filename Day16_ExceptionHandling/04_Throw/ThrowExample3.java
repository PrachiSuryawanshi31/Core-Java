class ThrowExample3 
{
    public static void main(String[] args) 
    {

        int balance = 5000;
        int withdrawAmount = 7000;

        try {
            if (withdrawAmount > balance) 
            {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
        
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}


// This program demonstrates the use of the 'throw' keyword inside a try block.
// If the withdrawal amount is greater than the available balance,
// an ArithmeticException is manually thrown using 'throw'.
// When the exception is thrown, normal execution stops
// and control transfers to the catch block for handling.
// After handling the exception, the program continues normally.
