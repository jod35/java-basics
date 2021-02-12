class beers{
    public static void main(String[] args){
        int numBeers=99;

        String word="bottles";


        while (numBeers >0){
            if (numBeers ==1){
                word="Bottle";
            }

            System.out.println(numBeers + " " + word + "of beer on the wall. ");
            
            System.out.println(numBeers + " " + word + "of beer.");

            System.out.println("Pass it round");

            numBeers -= 1;

            if (numBeers >0){
                
                System.out.println(numBeers + " " + word + "of beer on the wall. ");


            }

            else{

                
                System.out.println("No more bottlles on the wall");

            }




    }


}
}
