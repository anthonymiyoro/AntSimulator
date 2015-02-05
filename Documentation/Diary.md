#Tuntikirjanpito

##15.1
* 1.5h: projektin luominen ja vaaditun dokumentaation luominen.

##4.2
Operaatio aikataulun kiinni kurominen alkakakoon.

Päätin hyödyntää erään aikaisemman peliprojektini oppeja, ja rakentaa projektin "pelimoottori"-osan pitkälti siihen perustuen. Näin saan nopeasti aikaiseksi laajennettavan ja helposti muokattavan rungon, jonka ympärille rakentaa pelin mielenkiintoisempaa muurahaisosaa.

* 1h: IDE ongelmien ratkaisemista
* 1h: Importtasin tarvitsemani kirjaston ja implementoin perus kohtaus logiikan, joka huolehtii vaikkapa aloitusmenusta itse peliin siirtymisen elegantisti.
* 1h: Implementoin yksinkertaisen event systeemin, jonka avulla peli osaa nyt sammuttaa itsensä. Pelin perus runko on nyt valmis; eri valikot* ja itse peli saadaan helposti implementoitua scenejen avulla, ja eventit mahdollistavat liikkumisen niiden välillä, sekä huolehtivat ylipäätään kommunikoinnista pelin sisällä. Täydellinen se ei ole, mutta riittänee tarkoituksiini toistaiseksi.

*Valikko tarkoittaa tässä siis erillistä valikko näkymää, ei pelin aikana tapahtuvaa pause menua.

Seuraavaksi teen nyt luomilleni luokille testit, minkä jälkeen voin ryhtyä tuottamaan pelille sisältöä, eli tässä tapauksessa siis muurahaisia.

##5.2
* 1h 45min: Tein testit kaikelle paitsi Main luokalle - mikään muu kuin sen main() funktio ei näy luokan ulkopuolelle, ja main() sisältää peliloopin. Ongelmia mutaatiotestauksen kanssa - Pit ei löydä testejä. Netbeans <3
* 15min: Pit ongelma ratkaistu. Testaus ei toistaiseksi kovin kattavaa, mutta sitä ehtii paikkailemaan myöhemminkin. 
* 1h: Aloitin muurahaispesän tekemisen. Osaa ladata tekstuurin, pitää kirjaa tuhansien muurahaisten sijainnista, sekä piirtää muurahaiset. Muurahaisten luomista ja liikkumista en ole vielä implementoinut, eikä pesää vielä ole missään scenessä. 

Peli on toistaiseksi edelleen vain musta ruutu, mutta tekniikkaa sisällöntuottamiseen alkaa vähitellen löytymään. Muurahaisten satunnaisen liikkumisen toteuttamiseen ei pitäisi mennä kovinkaan kauaa, ja yksinkertaisen aloita peli -menun tekemiseen ei aikaa menisi juuri lainkaan. Itse muurahaisalgoritmin toteuttamisessa toki menee hetki, mutta kaiken kaikkiaan projekti on lähtenyt kohtuullisen hyvin liikkeelle alun pysähdyksen jälkeen. Yksi aktiivinen päivä lisää, ja pelissä pitäisi olla aloita peli-painike ja peli scene jossa "idioottimuurahaisia", jotka liikkuvat satunnaisesti. 

Työtä toki vielä on, ennen kuin saan aikataulun kiinni, mutta kaiken kaikkiaan olen optimistinen.
