package workshop.models.projects;

import java.math.BigDecimal;

public class FinalizedProjectDTO {

    private String name;

    private String description;

    private BigDecimal payment;

    public FinalizedProjectDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Project Name: " + this.name + System.lineSeparator() +
                "   Description: " + this.description + System.lineSeparator() +
                "   " + this.payment;
    }
}
