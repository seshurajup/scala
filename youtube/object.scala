// object definition
object learning{
    // main function definition
    def main(args: Array[String]){
        var i = 0;
        // while loops
        while ( i <= 10 ){
            println(" While Loop Values of i ",i)
            i += 1
        }

        // do while loop 
        do {
            println(" Do While Loop Values of i ", i)
            i += 1
        }while ( i <= 10 )
        
        // for loop 
        for( i <- 1 to 10 ){
            println(" For Loop Value of i ", i)
        }

        var variable = "ABCDEDF";
        for( i <- 0 until variable.length){
            println(" For each Lopp ", variable(i) )
        }

        // list 
        var listVariable = List(1,2,3,4,5)
        for( i <- listVariable){
            println(" List Value ",i);
        }

        // generate all even numbers from 1 to 10
        var evenVariable = for { i <- 1 to 20 if ( i % 2 ) == 0 } yield i
        for ( i <- evenVariable ){
            println(" Even Value ", i)
        }

        // 2 nested for loops in single for loop syntax 
        for( i <- 1 to 5 ; j <- 6 to 10){
            println(" Nested for loop values i",i," j",j)
        }

        // define function without arguments
        def is2EvenNumber(): Boolean{
            var number = 2 ;
            if(number%2 != 0 ){
                return true;
                }
            else{
                return false;
                }
        }
        println(" is2EvenNumber function output ", is2EvenNumber() );



    }
}