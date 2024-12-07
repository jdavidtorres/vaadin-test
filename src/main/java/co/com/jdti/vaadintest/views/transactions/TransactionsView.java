package co.com.jdti.vaadintest.views.transactions;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Transactions")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.LIST_SOLID)
public class TransactionsView extends Div implements AfterNavigationObserver {

    Grid<TransactionDTO> grid = new Grid<>();

    public TransactionsView() {
        addClassName("transactions-view");
        setSizeFull();
        grid.setHeight("100%");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid.addComponentColumn(this::createTransactionRow);
        add(grid);
    }

    private static TransactionDTO createTransaction(String id, String description, String amount, String date) {
        return new TransactionDTO(id, description, amount, date);
    }

    private HorizontalLayout createTransactionRow(TransactionDTO transaction) {
        HorizontalLayout card = new HorizontalLayout();
        card.addClassName("transaction-card");
        card.setSpacing(false);
        card.getThemeList().add("spacing-s");

        VerticalLayout body = new VerticalLayout();

        HorizontalLayout header = new HorizontalLayout();
        header.addClassName("transaction-card-header");
        header.setSpacing(false);
        header.getThemeList().add("spacing-s");

        Span description = new Span(transaction.description());
        description.addClassName("transaction-card-description");
        Span amount = new Span(transaction.amount());
        amount.addClassName("transaction-card-amount");
        Span date = new Span(transaction.date());
        date.addClassName("transaction-card-date");

        body.add(header, description, amount, date);
        card.add(body);

        return card;
    }

    @Override
    public void afterNavigation(AfterNavigationEvent afterNavigationEvent) {
        grid.setItems(createTransaction("1", "Lunch", "10.00", "2021-09-01"),
                createTransaction("2", "Dinner", "20.00", "2021-09-02"),
                createTransaction("3", "Breakfast", "5.00", "2021-09-03"),
                createTransaction("4", "Snack", "2.00", "2021-09-04"));
    }
}
