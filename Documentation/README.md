# AntSimulator
Simulates ants. Lots of them. Assignment for University of Helsinki course "Aineopintojen harjoitustyö: Ohjelmointi" (Programming project).

Uses the wonderful free graphics library JSFML, available here: http://jsfml.org/


##Aihe:
Peli/simulaatio, joka mallintaa (yksinkertaistettua!) muurahaispesää ant colony optimization algoritmin ja ruokalähteiden avulla. Tavoitteena mallintaa mahdollisimman suurta määrää muurahaisia saman aikaisesti, mahdollisesti näytönohjaimen prosessointitehoa hyödyntäen. Mikäli aikaa jää, voidaan toteuttaa kilpailevia pesiä, tai peräti antaa pelaajalle mahdollisuus jossain määrin vaikuttaa tapahtumien kulkuun, esimerkiksi ruokapalojen lisäämisen tai "kummitusferomonien" avulla. 

##Toiminnot:
* Generoi taso - yksinkertainen satunnaisgeneroitu tiilikartta, mahdollisesti vain tyhjiä ruutuja ja ruokalähteitä.
* Aloita peli - aloittaa simulaation. Muurahaiset tekevät muurahaisasioita, pelaaja voi ainakin katsoa, ehkä myös vaikuttaa.
* Pause menu.
* Lopeta peli.

##Miten muurahaiset toimivat?
* Suunnistavat muurahaisalgoritmilla.
* Poimivat löytäessään ruokaa. Ruokaa rajallisesti, uutta vähitellen.
* Kekoon päätyessään lisäävät kantamansa ruuan pesän varastoon.
* Taistelevat?
* Kuolevat?
* Uusia syntyy?
* Pesän rakennus?


