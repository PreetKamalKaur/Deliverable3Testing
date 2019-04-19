/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
public class card {

    int rank;
    String suit;

    public card(int r, String s) {
        rank = r;
        suit = s;
    }

    public String GetFileName() {
        String filename = rank+"_of_"+suit+".png";
        return filename;
    }
    public int GetBlackjackValue(){
        if (rank<10){
        return rank;
        }else 
            return 10;
    }
}