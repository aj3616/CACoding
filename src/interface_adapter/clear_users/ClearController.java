package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearInputInteractor;
    public ClearController(ClearInputBoundary clearInputInteractor){
        this.clearInputInteractor = clearInputInteractor;
    }

    public void clear(){
        clearInputInteractor.clear();
    }
}
