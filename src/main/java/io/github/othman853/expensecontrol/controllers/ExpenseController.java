package io.github.othman853.expensecontrol.controllers;

import io.github.othman853.expensecontrol.domain.Expense;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalDate.now;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ExpenseController {

    @RequestMapping(path = "/expense", method = GET)
    public Expense getHelloWorldExpense() {
        return new Expense(1d, "Hello World", now());
    }

}
