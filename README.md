# Komis
Aplikacja zawiera w katalogu resources plik zip, który zostanie rozpakowany przy pierwszym uruchomieniu.

## CSV
W aplikacji, w katalogu src/main/resources są wygenerowane pliki: people1.csv, samochody.csv oraz vehicle.csv. Są to pliki w postaci CSV (Comma-Separated Values), czyli pliki, w których wartości są rozdzielone przecinkami ( a w tym przypadku średnikiem). Każda linia pliku oznacza jeden zestaw danych, w którym informacje zawarte są na ściśle określonych pozycjach:
W pliku person.csv w kolejnych miejscach w linii znajdują się:
* identyfikator osoby
* imię
* nazwisko
* płeć
* data urodzenia
* PESEL
 
W pliku vehicle.csv w kolejnych miejscach w linii znajdują się:
* identyfikator właściciela (czyli ten sam identyfikator co identyfikator osoby z pliku person.csv)
* id
* vin
* value
* Marka
* Model
* Nadwozie
* Typ
* Silnik
* Rodzaj wtrysku
* Kod silnika
* Lata montażu
* Cylindry/zawory
* Objętość skokowa [cm3]
* Moc [kW/KM/obr./min]
* Moment obr. [Nm/obr./min]
* Rozrząd
* Filtr cząstek stałych
* Skrzynia biegów
* Napęd
* Hamulce przód/tył
* Zawieszenie przód
* Zawieszenie tył
* Masa własna [kg]
* Wymiary nadwozia [mm]
* Pojemność bagażnika [l]
* Przysp. 0-100km/h [s]
* Prędkość maks. [km/h]
* Spal. (m./tr./śr.) [l/100km]
* Poj. zbiornika paliwa [l]
* Stosunek kg/KM
 
## O Programie
Aplikację uruchamia się z klasy Main. Klasa Main tworzy i uruchamia klasę KomisApplication, 
którą będziesz edytować.

Zadania starałem się posortować po poziomie trudności.
# Zadania:
1. Zastanów się jak można odwzorować strukturę z plików za pomocą klas.
2. Napisz metodę, która odczyta dane z pliku people1.csv
3. Napisz metodę, która odczyta dane z pliku vehicle.csv
4. Zastanów się, czy można skonstruować jedną metodę, która zastąpi dwie powyższe. 
5. Postaraj się opakować metodę do odczytywania plików csv w klasy, tak, by użycie tych klas było stosunkowo intuicyjne na przykład:
    * W konstruktorze klasy CsvFile będziemy podawać ścieżkę do pliku
    * Jak wiadomo plik csv składa się z linii (jedna linia to pojedynczy zestaw danych), zatem niech CsvFile składa się z CsvLine
    * Niech będzie łatwy zapis do pliku metodą saveToFile()
    * Niech będzie łątwy odczyt z pliku metodą readLines()
6. Napisz klasę PeopleReader, która będzie korzystała z Klas napisanych wyżej i zwróci kolekcję osób.
7. Analogicznie do poprzedniego zadania napisz klasę dla vehicle.
8. W katalogu resources znajduje się też plik samochody.csv. Odczytaj plik i sprawdź, który samochód ma największą moc oraz najlepszy stosunek masy do mocy.
9. W klasie KomisApplication napisz metodę, która będzie zliczać, ile jest osób z danym nazwiskiem.
10. W klasie KomisApplication napisz metodę, która będzie grupować obiekty klasy Person po imieniu.
11. W klasie KomisApplication napisz metodę, która będzie filtrować osoby tak, aby zostały tylko te mające więcej niż 35 oraz mniej niż 55 lat.
12. W klasie KomisApplication napisz metodę, która policzy osoby mogące ubiegać się o emeryturę (60 lat dla kobiet oraz 65 dla mężczyzn)
13. Utworzone metody (oraz jedną istniejącą) wydziel do nowej klasy - jak nazwiesz tę klasę?
14. Sprawdź jakie marki występują w pliku vehicle.csv i zapisz do pliku tekstowego w postaci marka=ilość per linia
15. Odczytaj plik samochody.csv i zakoduj plik na przyklad algorytmem base64 tak, by odczytanie poza programem było niemożliwe.
16. Zamień treść pliku vehicle.csv w tablicę bajtów i użyj nio do zapisu do pliku. Sprawdź czy coś się zmieniło w pliku. 