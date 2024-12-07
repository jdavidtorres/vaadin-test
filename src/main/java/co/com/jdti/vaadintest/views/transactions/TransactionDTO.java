package co.com.jdti.vaadintest.views.transactions;

public record TransactionDTO(String id,
                             String description,
                             String amount,
                             String date) {
}
