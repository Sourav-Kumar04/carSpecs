class TestStrings {

    public static void main(String[] args) {

        String filename = "example.doc";
        filename = "example.bak";

        String one = "Hello";
        String two = "Goodbye";

        if (one.equals(two)) {
            System.out.println("The two strings are equal.");
        }
        else if (one.compareTo(two) < 0) {
            System.out.println(one + " comes before " + two);
        }
        else {
            System.out.println(two + " comes before " + one);
        }

        String phrase = "the quick brown fox swallowed down the lazy chicken";

        // Count occurrences of "ow"
        int countOfOw = 0;
        int index = phrase.indexOf("ow");
        System.out.println("index of ow" + index);
        while (index != -1) {
            countOfOw++;
            index = phrase.indexOf("ow", index + 1);
        }

        System.out.println ("ow occurs " + countOfOw + " times in "+ phrase);


        String text = "Live not on evil";
        text = text.replaceAll(" ", "").toLowerCase();
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

    }
}

