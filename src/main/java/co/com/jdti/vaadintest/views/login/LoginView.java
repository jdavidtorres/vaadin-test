package co.com.jdti.vaadintest.views.login;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Login")
@Route("person-form")
@Menu(order = 1, icon = LineAwesomeIconUrl.USER)
public class LoginView extends Composite<VerticalLayout> {

    public LoginView() {
    }
}
