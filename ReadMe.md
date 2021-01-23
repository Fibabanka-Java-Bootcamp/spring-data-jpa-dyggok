# Spring data jpa kullanarak veritabanı işlemleri

![design](src/main/resources/book_store_design.png)

Tablodaki ilişkiler ve data işlemleri Spring Data Jpa kullanılarak yapıldı ve adım adım gidildi. Adımları detaylı olarak şu şekilde açıklanır:

1- Tablodaki ilişkiler tanımlanıp onlarla ilgili Fetch-Cascade düzenlemeleri yapıldıktan sonra ekranda görmek istenilen ilk şey bir kitap ismi yazıldığında bununla ilgili kitapların ekrana bastırmak istenilmesiydi. Bunun görebilmek adına Book veritabanına "java 101" ve "java 202" adlı kitaplar yükledim ve sorgu ekranının gelmesi ve kitaplarla ilgili işlemlerin yapılabilmesi için de BookService adından Component anotasyonunda bir class ekledim. Ekrana gelen "Enter a book name" yazısından sonra bir kitap adı girildiğinde, örnek olarak sadece "java" yazıldığında, "java 101" ve "java 202"nin de geldiğini görürüz. (Kitaplarla ilgili bütün veriler işlenmemiştir, sadece bu işlemin gerçekleştiğini görebilmek adına ismi, fiyatı, ISBN'i ve para birimi ekrana basılmaktadır)

2-Diğer istenilen özellik de veritabanında bir yazara ait bütün kitapların ekrana basılmasıydı. Bununla ilgili örnek de Kemal Tahir adlı yazarın "İnce Memed1" ve "İnce Memed2" kitaplarının veritabanına eklenmesi ve bu yazarın her iki kitabı da AuthorService class'ı aracılığıla bastırılabilmesidir.

3-Kullanıcıların bütün bilgileri(kendilerine ait bilgileri, adresleri ve sipariş bilgileri)nin ekrana bastırabilmesi için de UserService kullanılmıştır. Burada diyelim ki kullanıcı Book veritabanından java kitaplarını sipariş etti ve bu kitaplarla ilgili bilgileri görmek istiyoruz. Burada da, BookRepo'yu kullanarak veritabanına kaydettiğimiz kitaplardan eşleşen kitapları alarak onlarla ilgili bütün detayları kullanıcının bilgileriyle ekrana bastırmış oluyoruz. 
