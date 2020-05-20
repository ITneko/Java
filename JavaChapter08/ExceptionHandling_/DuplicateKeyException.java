package ExceptionHandling_;

public class DuplicateKeyException extends Exception {
	DuplicateKeyException(String message){
		super(message);
	}
}
