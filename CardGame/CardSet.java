
package CardGame;
public class CardSet{

    private Card[] cards;
    
    public CardSet(){
    //処理：カード52枚を作ってcardsに代入。順：♠️❤️♦️♣️
        
        cards = new Card[52];   //5行目で宣言されていることに注意
        
        for(int i=0 ; i<13; i++){
            cards[i] = new Card(i+1,"♠️");
        }
        for(int i=0 ; i<13; i++){
            cards[i+13] = new Card(i+1,"❤️");
        }
        for(int i=0 ; i<13; i++){
            cards[i+26] = new Card(i+1,"♦️");
        }
        for(int i=0 ; i<13; i++){
            cards[i+39] = new Card(i+1,"♣️");
        }
    }
    
    //処理：カードをシャッフル
    public void shuffle(){
        for(int i=0 ; i<300 ; i++){
            int x = (int)(Math.random()*52);
            int y = (int)(Math.random()*52);
            Card tmp = cards[y];
            cards[y] = cards[x];
            cards[x] = tmp;
            
        }
    }
    
    public void print(int size){
    //処理：sizeの数だけ横ならびにする。ex.sizeが3の場合♠️1,♠️2,♠️3
        for(int i=0; i<size; i++){
            System.out.print("┌───┐ ");
        }
        
        System.out.println();
        for(int i=0; i<size; i++){
            System.out.print("│");
            cards[i].print();
            System.out.print("│ ");
        }
        
        System.out.println();
        for(int i=0; i<size; i++){
            System.out.print("└───┘ ");
        }
        
            System.out.println();
        
        }
    
    public Card getCard(int index){
        if(index < 0 || index > 51){
            return null;
        }else{
            return cards[index];
        }
    }
}