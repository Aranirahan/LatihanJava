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
public class SetGet {
    
    String warna = "kuning";
    int tinggi = 100;
            
    public static void main(String[] args) {
        // TODO code application logic here
        SetGet andi = new SetGet();
        System.out.print(andi.warna);
        andi.setWarna("hitam");
        System.out.print(andi.warna);
        String ambilWarna = andi.getWarna(); 
        System.out.print(ambilWarna);

    }
    void setWarna(String newWarna){
        warna = newWarna;
    }
    String getWarna(){
        return warna;
    }
    
}
