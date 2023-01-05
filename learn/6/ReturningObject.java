public class ReturningObject {

    public static void main(String[] args) {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.getErrorInfo(1).displayError();
        errorInfo.getErrorInfo(3).displayError();
        errorInfo.getErrorInfo(60).displayError();
        Err error0 = errorInfo.getErrorInfo(0);
        error0.displayError();
        
        
    }

    static class Err {
        private String message;
        private int severity;
        Err(String message, int severity) {
            this.message = message;
            this.severity = severity;
        }
        public void displayError() {
            System.out.println( "[Error]: " + message + " [Severity]: " + severity );
        }
    }

    static class ErrorInfo {
        String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
        };
        int howbad[] = { 3, 3, 2, 4 };

        Err getErrorInfo(int i) {
            if(i >= 0 & i < msgs.length)
                return new Err(msgs[i], howbad[i]);
            else
                return new Err("Invalid Error Code", 0);
        }
    }
}
