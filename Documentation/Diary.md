#Tuntikirjanpito

##15.1
* 1.5h: projektin luominen ja vaaditun dokumentaation luominen.

##4.2
Operaatio aikataulun kiinni kurominen alkakakoon.

Päätin hyödyntää erään aikaisemman peliprojektini oppeja, ja rakentaa projektin "pelimoottori"-osan pitkälti siihen perustuen. Näin saan nopeasti aikaiseksi laajennettavan ja helposti muokattavan rungon, jonka ympärille rakentaa pelin mielenkiintoisempaa muurahaisosaa.

* 45min: Importtasin tarvitsemani kirjaston ja implementoin perus kohtaus logiikan, joka huolehtii vaikkapa aloitusmenusta itse peliin siirtymisen elegantisti.
* 45min: Implementoin yksinkertaisen event systeemin, jonka avulla peli osaa nyt sammuttaa itsensä. Pelin perus runko on nyt valmis; eri valikot* ja itse peli saadaan helposti implementoitua scenejen avulla, ja eventit mahdollistavat liikkumisen niiden välillä, sekä huolehtivat ylipäätään kommunikoinnista pelin sisällä. Täydellinen se ei ole, mutta riittänee tarkoituksiini toistaiseksi.

*Valikko tarkoittaa tässä siis erillistä valikko näkymää, ei pelin aikana tapahtuvaa pause menua.

Seuraavaksi teen nyt luomilleni luokille testit, minkä jälkeen voin ryhtyä tuottamaan pelille sisältöä, eli tässä tapauksessa siis muurahaisia.
