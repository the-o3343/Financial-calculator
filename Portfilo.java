public class Portfilo {
    public static void main(String[] args) {
        System.out.println("This is a portfolio; a financial calculator. The purpose of this program is to creat a accurate calculation of one's income, and understand the money they spend on each category. It also suggests when a category spent too much using booluain operations to suggest if someone is spending to much omney based on the imcome of their expenses ");

    String name = "Josh";
    String address = "143 randomstreet ave Vancouver, WA 98644";
    int age = 35;
    double monthlyIcome = 1034.54;
    double taxRate = 0.22;
    double taxAmount = monthlyIcome * taxRate;
    double netIcome = monthlyIcome -taxAmount;
    double waterbill = 80, electricityBill = 95, carInsurance = 222.45, phoneBill = 75, startbucks = 45, foodExpense = 200, rent = 2500;

    double totalExpenses = waterbill + electricityBill + carInsurance + phoneBill + startbucks + foodExpense +rent;
    double leftOver = netIcome -totalExpenses;

    System.out.println("heelo josh, here is your monthly spending");
        System.out.println("name:" +name);
        System.out.println("age: " + age);
        System.out.println("address: " +address);
        System.out.println("monthly icome: " + monthlyIcome);
        System.out.println("tax rate " + taxRate +"%");
        System.out.println("total tax " +taxAmount);
        System.out.println("net income: " + netIcome);
        System.out.println("Water bill: " + waterbill);
        System.out.println("Food bill: " + foodExpense);
        System.out.println("Phone bill: " +phoneBill);
        System.out.println("Electricity bill: " + electricityBill);
        System.out.println("Car insurance: " +carInsurance);
        System.out.println("Startbucks: " + startbucks);
        
        System.out.println("total expense " + totalExpenses);
        System.out.println( "left over: " + leftOver);


    
        if (netIcome > totalExpenses){
            System.out.println("Your account is good consiton ");
        } else {
            System.out.println("Your accont dose not have the funt to support that live style");
        }
        System.out.println("Your eligible for: ");


        //  are you eligible for social securityx
        if (netIcome -totalExpenses > 5000){
            System.out.println("you are not eligible for social Security benifits ");
        } else if (netIcome-totalExpenses < 5000){
            System.out.println("your eligible for Social Security");
        }


        // is your spending good?
        double necessity = foodExpense + waterbill + electricityBill;
        if (necessity > netIcome * 0.50) {
            System.out.println("your total net income will not be able to support your needs. You might want to ajust your extra funds to support your needs first" );
        }else{
            System.out.println("your necessity bill for your monthly bill is in the write recommendation");
        }

        }
        
    }
