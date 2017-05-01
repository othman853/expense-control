package io.github.othman853.expensecontrol.services;

import io.github.othman853.expensecontrol.domain.Expense;
import io.github.othman853.expensecontrol.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    @Autowired
    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public Expense findOne() {
        return repository.findOne();
    }

}
