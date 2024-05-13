/* 
Write an application that uses random-number generation to create
sentences. Use four arrays of strings called article, noun, verb and
preposition. Create a sentence by selecting a word at random from each
array in the following order: article, noun, verb, preposition, article
and noun. As each word is picked, concatenate it to the previous words
in the sentence. The words should be separated by spaces. When the 
final sentence is output, it should start with a capital letter 
and end with a period. The application should generate and 
display 20 sentences.
1. Create four arrays of strings called article, noun, verb and
preposition.
2. Create an application that will take strings from four arrays and compile them
into sentences using mathRandom. The application should display 20 sentences
3. Create a sentence by selecting a word at random from each
array in the following order: article, noun, verb, preposition, article
and noun. As each word is picked, concatenate it to the previous words
in the sentence. The words should be separated by spaces.
4. When the final sentence is output, it should start with a capital letter 
and end with a period.
*/

public class Ex1405 {

  public static void main(String[] args) {
    // 1. Create four arrays of strings called article, noun, verb and preposition.
    String[] articles = {"a", "an", "the"};
    String[] nouns1 = {"lion", "gazelle", "behemoth", "crocodile", "baboon", "hyena"};
    String[] nouns2 = {"majestic", "king", "large", "furious", "savannah", "pond", "grass", "day", "night"};
    String[] verbs = {"hunt", "run", "eat", "graze", "swim", "watch", "scavenges", "chases"};
    String[] prepositions = {"across", "after", "around", "before", "behind", "beside", "despite", "down", "except",
                             "for", "from", "in", "into", "near", "of", "off", "on", "onto", "over", "than", "to",
                             "towards", "up", "upon", "with"};

    /* 2. Create an application that will take strings from four arrays and compile them
    into sentences using mathRandom. The application should display 20 sentences */
    for (int i=0; i < 20; i++) {
    String article = articles[(int) (Math.random() * articles.length)];
    String noun1 = nouns1[(int) (Math.random() * nouns1.length)];
    String verb = verbs[(int) (Math.random() * verbs.length)];
    String preposition = prepositions[(int) (Math.random() * prepositions.length)];
    String noun2 = nouns2[(int) (Math.random() * nouns2.length)];
    
    /* 
    3. Create a sentence by selecting a word at random from each
    array in the following order: article, noun, verb, preposition, article
    and noun. As each word is picked, concatenate it to the previous words
    in the sentence. The words should be separated by spaces.
    */
    String sentence = noun1 + " " + verb + " " + preposition + " " + article + " " + noun2;

    /* 
    4. When the final sentence is output, it should start with a capital letter 
    and end with a period.
     */
    String capitalized = article.substring(0,1).toUpperCase() + article.substring(1);
    System.out.println(capitalized + " " + sentence + ".");
    } // loop

  } //main

} // Ex_1405