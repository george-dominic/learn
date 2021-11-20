package com.example.georgedominic.learn.test1;

/**
 * Created by George on 25-03-2018.
 */

public class questions {

    public String mQuestions[]=
            {
                    "The length of the bridge, which a train 130 metres long and travelling at 45 km/hr can cross in 30 seconds, is:",
                    "A jogger running at 9 kmph alongside a railway track in 240 metres ahead of the engine of a 120 metres long train running at 45 kmph in the same direction. In how much time will the train pass the jogger?",
                    "From a point P on a level ground, the angle of elevation of the top tower is 30º. If the tower is 100 m high, the distance of point P from the foot of the tower is:",
                    "How much time will it take for an amount of Rs. 450 to yield Rs. 81 as interest at 4.5% per annum of simple interest?",
                    "A sum of money amounts to Rs. 9800 after 5 years and Rs. 12005 after 8 years at the same rate of simple interest. The rate of interest per annum is:",
                    "A man buys a cycle for Rs. 1400 and sells it at a loss of 15%. What is the selling price of the cycle?",
                    "Odometer is to mileage as compass is to",
                    "SCD, TEF, UGH, ____, WKL",
                    "Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?",
                    "Tanya is older than Eric.\n" + "Cliff is older than Tanya.\n" + "Eric is older than Cliff.\n" + "If the first two statements are true, the third statement is",
                    "When they heard news of the hurricane, Maya and Julian decided to change their vacation plans. Instead of traveling to the island beach resort, they booked a room at a fancy new spa in the mountains. Their plans were a bit more expensive, but they'd heard wonderful things about the spa and they were relieved to find availability on such short notice.",
                    "Find the correctly spelt word.",
                    "Find out any grammatical error in the following sentences",
                    "Choose the word which is the exact OPPOSITE of the given words.\n" + "EXODUS",
                    "Choose the word which best expresses the meaning of the given word.\n"+"EMBEZZLE",
                    "When he\n" +
                            "P :\tdid not know\n" +
                            "Q :\the was nervous and\n" +
                            "R :\theard the hue and cry at midnight\n" +
                            "S :\twhat to do\n" +
                            "The Proper sequence should be:",

            };



    public String mChoices[][]={{ "200m","225m","245m","250m"},
            {"3.6 sec","18 sec","36 sec","72 sec"},
            {"145m","152m","173m","196m"},
            {"3.5 years","4 years", "4.5 years","5 years"},
            {"5%","8%", "12%","15%"},
            {"Rs. 1090","Rs. 1160","Rs. 1190","Rs. 1202"},
            {"speed","hiking","needle","direction"},
            {"CMN","UJI","VIJ","IJT"},
            {"7","10","12","13"},
            {"true","false","uncertain","none of the above"},
            {"Maya and Julian take beach vacations every year.","The spa is overpriced.","It is usually necessary to book at least six months in advance at the spa.","Maya and Julian decided to change their vacation plans because of the hurricane."},
            {"Efficient","Treatmeant","Beterment","Employd"},
            {"Having received your letter","this morning, we are writing","to thank you for the same.","No error."},
            {"Influx","Home-coming","Return","Restoration"},
            {"Misappropriate","Balance","Remunerate","Clear"},
            {"RQPS","QSPR","SQPR","PQRS"},



    };


    private String mCorrectAnswers[]={"245m","36 sec","173m","4 years","12%","Rs. 1190","direction","VIJ","10","false","Maya and Julian decided to change their vacation plans because of the hurricane.","Efficient","No error.","Influx","Misappropriate","RQPS"};

    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String Choice= mChoices[a][0];
        return Choice;
    }
    public String getChoice2(int a){
        String Choice= mChoices[a][1];
        return Choice;
    }
    public String getChoice3(int a){
        String Choice= mChoices[a][2];
        return Choice;
    }
    public String getChoice4(int a){
        String Choice= mChoices[a][3];
        return Choice;
    }


    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }


}
