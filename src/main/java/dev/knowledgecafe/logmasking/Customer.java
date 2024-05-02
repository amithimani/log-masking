package dev.knowledgecafe.logmasking;

public class Customer {
    private String customerName;
    private int customerId;
    private String email;
    private String ssn_number;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn_number() {
        return ssn_number;
    }

    public void setSsn_number(String ssn_number) {
        this.ssn_number = ssn_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", email=" + email +
                ", ssn='" + ssn_number + '\'' +
                '}';
    }

    public Customer(String customerName, int customerId, String email, String ssn_number) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.email = email;
        this.ssn_number = ssn_number;
    }
}
