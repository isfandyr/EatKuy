package com.example.eatkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel dengan jenis data ArrayList
    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    //deklarasi variabel dari layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }
    
    //mengatur bagaimana data dan menerima data dalam bentuk apa saja, lalu ditampilkan di RecylerView
    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //mengambil data dari internet
    private void getDataFromInternet(){

        //deskripsi makanan
        namaMakanan.add("Rendang");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/IAPkgtg7dj.jpg");
        infoMakanan.add("Kebanyakan dari kita kalau ke restoran Padang pasti langsung pesan rendang. Tak salah memang karena ini merupakan masakan nusantara yang melegenda. Bahkan makanan ini berada di posisi pertama dalam jajaran 50 makanan dunia terenak versi CNN, lho.\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "500 gram daging sapi\n" +
                "500 ml santan dari 1 butir kelapa\n" +
                "2000 ml santan dari 1 butir kelapa\n" +
                "3 cm lengkuas dimemarkan\n" +
                "2 batang serai diambil bagian putih dan memarkan\n" +
                "2 lembar daun kunyit dibuat simpul\n" +
                "\n" +
                "Bahan bumbu dihaluskan:\n" +
                "\n" +
                "12 buah cabai merah keriting\n" +
                "5 buah cabai merah besar dibuang bijinya\n" +
                "12 butir bawang merah\n" +
                "4 Siung bawang putih\n" +
                "4 butir kemiri disangrai\n" +
                "½ sdt merica butiran\n" +
                "1 sdm ketumbar butiran\n" +
                "3 sdt garam\n" +
                "½ sdt gula pasir\n" +
                "3 cm jahe\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Pertama, ambil dagingnya lalu silahkan dipotong-potong 2 cm melawan serat supaya empuk lalu sisihkan dulu.\n" +
                "Masaklah santan encer lalu masukkan lengkuas dan serai. Jangan lupa tambahkan juga daun kunyit dan bumbu halusnya.\n" +
                "Aduk sampai merata lalu masukkan daging dan masak sampai dagingnya empuk.\n" +
                "Jika kuah sudah mengental, kamu bisa mulai menuangi santan kentalnya lalu masak pada atas api kecil.\n" +
                "Aduk terus sampai matang dan juga berminyak serta mengental.");

        //deskripsi makanan
        namaMakanan.add("Nasi Goreng");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/U735FuDQKl.jpg");
        infoMakanan.add("Saat ada sisa nasi, tak jarang kita membuatnya sebagai menu nasi goreng untuk sarapan. Bukan hanya sisa nasi saja, nasi yang baru matang juga enak untuk dimasak sebagai nasi goreng. Masakan ini masuk juga dalam daftar makanan terenak di dunia. Kamu bisa lihat resep berikut untuk membuat nasi goreng yang enak.\n" +
                "Bahan :\n" +
                "\n" +
                "1 piring nasi putih\n" +
                "2 siung bawang putih\n" +
                "2 buah bawang merah\n" +
                "3 buah cabai rawit\n" +
                "1 buah cabai merah\n" +
                "2 sdm kecap manis\n" +
                "1 sdm saus tomat\n" +
                "1 sdm saus sambal\n" +
                "1 sdm saus tiram\n" +
                "1 sdt garam\n" +
                "1/2 sdt merica bubuk\n" +
                "1/2 sdt kaldu bubuk rasa ayam\n" +
                "1 batang daun bawang dicincang halus\n" +
                "1 butir telur ayam\n" +
                "2 sdm ayam suwir\n" +
                "1 buah sosis ayam diiris tipis\n" +
                "3 sdm margarin untuk menumis\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Pertama yang bisa kamu lakukan adalah menghaluskan bawang putih dan juga bawang merah. Haluskan juga cabai rawit serta cabai merah.\n" +
                "Siapkan wajan lalu panaskan margarin dan tumis bumbu halusnya sampai harum.\n" +
                "Masukkan ayam suwir dan juga sosis lalu tumis sebentar.\n" +
                "Tambahkan telur dan tumis bersama dengan bumbu.\n" +
                "Masukkan nasi lalu aduk sampai tercampur rata.\n" +
                "Tuangi kecap manis, saus tomat dan saus sambal.\n" +
                "Kamu juga perlu menuangi saus tiram lalu menaburkan garam, merica dan kaldu bubuk.\n" +
                "Aduk sampai nasi berubah dan merata lalu siap disajikan.");

        //deskripsi makanan
        namaMakanan.add("Nasi Uduk");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/MWm0lAiOEM.jpg");
        infoMakanan.add("Nasi uduk dibuat dengan cara mengolah beras putih, namun diaron dan dikukus memakai santan. Dibumbui sehingga rasa nasinya begitu khas dan nikmat. Disajkan dengan aneka ikan, masakan ini sering dijual di pinggir jalan sebagai menu sarapan.\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "300 g beras\n" +
                "450 ml santan kelapa kental\n" +
                "2 lembar daun salam muda\n" +
                "2 butir cengkeh\n" +
                "2 batang serai dimemarkan\n" +
                "2 cm kayu manis\n" +
                "1sdt merica\n" +
                "1 sdt garam\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Cuci beras sampai bersih lalu sisihkan dulu.\n" +
                "Rebuslah santan lalu masukkan daun salam dan serai\n" +
                "Jangan lupa juga untuk memasukkan cengkeh, kayu manis serta merica dan garam.\n" +
                "Aduk sampai mendidih lalu masukkan santan dan beras.\n" +
                "Kukuslah sampai beras matang hingga menjadi nasi dan siap disajikan.");

        //deskripsi makanan
        namaMakanan.add("Soto");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/HAreePpDt1.jpg");
        infoMakanan.add("Varian soto di Indonesia sangatlah banyak. Masakan berkuah kuning ini di tiap daerah memiliki ciri khasnya sendiri. Cita rasa soto begitu khas dan banyak disukai wisatawan dari berbagai negara. Kamu bisa membuat soto ayam lezat dengan resep persembahan kami.\n" +
                "Bahan :\n" +
                "\n" +
                "1 ekor ayam\n" +
                "200 g kol diiris tipis\n" +
                "200 g tauge dibersihkan dan kukus hingga matang\n" +
                "4 buah kentang dibersihkan diiris tipis\n" +
                "2 buah tomat dibagi menjadi 6 bagian\n" +
                "50 g, soun rendam dengan air panas\n" +
                "3 butir telur ayam direbus hingga matang kemudian iris menjadi 4 bagian\n" +
                "2 L air\n" +
                "50 g bawang goreng\n" +
                "3 lembar daun jeruk\n" +
                "2 batang serai\n" +
                "2 lembar daun salam\n" +
                "1 batang daun bawang diiris halus\n" +
                "2 sdm lengkuas\n" +
                "25 g minyak goreng\n" +
                "2 cm kunyit\n" +
                "4 buah kemiri\n" +
                "15 g jahe\n" +
                "3 buah bawang merah\n" +
                "2 siung bawang putih\n" +
                "1 sdt Merica\n" +
                "2 sdm garam\n" +
                "1 buah jeruk nipis, bagi menjadi 8 bagian\n" +
                "\n" +
                "Cara Membuat :\n" +
                "\n" +
                "Sebagai awalan kamu bisa menghaluskan kunyit, kemiri, jahe beserta bawang merah dan putih.\n" +
                "Masukkan juga merica dan garam lalu aduk merata.\n" +
                "Panaskan wajan dengan api sedang lalu tumis bumbu hingga harum.\n" +
                "Jangan lupa untuk menambahkan daun jeruk dan daun salam.\n" +
                "Tambahkan juga serai dan lengkuas lalu aduk hingga harum.\n" +
                "Ambil panci lalu isi air dan didihkan lalu masukkan bumbu yang telah ditumis ke dalam air rebusan.\n" +
                "Jika sudah mendidih, masukkan ayam dan biarkan matang.\n" +
                "Keluarkan ayam dari kuah lalu pisahkan daging dengan tulangnya.\n" +
                "Masukkan lagi tulang ayam pada kuah sementara daging ayam bisa digoreng hingga kecoklatan lalu disuwir kecil.\n" +
                "Masukkan daun bawang pada kuah soto.\n" +
                "Goreng irisan kentang lalu masukkan dalam wadah tertutup.\n" +
                "Ambil wadah bersih untuk menyajikan soto.\n" +
                "Kamu bisa mulai menghidangkan nasi atau lontong pada wadah lalu letakkan kol, tauge dan kentang goreng.\n" +
                "Kemudian masukkan soun, irisan tomat dan telur.\n" +
                "Paling atas kamu bisa letakkan suwiran daging ayam lalu tuangi dengan kuah soto.\n" +
                "Jangan lupa taburi bawang goreng dan taruh irisan jeruk nipis di atasnya.");


        //deskripsi makanan
        namaMakanan.add("Sate");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/SRmxuu31nt.jpg");
        infoMakanan.add("Sate jadi makanan favorit banyak orang nih. Bukan hanya menu favorit di Indonesia, namun sate juga menjadi menu sejumlah restoran internasional. Yuk segera buat menu mudah ini. Untuk sate ayam bumbu kecap bisa intip resep berikut ini.\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "100 gram daging ayam tanpa tulang\n" +
                "2 sdm margarin dicampur sisa bumbu marinasi untuk olesan\n" +
                "Tusuk sate secukupnya\n" +
                "\n" +
                "Bahan bumbu marinasi :\n" +
                "\n" +
                "1 sdm gula merah Jawa sisir halus\n" +
                "0,5 sdt ketumbar\n" +
                "1 siung bawang putih\n" +
                "3 siung bawang merah\n" +
                "10ml kecap manis kental\n" +
                "1 butir kemiri\n" +
                "Garam dapur beryodium secukupnya\n" +
                "\n" +
                "Bahan bumbu sate ayam:\n" +
                "\n" +
                "5 siung bawang merah\n" +
                "50ml kecap manis kental\n" +
                "0,5 sdt air jeruk nipis\n" +
                "Cabai rawit iris tipis sesuai selera\n" +
                "\n" +
                "Bahan tambahan :\n" +
                "\n" +
                "Tomat iris sesuai selera\n" +
                "Bawang merah yang diiris iris secukupnya.\n" +
                "Bawang goreng untuk taburan sesuai selera.\n" +
                "Lontong kalau suka sesuai selera.\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Potongi kotak-kotak untuk daging ayamnya\n" +
                "Haluskan bumbu marinasi lalu campur dengan daging ayam yang sudah dipotong lalu aduk merata dan diamkan meresap 30 menit.\n" +
                "Tusuki daging ayam hingga habis namun sisa bumbu jangan dibuang.\n" +
                "Masukkan margarin pada sisa bumbu dan aduk rata.\n" +
                "Siapkan bakaran lalu olesi sate dengan bumbu olesan hingga merata.\n" +
                "Bakar satenya sesekali dibolak balik dan diolesi bumbu hingga matang.\n" +
                "Untuk bumbu kecap, silahkan cuci semua bahan lalu tiriskan.\n" +
                "Irisi cabai dan tomat lalu campur dengan kecap kental manis.\n" +
                "Aduk semua bahan merata lalu tuang pada sate yang sudah dibakar.");

        //deskripsi makanan
        namaMakanan.add("Gado-Gado");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/3hK8KLFy3G.jpg");
        infoMakanan.add("Gado-gado rupanya begitu populer di luar negeri. Di Italia misalnya, lantaran makanan ini pernah diikutsertakan dalam kompetisi dan jadi juara pertama, maka makanan ini pun langsung banyak diminati. Yuk, segera buat dengan resep persembahan kami!\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "150 gram kubis diiris-iris kecil\n" +
                "175 gram bayam\n" +
                "200 gram mentimun diiris-iris kecil\n" +
                "175 gram tauge\n" +
                "300 gram kentang rebus diiris dadu\n" +
                "200 gram kacang panjang\n" +
                "300 gram tahu kuning digoreng dan diiris dadu\n" +
                "Telur rebus dibelah menjadi dua\n" +
                "Kerupuk dan emping\n" +
                "Bawang goreng\n" +
                "\n" +
                "Bahan saus:\n" +
                "\n" +
                "4 buah cabe rawit\n" +
                "4 buah cabe merah\n" +
                "4 sdt gula merah\n" +
                "1 sdt terasi bakar\n" +
                "1,5 sdm air asam jawa\n" +
                "2 sdt garam\n" +
                "175 gram kacang tanah ditumbuk halus\n" +
                "175 gram kacang kenari ditumbuk halus\n" +
                "Kecap manis\n" +
                "750 ml air\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Rebus semua sayuran sampai lunak lalu tiriskan.\n" +
                "Haluskan cabe merah, garam, cabe rawit dan juga terasi hingga halus.\n" +
                "Masukkan kacang tanah dan kacang kenari.\n" +
                "Tambahkan air asam, kecap, air dan gula merah.\n" +
                "Aduk rata lalu masak di atas wajan hingga mendidih.\n" +
                "Biarkan dingin lalu siap disajikan dengan lainnya.\n" +
                "Ambil piring lalu tambahkan sayuran dan kentang.\n" +
                "Lalu masukkan juga tahu dan telur.\n" +
                "Tuangi saus kacang lalu taburi bawang goreng dan emping goreng.");

        //deskripsi makanan
        namaMakanan.add("Gudeg");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/M6TBG2qw2p.jpg");
        infoMakanan.add("Khas dari Jogja dan berhasil go international, itulah Gudeg. Makanan ini bahkan diminati untuk diimpor dalam bentuk kalengan. Bahkan di Clayton Road Australia, menu ini terdapat pada salah satu restoran di sana lho. Kalau mau bikin gudeg, kamu bisa lihat resep dari kami, selain itu jika ingin melihat tutorial dan resep alternatifnya.\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "2 sdm garam\n" +
                "10 butir kemiri disangrai\n" +
                "1sdt ketumbar sangrai\n" +
                "15 siung bawang merah\n" +
                "10 siung bawang putih\n" +
                "½ sdt merica bubuk\n" +
                "1 kg nangka muda\n" +
                "2 liter santan\n" +
                "1 liter air kelapa\n" +
                "Lengkuas iris memanjang\n" +
                "5 lembar daun salam\n" +
                "Telur rebus\n" +
                "200 gram gula aren\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Cuci nangka lalu potong dadu dan rebus beberapa menit lalu tiriskan dan sisihkan.\n" +
                "Ambil panci, alasi dasarnya dengan daun salam dan irisan lengkuas.\n" +
                "Masukkan telur rebus, gula aren dan nangka pada panci.\n" +
                "Haluskan bumbu lalu campur dengan setengah air kelapa dan aduk rata baru tuang pada panci.\n" +
                "Tuang air kelapa yang tak dicampur hingga telur dan nangka terendam lalu tutup pancinya.\n" +
                "Masak 2 jam dengan api sedang, lalu jika sudah menyusut airnya, sisihkan dan angkat telurnya.\n" +
                "Tuangi santan dan aduk sambil nangkanya dihancurkan.\n" +
                "Masukkan lagi telur sampai sedikit terendam dengan nangka.\n" +
                "Kamu bisa memasaknya lagi 4 jam dengan api kecil sambil diaduk perlahan.\n" +
                "Kalau santan sudah habis dan kuah sudah coklat kemerahan, berarti sudah jadi.");

        //deskripsi makanan
        namaMakanan.add("Mi Rebus");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/5g5kZz4fGJ.jpg");
        infoMakanan.add("Kala hujan turun, enaknya memang makan yang hangat. Tak ada yang bisa menolah lezatnya mi rebus khas Indonesia nih. Kamu pastinya juga suka banget kan makan mi rebus kala hujan turun. Segera buat yuk, mi rebus yang lezat dengan resep di bawah ini.\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "500 gr mi telur, rebus terlebih dahulu\n" +
                "2 butir telur ayam\n" +
                "1 ikat daun caisim\n" +
                "30 gr kol, cincang kasar\n" +
                "50 gr ayam suwir\n" +
                "Kecap manis secukupnya\n" +
                "Garam secukupnya\n" +
                "Merica secukupnya\n" +
                "\n" +
                "Bahan bumbu yang dihaluskan :\n" +
                "\n" +
                "4 siung bawang putih\n" +
                "1 butir kemiri sangrai\n" +
                "Garam secukupnya\n" +
                "2 butir bawang merah\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Tumis bumbu halus sampai harum.\n" +
                "Orak arik telusnya lalu masukkan daun caisim dan kol dan tunggu sampai layu.\n" +
                "Masukkan mi dan aduk rata, lalu masukkan air secukupnya.\n" +
                "Tambahkan kecap, merica, garam dan ayam suwir.\n" +
                "Aduk rata dan biarkan kuah mendidih baru sajikan.");

        //deskripsi makanan
        namaMakanan.add("Sop Buntut");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/bUHygzd1h8.jpg");
        infoMakanan.add("Sop buntut selain populer di Indonesia juga populer di Spanyol. Makanan ini kaya akan rempah sehingga rasanya begitu nikmat. Aromanya wangi dan cocok dimakan bersama nasi hangat, pastinya tak tertahankan lezatnya. Segera buat dengan resep kami berikut ini!\n" +
                "\n" +
                "Bahan :\n" +
                "\n" +
                "1 kg buntut sapi dipotongi\n" +
                "3 buah wortel dipotongi\n" +
                "2 buah kentang dipotongi\n" +
                "2 batang daun bawang dipotongi\n" +
                "1 ikat kecil seledri disimpulkan\n" +
                "1 buah tomat dipotongi\n" +
                "1 buah pala dipecahkan dan haluskan\n" +
                "4 butir cengkeh\n" +
                "2 butir bunga lawang atau pekak\n" +
                "4 cm kayu manis\n" +
                "3 butir kapulaga\n" +
                "1.5 sdm garam\n" +
                "2 sdt gula pasir\n" +
                "2 sdm minyak\n" +
                "2 liter air\n" +
                "\n" +
                "Bahan bumbu halus:\n" +
                "\n" +
                "7 siung bawang merah\n" +
                "5 siung bawang putih\n" +
                "1/2 sdt merica\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Panaskan air lalu masak hingga mendidih.\n" +
                "Masukkan buntut sapi lalu rebus sampai berbusa dan buang airnya.\n" +
                "Didihkan air baru lalu masukkan buntut dan rebus sampai lunak\n" +
                "Panaskan minyak dan tumis bunbu halus hingga wangi dan matang.\n" +
                "Masukkan tumisan dalam panci rebusan buntut.\n" +
                "Tambahkan wortel dan kentang lalu masak pakai api kecil sampai mendidih.\n" +
                "Bubuhi garam dan cengkeh lalu masukkan bunga lawang, gula dan kayu manis.\n" +
                "Tambahkan juga kapulaga dan pala lalu tes rasanya.\n" +
                "Masukkan seledri lalu masak sampai buntut empuk dan bumbunya meresap.\n" +
                "Masukkan daun bawang dan irisan tomat lalu angkat dan sajikan.");

        //deskripsi makanan
        namaMakanan.add("Bakso");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/nOACuiMp4x.jpg");
        infoMakanan.add("Bakso adalah makanan yang bisa ditemukan dengan mudah di Indonesia. Makanan ini juga menjadi makanan favorit warga Tiongkok. Dibuat dari daging sapi, aromanya menggoda dan rasanya nikmat. Kamu bisa buat bakso dengan resep dari kami berikut ini.\n" +
                "Bahan :\n" +
                "\n" +
                "1 kg daging sapi digiling\n" +
                "50 g tepung kanji\n" +
                "1 butir telur\n" +
                "2 sdt lada bubuk\n" +
                "1 sdt garam\n" +
                "4 siung bawang putih, haluskan\n" +
                "40 g es batu, hancurkan\n" +
                "2 L air\n" +
                "\n" +
                "Cara membuat :\n" +
                "\n" +
                "Masukkan daging sapi giling pada wadah lalu campur dengan kanji dan telur.\n" +
                "Tambahkan lada, garam dan bawang putih halus.\n" +
                "Uleni pakai tangan, jika masih lembek bisa ditambahkan es batu secara perlahan sampai dirasa adonan bisa dibentuk.\n" +
                "Rebus air hingga mendidih, lalu bentuk adonan daging dengan tangan menyerupai bola-bola dengan ukuran sesuai keinginan.\n" +
                "Masukkan adonan yang dibentuk ke dalam air panas dan lakukan hingga adonan habis.\n" +
                "Jika bakso sudah mengapung maka tandanya sudah matang.");

        prosesRecyclerViewAdapter();

    }
}