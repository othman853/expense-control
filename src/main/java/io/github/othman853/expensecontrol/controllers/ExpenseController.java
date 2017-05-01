package io.github.othman853.expensecontrol.controllers;

import io.github.othman853.expensecontrol.domain.Expense;
import io.github.othman853.expensecontrol.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ExpenseController {

    private final ExpenseService service;

    @Autowired
    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @RequestMapping(path = "/expense", method = GET)
    public Expense getHelloWorldExpense() {
        return service.findOne();
    }

}
