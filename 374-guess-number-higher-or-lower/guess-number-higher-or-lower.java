/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int b=1;
       int c=n;
       while(b<=c){
        int d=b+(c-b)/2;
        if(guess(d)==0){
            return d;}
            else if(guess(d)==-1){
                c=d-1;
            }
            else {
                b=d+1;
            }
        }
        return -1;
       }
        
    }