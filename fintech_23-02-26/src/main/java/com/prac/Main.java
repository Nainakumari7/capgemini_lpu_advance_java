package com.prac;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CustomerDAO customerDAO = new CustomerDAO();
        BankAccountDAO accountDAO = new BankAccountDAO();
        TransactionDAO transactionDAO = new TransactionDAO();
        CardDAO cardDAO = new CardDAO();

        Customer customer = new Customer("Naina", "naina@gmail.com", "9876543210");
        customerDAO.save(customer);

        BankAccount account = new BankAccount(
                "ACC1001",
                "SAVINGS",
                new BigDecimal("50000")
        );
        accountDAO.save(account);

        accountDAO.linkToCustomer(1L, 1L);

        Transaction txn = new Transaction(
                "CREDIT",
                new BigDecimal("2000"),
                "Salary Credit",
                "ABC123"
        );
        transactionDAO.save(txn, 1L);

        Card card = new Card(
                "1234567890",
                "DEBIT",
                "VISA",
                LocalDate.parse("2026-02-23")
        );

        cardDAO.issueCard(card, 1L);
        cardDAO.assignCardToCustomer(1L, 1L);
        cardDAO.deactivateCard(1L);
    }
}