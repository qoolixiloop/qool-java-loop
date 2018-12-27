package ch09;


public class DivideByZeroException extends Exception
{
    public DivideByZeroException( )
    {
        super("Dividing by Zero!");
    }
	
    public DivideByZeroException(String message)
    {
        super(message);
    }
}
