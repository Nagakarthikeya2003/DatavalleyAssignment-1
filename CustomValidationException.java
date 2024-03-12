class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

class Validator {
    public void validateNumber(int num) throws CustomValidationException {
        if (num < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}

public class CustomValidation {
    public static void main(String[] args) {
        Validator validator = new Validator();
        int inputN = -7;

        try {
            validator.validateNumber(inputN);
            System.out.println("Number is valid");
        } catch (CustomValidationException e) {
            System.out.println("CustomValidationException: " + e.getMessage());
        }
    }
}
