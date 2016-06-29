
package CardGame;
public class Card{
    
    private int no;
    private String suit;
    
    public Card(int no,String suit){
        this.no = no;
        this.suit = suit;
        
    }
    public int getNo(){ return no; }
    
    public String getsuit(){ return suit; }

    public void print(){System.out.printf("%s%2d",suit, no); }
    //二桁のときは空白なし、一桁のときは空白ありで表示
}