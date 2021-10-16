public class RajeshPatel {
    static String name = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
    public static void main(String[] args){
        //remove spaces from given string
        System.out.println(name.replaceAll("\\s",""));

        //remove digits from given string
        System.out.println(name.replaceAll("\\d",""));

        //extract numbers from given string
        System.out.println(name.replaceAll("[^0-9]",""));

        //remove word 'Java' from given string
        System.out.println(name.replaceAll("Java",""));

        //remove special characters from given string
        System.out.println(name.replaceAll("[^a-zA-Z0-9]",""));

        //convert to upper case given string
        System.out.println(name.toUpperCase());

        //convert to lower case given string
        System.out.println(name.toLowerCase());
        //find length of string given string
        System.out.println(name.length());

        //find index of P in given string
        System.out.println(name.indexOf("P"));
        //remove word Patel's in given string
        System.out.println(name.replaceAll("Patel's",""));}
}
