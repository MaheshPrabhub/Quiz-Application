package com.example.myapplication;

public class QuestionAnswer {


    public static String question[] ={

            "Which one is not the programming language?",
            "In C,which function is often used to output values and print text?",
            "In C,Which format specifier is often used to print integers?",
            "In C,Which operator can be used to compare two values?",
            "In C,Which keyword can be used to make a variable unchangeable/read-only?",
            "An Array index starts with?",
            "How do you call a function in C?",
            "In C,Which keyword is used to create a structure?",
            "In C,Which keyword is used to return values inside a function?",
            "Which company owns the android?"
    };

    public static String choices[][] = {

            {"Java","Kotlin","Notepad","Python"},
            {"write()","printf()","output()","printword()"},
            {"%c","%f","%s","%d"},
            {"=","<>","><","=="},
            {"final","constant","readonly","const"},
            {"0","1","2","3"},
            {"myFunction[]","myFunction()","myFunction","(myFunction)"},
            {"str","structs","struct","structure"},
            {"void","get","break","return"},
            {"Google","Apple","Nokia","Samsung"}

    };

    public static String correctAnswers[] = {

            "Notepad",
            "printf()",
            "%d",
            "==",
            "const",
            "0",
            "myFunction()",
            "struct",
            "return",
            "Google"
    };

}
