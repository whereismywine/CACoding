package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

import java.util.ArrayList;

// TODO Complete me
public class ClearController {

    final ClearInputBoundary userClearUseCaseInteractor;

    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;

    }
    public ArrayList execute() {
        ClearInputData clearInputData = new ClearInputData();
        return userClearUseCaseInteractor.execute(clearInputData);
    }

}
