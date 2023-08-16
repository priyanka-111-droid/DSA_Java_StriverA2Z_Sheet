public class PilesOfChocolateGame{
    //Sprague-Grundy theorem states that only diff between 2 players is one of them moves first
    //this problem can be reduced to a game of Nim(Nim has piles,each pile has stones,
    // can take stones from any pile and throw)
    //Sprague Grundy theorem says current player has winning strategy only if xor sum of all piles present is non zero
    static int gameWinner(int n,int x,int[] a){
        int result=0;
        for(int i=0;i<n;i++){
            result=result^a[i];
        }
        return result!=0?1:0;//non zero means player will win
    }
}