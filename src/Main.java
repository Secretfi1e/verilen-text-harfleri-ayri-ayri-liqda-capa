public class Main {
    public static void main(String[] args) {
        // Bir metod yaradın, bu metod vasitəsilə
        // verilən bütün hərflər ayrı-ayrılıqda çapa çıxsın.
        String text = "a::b::c::d::e";

        for(char fayl : text.toCharArray()){
        if(Character.isLetter(fayl)){
            System.out.println(fayl);
        }

    }}}

         //3 cu sual

        // String text = "a b,c.d/e";
      //   for(char emin : text.toCharArray()){
       // if (Character.isLetter(emin)){
        //   System.out.println(emin);
  //  }
//}}}

   // 3un basqa cur yazilisi verilen hersey ayri ayriliqda capa cixsin

    //   String text = "a b,c.d/e";
      //  for (int i = 0; i < text.length(); i++) {
       //     char character = text.charAt(i);
        //    System.out.println(character);

       // }}}