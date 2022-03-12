package Ch9_ObjectsAndClasses;

public class OOPReview {
    /*
        1 class 3 sorumluluğu yerine getirmemeli, onun yerine 3 ayrı class yazıp bu sorumluluklar 3 ayrı objeye dağıtılmalı
        Drawer -> CircleDrawer, ElipsDrawer, RectangleDrawer

        Alınması gereken bir sorumluluk varsa bu sorumluluk için class yazılır.

        Constructor: Özel bir methoddur amacı obje üretmektir. Memory'de yer ayırır ver ayırdığı yerin adresini döndürür.

        Reference: objenin memory'de nerede olduğunu gösterir. Constructor tarafından sağlanır

        static method/property: class'a aittir. kullanılması için objeye ihtiyaç duymaz. class'a ait olduğundan objeler
            arasında değişiklik göstermez. ClassName.property ya da ClassName.methodName() şeklinde erişilir.

        non-static (instance) method/property: Objenin kendisine aittir. objeden objeye değişiklik gösterir.
            objectReference.property ya da objectReference.methodName() şeklinde erişilir.

        passing objects to methods = pass-by-reference: methodlarda objelere yapılan değişik her yerde gözükür
                                     pass-by-value: methodlarda primitive datalara yapılan değişiklik sadece o method içinde görünür

        Abstraction: sistemle etkileşime geçmek için input ve outputu bilmek yeterlidir. Sistemin nasıl çalıştığını bilmemize gerek yok
                Implementasyonun saklanmasıdır.


     */
}
