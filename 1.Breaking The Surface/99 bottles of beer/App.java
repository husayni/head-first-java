public class App{
    public static void main(String[] args){

        for (int beerNum = 99; beerNum > 0; beerNum--)
        {
            String word = beerNum>1 ? "bottles":"bottle";
            System.out.println(beerNum + " " + word + "  of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down\nPass it around");
            word = beerNum>1 ? "bottles":"bottle";
            System.out.println(beerNum-1 +" " + word + " of beer");
        }
        System.out.println("No more bottles of beer on the wall!");

    }
}