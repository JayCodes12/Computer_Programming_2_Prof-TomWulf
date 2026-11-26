public class Worker extends Person {

        private double hourlyPayRate;

        public Worker(String firstName, String lastName, String ID,
                      String title, int YOB, double hourlyPayRate) {

                super(firstName, lastName, ID, title, YOB);
                this.hourlyPayRate = hourlyPayRate;
        }

        public double getHourlyPayRate() {
                return hourlyPayRate;
        }

        public double calculateWeeklyPay(double hoursWorked) {

                if (hoursWorked <= 40) {
                        return hoursWorked * hourlyPayRate;
                }

                double regularPay = 40 * hourlyPayRate;
                double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;

                return regularPay + overtimePay;
        }

        public void displayWeeklyPay(double hoursWorked) {

                double regularHours = Math.min(40, hoursWorked);
                double overtimeHours = Math.max(0, hoursWorked - 40);

                double regularPay = regularHours * hourlyPayRate;
                double overtimePay = overtimeHours * hourlyPayRate * 1.5;

                System.out.println("Worker: " + fullName());
                System.out.println("Regular Hours: " + regularHours +
                        " Pay: $" + regularPay);
                System.out.println("Overtime Hours: " + overtimeHours +
                        " Pay: $" + overtimePay);
                System.out.println("Total Weekly Pay: $" +
                        (regularPay + overtimePay));
                System.out.println();
        }

        @Override
        public String toCSV() {
                return super.toCSV() + "," + hourlyPayRate;
        }

        @Override
        public String toJSON() {
                return super.toJSON().replace("}",
                        ", \"hourlyPayRate\": " + hourlyPayRate + "}");
        }

        @Override
        public String toXML() {
                return super.toXML() +
                        "<hourlyPayRate>" +
                        hourlyPayRate +
                        "</hourlyPayRate>";
        }
}