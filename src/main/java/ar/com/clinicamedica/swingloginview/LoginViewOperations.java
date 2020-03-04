package ar.com.clinicamedica.swingloginview;

import ar.com.clinicamedica.controller.LoginOperationsController;

public interface LoginViewOperations {
      public void startView();
      public void close();
      public void setController(LoginOperationsController controller);
      public void showError(String err);
}
