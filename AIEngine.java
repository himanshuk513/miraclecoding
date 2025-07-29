package com.miraclecoding;

public class AIEngine {

    public String generateCode(String prompt) {
        if (prompt.toLowerCase().contains("hello world")) {
            return "public class HelloWorld {\n    public static void main(String[] args) {\n        System.out.println(\"Hello, World!\");\n    }\n}";
        } else {
            return "// AI: Sorry, I can't generate this code yet.";
        }
    }
}
