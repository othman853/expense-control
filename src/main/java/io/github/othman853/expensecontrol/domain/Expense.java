package io.github.othman853.expensecontrol.domain;


import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Expense {

    public final Double value;
    public final String description;
    public final LocalDate date;

}
