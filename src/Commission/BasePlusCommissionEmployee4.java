package Commission;

public class BasePlusCommissionEmployee4 {

        private CommissionEmployee3 commissionEmployee; // composition
        private double baseSalary; // base salary per week

        // six-argument constructor
        public BasePlusCommissionEmployee4( String first, String last, String ssn,
                                            double sales, double rate, double salary ){
            commissionEmployee = new CommissionEmployee3( first, last, ssn, sales, rate );

            setBaseSalary( salary ); // validate and store base salary
        }
        // end six-argument BasePlusCommissionEmployee4 constructor

            // set first name
        public void setFirstName( String first ){
            commissionEmployee.setFirstName( first );
        } // end method setFirstName

        // return first name
        public String getFirstName() {
            return commissionEmployee.getFirstName();
        } // end method getFirstName
        // set last name
        public void setLastName( String last ) {
            commissionEmployee.setLastName(last);
        } // end method setLastName

        // return last name
        public String getLastName() {
            return commissionEmployee.getLastName();
        } // end method getLastName
        // set social security number
        public void setSocialSecurityNumber( String ssn ) {
            commissionEmployee.setSocialSecurityNumber(ssn);
        } // end method setSocialSecurityNumber
     // return social security number
     public String getSocialSecurityNumber() {
         return commissionEmployee.getSocialSecurityNumber();
     } // end method getSocialSecurityNumber

         // set commission employee's gross sales amount
         public void setGrossSales( double sales ) {
             commissionEmployee.setGrossSales(sales);
         } // end method setGrossSales

        // return commission employee's gross sales amount
        public double getGrossSales() {
            return commissionEmployee.getGrossSales();
        } // end method getGrossSales

         // set commission employee's rate
         public void setCommissionRate( double rate ) {
             commissionEmployee.setCommissionRate(rate);
         } // end method setCommissionRate

         // return commission employee's rate
         public double getCommissionRate() {
             return commissionEmployee.getCommissionRate();
         } // end method getCommissionRate
        // set base-salaried commission employee's base salary
            public void setBaseSalary( double salary ) {
                baseSalary = (salary < 0.0) ? 0.0 : salary;
            } // end method setBaseSalary

         // return base-salaried commission employee's base salary
        public double getBaseSalary() {
            return baseSalary;
        } // end method getBaseSalary

         // calculate base-salaried commission employee's earnings
         public double earnings() {
             return getBaseSalary() + commissionEmployee.earnings();
         } // end method earnings

         // return String representation of BasePlusCommissionEmployee4
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary());
    } // end method toString
 } // end class BasePlusCommissionEmployee4