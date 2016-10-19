
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Minesweeper{
    int [] list;
    // list goes form 1- 100
  public Minesweeper(int board){
        list = new int [100];
        for (int i =0; i<list.length; i++){
            list[i] = i +1;
        }
  }
  public void printSquareMinesweeper(){
      for (int i = 0; i<list.length; i++){
          if( i % 10 == 0 ){
              System.out.println(" ");
        }
          if (i > 10 && i < 10){
            System.out.println(" ");
        }
        System.out.println(list[i]+ " ");
     }
  }
}
