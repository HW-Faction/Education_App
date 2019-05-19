package studio.goldenapp.hr_d;

public class ScienceQuestions {

    public String mQuestions [] = {
            "The term “Heavy water” refers to:",
            "Trachoma is a disease of the",
            "The mass density of Kerosene is:",
            "One horse power is equal to:",
            "Optics is the study of:",
            "The process of dissolving an acid or a base in water is a highly",
            "Which of the following is the weakest force?",
            "The method of protecting iron from rusting, by coating a thin layer of Zinc is called:",
            "The material which can be deformed permanently by heat and pressure is called a:",
            "Which of the following elements is least electronegative?",
            "Which of the following in the human body is popularly called the Adam’s apple?",
            "Small pox is a deadly and highly contagious:",
            "SI unit of magnetic flux is:",
            "The pitch of the sound is measured by its:",
            "Which of the following acts as a resistance against disease in the body?",
            "Which of the following normally warms up faster when heat is applied?",
            "The person suffering from “myopia” cannot see the objects at:",
            "The pH of acid rain is",
            "Milk of magnesia is an example of a/an",
            "Tomato contains",
            "There are some substances whose odour changes in acidic or basic media. These are called",
            "The scientific name for common salt is",
            "Choose the word out of the following which is opposite meaning of \"Anonymous\"",
            "Choose the word out of the following which is opposite meaning of \"Assert\"",
            "Choose the word out of the following which is opposite meaning of \"Accord\"",
            "Choose the word out of the following which is similar meaning of \"grin\"",
            "Choose the word out of the following which is opposite meaning of \"baggy\"",
            "Choose the word out of the following which is opposite meaning of \"beautiful\"",
            "Choose the word out of the following which is opposite meaning of \"challenge\"",
            "There are ........ views on the issue of giving bonus to the employees.",
            "The defending champion justified his top ........ by clinching the title.",
            "Man who has committed such an ........ crime must get the most servere punishment.",
            "The judge used his ........ power and let him off with a reprimand.",
            "Who gave the Theory of Relativity?",
            "Which year man first landed on the moon?",
            "In space, the sky looks to an astronaut:",
            "Which of the following is also known by the name of red planet?",
            "Which of the following is also called Blue planet or Green planet?",
            "Where is the Headquarter of ISRO?",
            "Choose the word out of the following which is similar meaning of \"jet\"",
            "Choose the word out of the following which is similar meaning of \"joker\"",
            "Choose the word out of the following which is similar meaning of \"profit\"",
            "Choose the word out of the following which is opposite meaning of \"evil\""
    };


    private String mChoices [][] = {
            {"Ice", "Deuterium oxide", "Re-distilled water", "Water at 4\u00b0C"},
            {"Liver", "Eyes", "Heart", "Brain"},
            {"more than water", "less than water", "equal to water", "none of the above"},
            {"523 watts", "746 watts", "770 watts", "846 watts"},
            {"properties of light", "magnetism", "quantum brain", "psychology"},
            {"Exothermic reaction", "Endothermic reaction", "Sublimation reaction", "Redux reaction"},
            {"Electrostatic force", "Nuclear Force", "Electromagnetic Force", "Gravitational force"},
            {"Alloy", "Rancidity", "Galvanizing", "Pulverizing"},
            {"Polymer", "Thermoset", "Thermoplastic", "Chemical compound"},
            {"Sodium", "Oxygen", "Silver", "Lead"},
            {"Adrenal", "Thyroid", "Liver", "Thymus"},
            {"Bacterial Disease", "Fungal disease", "Vitamin deficiency disease", "Viral disease"},
            {"Weber", "Henry/meter", "Tesla", "Weber/meter"},
            {"Intensity", "Waveform", "Frequency", "Loudness"},
            {"Carbohydrates", "White corpuscles", "Vitamins", "Red corpuscles"},
            {"Water", "Glass", "Iron", "Wood"},
            {"Near distance", "Any distance", "Longer distance", "Close to eye"},
            {"more than 5.6", "less than 5.6", "more than 7", "equal to 6"},
            {"acid", "salt", "base", "none of all"},
            {"Acetic acid", "Citric acid", "Methanoic acid", "Oxalic acid"},
            {"Olfactory indicators", "Litmus indicator", "Gustatory indicators", "All of the above"},
            {"Sodium hydroxide", "Sodium chloride", "Ammonium chloride", "Sodium hydrogencarbonate"},
            {"desperate", "lonely", "known", "tools"},
            {"acquiesce", "desperate", "tools", "agree"},
            {"desperate", "dissent", "problems", "grief"},
            {"sadness", "smile", "solutions", "stabbing"},
            {"clean", "appetite", "desperate", "tight"},
            {"ugly", "dark", "sad", "tight"},
            {"accept", "favour", "ideal", "sick"},
            {"independent", "divergent", "ideal", "agree"},
            {"skill", "form", "technique", "billing"},
            {"injurious", "unworthy", "uncharitable", "abominable"},
            {"residuary", "discretionary", "official", "legal"},
            {"Einstine", "Hooks", "Newton", "Maxwell"},
            {"1963", "1953", "1969", "1965"},
            {"blue", "red", "white", "black"},
            {"saturn", "mars", "venus", "jupiter"},
            {"earth", "saturn", "jupiter", "mars"},
            {"Chandipur", "Bengaluru", "Delhi", "Mumbai"},
            {"Aeroplane", "Train", "Jester", "Java"},
            {"Jester", "Funny", "Stupid", "Comedy"},
            {"momentum", "fun", "square", "gain"},
            {"God", "light", "classic", "hell"},
    };



    private String mCorrectAnswers[] = {"Deu+terium oxide","Eyes","less than water","746 watts","properties of light","Exothermic reaction","Gravitational force","Galvanizing",
            "Thermoset","Sodium","Thyroid","Viral disease","Weber","Frequency","White corpuscles","Iron","Longer distance","less than 5.6","base","Oxalic acid","Olfactory indicators",
            "Sodium chloride","known","acquiesce","dissent","smile","tight","ugly","accept","divergent","billing","abominable","discretionary",
            "Einstine","1969","black","mars","earth","Bengaluru","Aeroplane","Jester","gain","God"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
