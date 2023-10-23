package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }
    @Override
    public ArrayList<String> execute(ClearInputData clearInputData) {
        return userDataAccessObject.clear();
    }
}
