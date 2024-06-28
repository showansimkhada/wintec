package com.showansimkhada.quiz;

public class QuestionsAndAnswers {

    // creating the questions
    public String Questioins[] = {
            "Which is the highest Mountain in Nepal?",
            "Which ocean forms a natural border of Nepal?",
            "Which famous temple dedicated to Mother Sita is located in the Janakpur Zone? ",
            "What is the capital of Nepal?",
            "Nepal is located between what two countries?",
            "Where is Nepal?",
            "Of the ten highest mountain peaks in the world, how many can be found in Nepal?",
            "Who of the following was born in Nepal?",
            "Which of these is not a natural hazard in Nepal?",
            "What is the currency used in Nepal?"};

    // creating the options for the answers
    public String Choices[][] = {
            {"Mt. Veritall", "Mt. Everest", "K2", "Mt. Marcy"},
            {"The Atlantic Ocean", "The Arctic Ocean", "None of these", "The Indian Ocean"},
            {"Janki Temple", "Dakshinkali Temple", "Pashupati Nath Temple", "Mukthi Nath Temple"},
            {"Himalayas", "Mt. Everest", "Rupee", "Kathmandu"},
            {"Afghanistan and Pakistan", "Kathmandu and Himalayas", "Great Britain and Tibet", "India and China"},
            {"In Asia with a coastline on the Arabian Sea", "In Africa with a coastline on the Atlantic Ocean", "In Asia between India and China", "In Africa between Cameroon and Sudan"},
            {"Ten", "All of life is an illusion", "One", "Eight"},
            {"Che Guevara", "Moses", "Confucius", "Buddha"},
            {"Severe thunderstorms", "Flooding", "Landslides", "Volcanoes"},
            {"The pound", "Large stone coins", "The baht", "The rupee"}};

    // storing the correct answer
    public String Answers[] = {
            "Mt. Everest",
            "None of these",
            "Janki Temple",
            "Kathmandu",
            "India and China",
            "In Asia between India and China",
            "Eight",
            "Buddha",
            "Volcanoes",
            "The rupee"};

    public String getQuestioins(int x)
    {
        String question = Questioins[x];
        return question;
    }

    public String getChoice1(int x)
    {
        String choice = Choices[x][0];
        return choice;
    }

    public String getChoice2(int x)
    {
        String choice = Choices[x][1];
        return choice;
    }

    public String getChoice3(int x)
    {
        String choice = Choices[x][2];
        return choice;
    }

    public String getChoice4(int x)
    {
        String choice = Choices[x][3];
        return choice;
    }

    public String getAnswer(int x)
    {
        String answer = Answers[x];
        return answer;
    }
    
}
