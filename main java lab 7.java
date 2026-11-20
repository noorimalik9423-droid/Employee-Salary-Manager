public class Main {

    // Returns the salary, which is hours multiplied by the hourly rate.
    public static int calculateSalary(int hours, int rate) {
        return hours * rate;
    }

    // Returns "High" for 50000 or more, "Medium" for 30000 or more, else "Low".
    public static String getCategory(int salary) {
        if (salary >= 50000) {
            return "High";
        } else if (salary >= 30000) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    // Returns true only when the hours are between 0 and 60 (both included).
    public static boolean isValid(int hours) {
        return hours >= 0 && hours <= 60;
    }

    public static void main(String[] args) {
        String[] names = {"Hina", "Omar", "Zara", "Bilal"};
        int[] hours = {40, 25, 70, 55};
        int rate = 1000;

        int validCount = 0;
        int totalSalary = 0;

        for (int i = 0; i < names.length; i++) {
            if (!isValid(hours[i])) {
                System.out.println("Invalid hours for " + names[i]);
                continue;
            }
            int salary = calculateSalary(hours[i], rate);
            System.out.println(names[i] + ": " + hours[i] + " hours, Rs "
                    + salary + " " + getCategory(salary));
            validCount++;
            totalSalary += salary;
        }

        double average = validCount > 0 ? (double) totalSalary / validCount : 0.0;
        System.out.println("Valid employees: " + validCount);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Average salary: " + average);
    }
}
