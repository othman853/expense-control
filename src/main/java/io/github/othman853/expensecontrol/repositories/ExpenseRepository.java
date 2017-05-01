package io.github.othman853.expensecontrol.repositories;

import io.github.othman853.expensecontrol.domain.Expense;
import org.springframework.stereotype.Repository;

import static java.time.LocalDate.now;

@Repository
public class ExpenseRepository {

    public Expense findOne() {
        return new Expense(1d, "Expense", now());
    }

}
