package use_case.clear_users;

// TODO Complete me

import entity.UserFactory;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary clearOutputBoundary;
    final UserFactory userFactory;
    public ClearOutputData message;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary, UserFactory userFactory){
        this.clearOutputBoundary = clearOutputBoundary;
        this.clearUserDataAccessObject = clearUserDataAccessInterface;
        this.userFactory = userFactory;
    }

    @Override
    public void clear() {
        message = clearUserDataAccessObject.clear();
        clearOutputBoundary.prepareSuccessView(message);
    }
}
