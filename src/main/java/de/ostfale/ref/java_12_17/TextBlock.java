package de.ostfale.ref.java_12_17;

/**
 * Highlight:
 * + last line defines number of spaces
 * + escape sequence:  \ allows to split lines without a line break in display
 * + escape sequence: \s keeps whitespaces after string (default = delete and replace with \n
 * + possible placeholder with %s and %d -> formatted()
 */

public class TextBlock {

    static void main() {
        TextBlock tb = new TextBlock();
        tb.formattingExample();
        tb.escapingExample();
        tb.placeholderExample();

    }

    private void formattingExample() {
        System.out.println("\n**** Formatting example **** \n");
        simpleTextBlockWithIndentation();
        simpleTextBlockWithoutIndentation();
        javaScriptExample();
        jsonExample();
    }

    private void escapingExample() {
        System.out.println("\n**** Escaping example **** \n");
        escapeWithBackslashExample();
        escapeWithBackslashWhitespaceExample();
    }

    private void placeholderExample() {
        System.out.println("\n**** Placeholder example **** \n");
        placeHolderJson("Louis");
    }

    private void simpleTextBlockWithIndentation() {
        System.out.println("""
                  - This is a -
                  - Text block -
                """);                               // lower quotation marks determine indentation -> 2 chars here + always new line
    }

    private void simpleTextBlockWithoutIndentation() {
        System.out.println("""
                - This is a -
                - Text block -""");                // no indentation here and no new line
    }

    private void javaScriptExample() {
        String javaScriptText = """
                function hello() {
                    print("Hello, world!");
                    print("Hava a nice day");
                }
                hello();""";
        System.out.println(javaScriptText);

    }

    private void jsonExample() {
        String jsonText = """
                {
                    "version": "Java 17 LTS",
                    "feature": "text blocks"
                }""";
        System.out.println(jsonText);
    }

    private void escapeWithBackslashExample() {    // escape with \ to avoid a line break
        String escapeText = """
                Split string here \
                but not when printed!
                """;
        System.out.println(escapeText);
    }

    private void escapeWithBackslashWhitespaceExample() {    // escape with \ to avoid a line break
        String notEscapeText = """
                Tim    
                Peter  
                Frank  """;

        String escapedText = """
                Tim     \s
                Peter   \s
                Frank  \s   """;


        System.out.println(notEscapeText);
        System.out.println(escapedText);
    }

    private void placeHolderJson(String name) {
        String jsonText = """
                        {
                            "name": "%s"
                        }""".formatted(name);
        System.out.println(jsonText);
    }

}
