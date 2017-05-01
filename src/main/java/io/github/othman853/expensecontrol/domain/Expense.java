package io.github.othman853.expensecontrol.domain;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Expense {

    public final Double value;
    public final String description;
    @JsonSerialize(using = ToStringSerializer.class)
    public final LocalDate date;

}
