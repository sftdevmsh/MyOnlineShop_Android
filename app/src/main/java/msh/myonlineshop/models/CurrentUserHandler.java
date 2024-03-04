package msh.myonlineshop.models;

public class CurrentUserHandler {
    private static User currentUser;

    public void setCurrentUser(User currentUser) {
        CurrentUserHandler.currentUser = currentUser;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static boolean IsLoggedIn() {
        return getCurrentUser() != null &&
                getCurrentUser().getToken() != null &&
                !getCurrentUser().getToken().equals("");
    }
}
