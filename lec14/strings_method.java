public class strings_method {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.print("The string's length is ");
        System.out.println(value);
        System.out.print("The string in all lowercase: ");
        System.out.println(name.toLowerCase());
        System.out.print("The string in all uppercase: ");
        System.out.println(name.toUpperCase());
        String nonTrimmedString = "   fjdjddj kksjsjshsgdv           harry harry     ";
        System.out.println(nonTrimmedString);
        System.out.print("Trimmed String: ");
        System.out.println(nonTrimmedString.trim());
        System.out.print("A Substring: ");
        System.out.println(name.substring(2));
        System.out.print("Another substring: ");
        System.out.println(name.substring(2, 4));
        System.out.print("Replace example: ");
        System.out.println(name.replace('r', 'p'));
        System.out.print("          : ");
        System.out.println(name.replace("rry", "ier"));
        System.out.print("Does starts with: ");
        System.out.println(name.startsWith("Ha"));
        System.out.print("Does ends with: ");
        System.out.println(name.startsWith("ry"));
        System.out.print("Char at: ");
        System.out.println(name.charAt(4));
        System.out.print("Index of: ");
        System.out.println(name.indexOf('y'));
        System.out.println(name.indexOf('y', 3));
        System.out.print("Last index of: ");
        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.lastIndexOf('r', 3));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("HarRy"));
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \n new line");
        System.out.println("I am escape sequence \t tab");
        System.out.println("I am escape sequence \' single quote");
    }
}
