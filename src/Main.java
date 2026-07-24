public class Main
{
    public static void main(String[] args)
    {

        String make = "BMW";
        String model = "530D";
        double engineSize = 3.0;
        byte gear = 2;
        short speed = (short) (gear * 20);

        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        System.out.println("The speed is " + speed);

        if(engineSize > 1.3){
            System.out.println("The car is powerful");
        }
        else{
            System.out.println("The car is weak");
        }

        int flag=(engineSize>1.3)?1:0;
        switch(flag){
            case 1:
                System.out.println("The car is powerful");
                break;

            case 0:
                System.out.println("The car is weak");
                break;
        }

        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


    }
}