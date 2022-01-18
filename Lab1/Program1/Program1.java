class Main{
    public static void main(String args[]){
        int ALLsecounds = 365*24*60*60;
        int birth = ALLsecounds/7;
        int death = ALLsecounds/13;
        int imgrant = ALLsecounds/45;
        int population = 312032486;
        population+=birth-death+imgrant;
        System.out.println("The population after next 1 year is " + (int)(population));
        population+=birth-death+imgrant;
        System.out.println("The population after next 2 years is " + (int)(population));
        population+=birth-death+imgrant;
        System.out.println("The population after next 3 years is " + (int)(population));
        population+=birth-death+imgrant;
        System.out.println("The population after next 4 years is " + (int)(population));
        population+=birth-death+imgrant;
        System.out.println("The population after next 5 years is " + (int)(population));
    }
}