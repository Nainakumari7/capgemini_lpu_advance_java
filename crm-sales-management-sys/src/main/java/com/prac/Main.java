package com.prac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();

        CustomerService customerService = new CustomerService(em);
        LeadService leadService = new LeadService(em);
        ProductService productService = new ProductService(em);
        OrderService orderService = new OrderService(em);
        TicketService ticketService = new TicketService(em);
        ReportService reportService = new ReportService();

        Customer customer = new Customer();
        customer.setName("Naina");
        customer.setEmail("naina@gmail.com");
        customer.setPhone("9876543210");

        customerService.addCustomer(customer);
        System.out.println("Customer added");

        Lead lead = new Lead();
        lead.setSource("Website");
        lead.setStatus("New");

        leadService.addLead(lead);
        System.out.println("Lead added");

        Product product = new Product();
        product.setProductName("Mobile");
        product.setPrice(25000);

        productService.addProduct(product);
        System.out.println("Product added");

        Order order = new Order();
        order.setQuantity(1);

        orderService.placeOrder(order);
        System.out.println("Order placed");

        SupportTicket ticket = new SupportTicket();
        ticket.setIssue("Delivery delayed");
        ticket.setStatus("Open");

        ticketService.raiseTicket(ticket);
        System.out.println("Support ticket raised");

        reportService.generateReport();

        em.close();
        emf.close();
    }
}