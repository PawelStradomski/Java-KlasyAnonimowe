
package klasyanonimowe;
/**
 * 
 * @author pawelstradomski
 */

public class KlasyAnonimowe {

    
    public static void main(String[] args) {
        ZachowaniePrzycisku z = new ZachowaniePrzycisku() 
        {
            @Override
            public void akcje() {
                System.out.println("ta klasa jest anonimowa");
                
            }
        };
        Przycisk p = new Przycisk();
        p.dodajAkcje(z);
                
    }
    
}
interface ZachowaniePrzycisku
{
    void akcje();
}
class Przycisk
{
    void dodajAkcje(ZachowaniePrzycisku z)
    {
        z.akcje();
    }
}
