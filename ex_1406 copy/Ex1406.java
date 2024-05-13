/* 
  Using techniques similar to those developed in Exercise 14.5,
  write a Java application that produces random limericks.
 */


public class Ex1406 {

  public static void main(String[] args) {

    
    String[] adjectives = {"mistly", "twisty", "mysterious", "lively", "tranquil", "spacious"};
    String[] articles = {"the", "a", "an"};
    String[] adverbs1 = {"so", "very", "extremely", "too", "indeed", "really"} ;
    String[] adverbs2 = {"incredibly", "remarkably", "briliantly", "masterfully", "exceptionally", "excellently"};
    String[] conjunctions = {"and", "as", "while", "when", "yet", "or"};
    String[] pronouns = {"they", "who", "whoom", "that", "each", "some", "many", "which"};
    String[] prepositions = {"in", "to", "at", "on", "with", "by", "for", "from", "of", "about", "across", "through"};
    String[] verbs1 = {"lived", "thrived", "slept", "danced", "played", "cried"};
    String[] verbs2 = {"mined", "crafted", "compiled", "walked"};
    String[] verbs3 = {"brave", "fierce", "bold", "daring", "funny", "monstrous", "cold"};
    String[] verbs4 = {"would", "should", "could"};
    String[] nouns1 = {"mountains", "trail", "road", "forest", "village", "praries"};
    String[] nouns2 = {"dwarves", "elves", "hobbits", "goblins", "trolls"};
    String[] nouns3 = {"secrets", "spells", "treasures", "lands", "daggers", "bows", "armour"};
    String[] nouns4 = {"deep", "keep", "steep", "creep", "sleep", "sweep"};
    String[] nouns5 = {"gold", "cold", "fold", "mold", "sold", "told", "scold", "hold"};
    String[] nouns6 = {"songs", "tails", "stories", "legends", "ballads", "myths"};
    String[] nouns7 = {"caverns", "towns", "castles", "camps", "hamlets", "lands"};


    String adjective = adjectives[(int) (Math.random() * adjectives.length)];
    String article = articles[(int) (Math.random() * articles.length)];
    String adverb1 = adverbs1[(int) (Math.random() * adverbs1.length)];
    String adverb2 = adverbs2[(int) (Math.random() * adverbs2.length)];
    String conjunction = conjunctions[(int) (Math.random() * conjunctions.length)];
    String pronoun = pronouns[(int) (Math.random() * pronouns.length)];
    String preposition = prepositions[(int) (Math.random() * prepositions.length)];
    String verb1 = verbs1[(int) (Math.random() * verbs1.length)];
    String verb2 = verbs2[(int) (Math.random() * verbs2.length)];
    String verb3 = verbs3[(int) (Math.random() * verbs3.length)];
    String verb4 = verbs4[(int) (Math.random() * verbs4.length)];
    String noun1 = nouns1[(int) (Math.random() * nouns1.length)];
    String noun2 = nouns2[(int) (Math.random() * nouns2.length)];
    String noun3 = nouns3[(int) (Math.random() * nouns3.length)];
    String noun4 = nouns4[(int) (Math.random() * nouns4.length)];
    String noun5 = nouns5[(int) (Math.random() * nouns5.length)];
    String noun6 = nouns6[(int) (Math.random() * nouns6.length)];
    String noun7 = nouns7[(int) (Math.random() * nouns7.length)];


    String line1 = article + " " + adjective + " " + noun1 + ", " + adverb1 + " " + conjunction + " " + adverb1;
    String line2 = noun2 + " " + preposition + " " + noun3 + " " + adverb2 + " " + noun4;
    String line3 = noun5 + " " + verb2 + " " + preposition + " their " + noun5;
    String line4 = verb3 + ", " + conjunction + " " + verb3;
    String line5 = "their " + noun6 + " " + preposition + " " + article + " " + noun7 + " " + verb4 + " " + noun4;

    // Line 1
    String capitalizedLine1 = preposition.substring(0, 1).toUpperCase() + preposition.substring(1);
    System.out.println(capitalizedLine1 + " " + line1 + ".");
    // Line2
    String capitalizedLine2 = verb1.substring(0, 1).toUpperCase() + verb1.substring(1);
    System.out.println(capitalizedLine2 + " " + line2 + ".");
    // Line3
    String capitalizedLine3 = pronoun.substring(0, 1).toUpperCase() + pronoun.substring(1);
    System.out.println(capitalizedLine3 + ", " + line3 + ".");
    // Line4
    String capitalizedLine4 = verb3.substring(0, 1).toUpperCase() + verb3.substring(1);
    System.out.println(capitalizedLine4 + ", " + line4 + ".");
     // Line5
     String capitalizedLine5 = conjunction.substring(0, 1).toUpperCase() + conjunction.substring(1);
     System.out.println(capitalizedLine5 + " " + line5 + ".");

  } // main

} // Ex1496