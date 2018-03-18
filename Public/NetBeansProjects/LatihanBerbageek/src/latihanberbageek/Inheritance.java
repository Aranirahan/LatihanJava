/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanberbageek;

/**
 *
 * @author aran
 */
class Ortu{
    int umur;
    String warna;
}
//Mewarisi kelas parent
public class Inheritance extends Ortu{
    
    public static void main(String[]args){
        Inheritance objek = new Inheritance();
        objek.umur = 210;
        System.out.print(objek.umur);
        String newWarna = objek.getWarna("pink");
        System.out.print(newWarna);
        
    }
    String getWarna(String warna){
       return this.warna = warna;
    }
}
