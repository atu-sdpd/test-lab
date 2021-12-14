public class JavaIf5{
	public static void main (String []args){
          //Scanner keyboard = new Scanner(System.in);
          int age = 17;

          System.out.print( "If you are " + age + " years old . . . " );

         System.out.println( "You are: " );
        if ( age < 13 ) {
             System.out.println( "\ttoo young to create a Facebook account" );
         }
         if ( age < 16 ) {
             System.out.println( "\ttoo young to get a driver's license" );
         }
        if ( age < 18 ) {
             System.out.println( "\ttoo young to vote" );
        }
         if ( age < 18 ) {
             System.out.println( "\ttoo young to drink alcohol" );
         }
         if ( age < 21 ) {
			 System.out.println( "\ttoo young to become a T.D" );
		 }

		 if ( age >= 50 ) {
			 System.out.println( "\t\t...getting old!" );
		 }


	}
}


