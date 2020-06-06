# Dokumentacja projektu z przedmiotu Technologie Obiektowe - Testowanie Jednostkowe
### Albert Bernat 1ID21B 

## 1. Założenia projektu
Projekt zakładał stworzenia frameworka do przeprowadzania testów jednostkowych, bazującego na Junit, TestNG. 

Założenia projektowe zakładały następujące funkcjonalności:
* Wywoływanie metody testowej;
* Wywoływanie metody setUp przed każdym testem; 
* Wywoływanie meteody tearDown po każdym teście(nawet jeżeli test się nie powiódł);
* Generowanie raportów do konsoli;
* Generowanie raportów do pliku html;
* Przeprowadzanie opisowych asercji;
* Uruchamianie wielu testów na raz; 

## 2. Stos technologiczny
Do zrealizowania projektu użyto następujących technologii:
* Java 8
* Maven
* Git
* Jaxb
* Reflections (https://mvnrepository.com/artifact/org.reflections/reflections) - dla ułatwienia operacji na refleksji

Mała ilość użytych bibliotek zależnych ma na celu zmniejszenie rozmiaru samego frameworka oraz zminimalizowanie problemów z aktualizacją wersji bibliotek.

## 3. Struktura projektu
Projekt został podzielony na dwa moduły:
* TestFramework - moudł core całego projektu. To tutaj znajduje się cała logika odpowiedzialna za działanie frameworka(wykonywanie testów, uruchamianie testów, generowanie raportów) 
* FrameworkDemo - przykładowy projekt demo. Znajduje się tam prosta implementacja stosu wraz z testami jednostkowymi.

## 4. Demo i uruchamianie testów
Celem uruchomienia projektu należy przejść do modułu FrameworkDemo. W folderze src\test\java\com\codegood\demo\ znajduje się plik RunTests.java Należy go uruchomić pamiętając żeby przekazać jako parametr do komendy java -ea. Uruchamia to asercje języka java. Jeden test powinien zakończyć się niepowodzeniem. W konsoli powinien wyświetlić się raport ze ścieżkami pakietowymi oraz nazwami testów. W folderze Reports (w głównym katalogu projektu) zostanie automatycznie utworzony plik .html z raportem.

## 5. Pomysły na rozbudowę i przebudowę
* Napisanie pluginu do mavena który będzie uruchamiał testy, bez pisania kodu z klasą main. 
* Opisowe błędy asercji
* Asercje na wyjątkach bez bloku try-catch
* Rozbudowanie struktury raportu HTML 