/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas32;

/**
 *
 * @author Asus
 */
public class Tugas32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film fm1 = new Film();
        Film fm2 = new Film();
        Film fm3 = new Film();
        Film fm4 = new Film();
        
        fm1.setfilmName("Venom");
        fm1.setfilmGenre("Action, Horor, Scifi");
        fm1.setfilmRating(8.5);
        fm1.setfilmDuration(120);
        
        System.out.println("Judul Film : " + fm1.getfilmName());
        System.out.println("Genre Film : " + fm1.getfilmGenre());
        System.out.println("Rating Film : " + fm1.getfilmRating());
        System.out.println("Durasi Film : " + fm1.getfilmDuration() + " Menit");
    }
    
}
