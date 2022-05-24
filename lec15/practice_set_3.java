public class practice_set_3 {
    public static void main(String args[]) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To Lower Csae";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3

        String letter_template = "Dear <|name|>, thanks a lot";
        letter_template = letter_template.replace("<|name|>", "Harry");
        System.out.println(letter_template);

        // Problem 4

        String myString = "This string contains     double and triple spaces";
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("  "));

        // Problem 5
        String ltr = "Dear Harry,\n\tThis java course is nice.\n\tThanks!";
        System.out.println(ltr);
    }
}
