package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private boolean useCaseFailed;

    private String message;

    public ClearOutputData(boolean useCaseFailed, String message){
        this.useCaseFailed = useCaseFailed;
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
