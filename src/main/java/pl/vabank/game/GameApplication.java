package pl.vabank.game;

import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.data.QuestionsData;

/**
 * Klasa GameApplication to klasa konfiguracyjna, klasa główna, która będzie
 * wykonywana
 * po uruchomieniu aplikacji.
 * Adnotacja @SpringBootApplication włącza konfigurację ałtomatyczną SpringBoota
 * oraz włącza skanowanie komponetów,
 * co pozwala na zadeklarowanie innych klas jako @Controller, @Entity itp.
 * Metoda itializer jest opatrzona adnotacją @Bean,
 * gdy Spring "napotka" taką metodę, wykona ją i zarejestruje zwracaną wartość
 * jako obiekt (ziarno) w kontenerze.
 * Wtedy będzie można ten obiekt wstrzyknąć w innym miejscu korzystając np. z
 * adnotacji @Autowired.
 * 
 * @author Klasa konfiguracyjna, generowana przez Springa, modyfikacje
 *         wprowadziła Anna Mazela i Katarzyna Madalińska.
 */

@SpringBootApplication
@RestController
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializer(QuestionsRepository repository) {
		return args -> repository.saveAll(Arrays.asList(
				new QuestionsData(
						0L,
						"metoda size() tj. arrayList.size()",
						"zwraca int określający ile elementów jest na arrayLiście ",
						"zwraca false jeśli dana arrayLista jest pusta ",
						"zwraca byte określający ile elementów jest na  arrayLiście ",
						"drukuje wszystkie elementy arrayListy ",
						"zwraca int określający ile elementów jest na arrayLiście ",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt2
						1L,
						"metoda add() tj.  arrayList.add(element)",
						"dodaje element do arrayListy",
						"usuwa element z arrayList-y",
						"zwraca false jeśli dany element występuje w arrayListy",
						"zwraca index elementu występującego w arrayLiście",
						"dodaje element do arrayListy",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt3
						2L,
						"metoda clear() tj.  arrayList.clear()",
						"zwraca true, jeśli dana arrayLista nie zawiera żadnych elementów",
						"klonuje arrayListę",
						"usuwa konkretny element z tej arrayListy",
						"usuwa wszystkie elementy z danej arrayListy",
						"usuwa wszystkie elementy z danej arrayListy",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt4 ->6
						3L,
						"metoda remove(int) tj. arrayList.remove(int)",
						"usuwa z listy element typu int",
						"usuwa z listy element o wskazanym indeksie",
						"usuwa pierwsze wystąpienie podanego obiektu z listy",
						"pozwala odczytać element o wskazanym indeksie",
						"usuwa z listy element o wskazanym indeksie",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt5 ->7
						4L,
						"utworzyć różne struktury zwane listami możemy za pomocą",
						"klasy LinkedList",
						"klasy ArrayList",
						"interfejsu List",
						"klasy List",
						"interfejsu List",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt6 ->8,100
						5L,
						"jakie są podstawowe różnice między  ArrayList i LinkedList",
						"ArrayList i LinkedList to implementacja wiązana brak jest zasadniczych różnic",
						"ArrayList i LinkedList to implementacja tablicowa brak jest zasadniczych różnic",
						"ArrayList to implementacja wiązana, LinkedList to implementacja tablicowa",
						"ArrayList to implementacja tablicowa, LinkedList to implementacja wiązana",
						"ArrayList to implementacja tablicowa, LinkedList to implementacja wiązana",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt7 ->10,200
						6L,
						"metoda ContainsKey() tj. map.contains(key)",
						"zwraca null jeśli dany klucz nie istnieje w HashMap-ie",
						"zwraca false jeśli dany klucz istnieje w HashMap-ie",
						"zwraca true jeśli dany klucz istnieje w HashMap-ie",
						"zwraca String jeśli dany klucz występuje w HashMap-ie",
						"zwraca true jeśli dany klucz istnieje w HashMap-ie",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt8 ->11,200
						7L,
						"co to jest kolejka priorytetowa w Javie?",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a element o niskim priorytecie jest obsługiwany przed elementem o wysokim priorytecie",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a elementy są obsługiwane zależnie od ich kolejności wstawiania",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a elementy są obsługiwane losowo",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a element o wysokim priorytecie jest obsługiwany przed elementem o niskim priorytecie",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a element o wysokim priorytecie jest obsługiwany przed elementem o niskim priorytecie",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt9 ->12,200
						8L,
						"metoda put() tj. map.put (K key, V value)",
						"dodaje do mapy wartość 'v' przypisaną do klucza 'k'",
						"usuwa z mapy klucz i wartość",
						"zmienia w mapie klucz i wartość",
						"zwraca true gdy mapa zawiera dany klucz i wartość",
						"dodaje do mapy wartość 'v' przypisaną do klucza 'k'",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt10 ->14,200
						9L,
						"metoda entrySet(), map.entrySet()",
						"zwraca zbiór kluczy w mapie",
						"zwraca zbiór obiektów typu Map.Entry, które reprezentują kolejne rekordy w mapie na zasadzie klucz-wartość",
						"zwraca rozmiar (ilość elementów) mapy",
						"zwraca kolekcję wartości",
						"zwraca zbiór obiektów typu Map.Entry, które reprezentują kolejne rekordy w mapie na zasadzie klucz-wartość",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt11 ->15,200
						10L,
						"metoda values(), tj. map.values()",
						"zwraca kolekcję obiektów klucz-wartość",
						"zwraca zbiór wartości zawartych w mapie",
						"zwraca kolekcję wartości zawartych w mapie",
						"zwraca zbiór obiektów klucz-wartość",
						"zwraca kolekcję wartości zawartych w mapie",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt12 ->16,200
						11L,
						"metoda get(Object key), tj. map.get(kay)",
						"zwraca wartość przypisaną do klucza 'key' lub null jeśli do takiego klucza nie jest przypisana żadna wartość",
						"zwraca wartość przypisaną do klucza 'key' lub exception jeśli do takiego klucza nie jest przypisana żadna wartość",
						"wstawia do mapy wartość 'v' przypisaną do klucza 'k'",
						"zwraca rozmiar (ilość kluczy) w mapie",
						"zwraca wartość przypisaną do klucza 'key' lub null jeśli do takiego klucza nie jest przypisana żadna wartość",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt13 ->18,300
						12L,
						"Kolejka deque to:",
						"kolejka dwukierunkowa, która umożliwia dodawanie elementów w środku kolejki",
						"kolejka dwukierunkowa, pozwalająca na szybkie dodawanie i usuwanie elementów po obu stronach",
						"kolejka, pozwalająca na szybkie dodawanie i usuwanie elementów na początku kolejki",
						"kolejka w której znajdują się posortowane elementy",
						"kolejka dwukierunkowa, pozwalająca na szybkie dodawanie i usuwanie elementów po obu stronach",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt14 ->19,300
						13L,
						"Jak odwrócisz arrayListę?",
						"arrayList nie można odwrócić za pomocą metody",
						"arrayList można odwrócić za pomocą metody replays() klasy Collections",
						"arrayList można odwrócić za pomocą metody reverse() klasy Collections",
						"arrayList można odwrócić za pomocą metody changeplays() klasy Collections",
						"arrayList można odwrócić za pomocą metody reverse() klasy Collections",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt15 ->20,300
						14L,
						"implementacji zbiorów HashSet to?",
						"implementacja oparta o drzewa czerwono czarne, która nie zapewnia unikalności elementów",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności, wewnętrznie wykorzystywana jest tablica mieszająca",
						"podstawowa implementacja, nie zapewnia unikalności elementów oraz nie mamy żadnej gwarancji co do ich kolejności",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie wstawianych elementów",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności, wewnętrznie wykorzystywana jest tablica mieszająca",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt16 ->21,300
						15L,
						"implementacji zbiorów LinkedHashSet to?",
						"implementacja wykorzystująca wewnętrznie zarówno tablicę mieszającą jak i dodatkową listę podwójnie wiązaną, m.in. gwaratuje unikalności elementów",
						"implementacja wykorzystująca tablicę mieszającą, dzięki czemu zagwarantowana jest unikalności elementów",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie elementów",
						"implementacja wykorzystująca wewnętrznie zarówno tablicę mieszającą jak i dodatkową listę podwójnie wiązaną, m.in. gwaratuje unikalności elementów",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt17 ->22,300
						16L,
						"implementacji zbiorów TreeSet to?",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie wstawianych elementów zgodnie z naturalnym porządkiem",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności",
						"implementacja wykorzystująca wewnętrznie zarówno tablicę mieszającą jak i dodatkową listę podwójnie wiązaną",
						"implementacja oparta o drzewa czerwono czarne, która nie zapewnia unikalności elementów, ale gwarantuje nam uporządkowanie wstawianych elementów",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie wstawianych elementów zgodnie z naturalnym porządkiem",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt18 ->23,300
						17L,
						"implementacji mapy LinkedHashMap to?",
						"implementacja oparta o tablicę mieszaną, nie gwarantuje żadnej kolejności elementów",
						"implementacja, która zapewnia dodatkowo sortowanie na podstawie naturalnego porządku kluczy wyznaczanego przez implementację interfejsu Comparable",
						"implementacja, wykorzystuje drzewa czerwono czarne, wymaga prawidłowej implementacji metod equals() i hashCode() w klasie definiującej klucz",
						"implementacja mapy, która zapewnia zapamiętywanie kolejności dodawania elementów, wykorzystuje tablicę mieszaną oraz listę wiązaną",
						"implementacja mapy, która zapewnia zapamiętywanie kolejności dodawania elementów, wykorzystuje tablicę mieszaną oraz listę wiązaną",
						"kolekcje mapy strumienie",
						300),
				///////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/ex25
						18L,
						"Jaka jest różnica między metodami peek() i pop(), tj. stack.peek(element) stack.pop(element)",
						"metoda peek oraz metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, jednak metody pop nie należy używać na pustym stosie",
						"metoda peek usuwa i zwraca element znajdujący się na wierzchu stosu, metoda pop zwraca element znajdujący się na wierzchu stosu, nie usuwa go",
						"metoda peek oraz metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, jednak metody peek nie należy używać na pustym stosie",
						"metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, metoda peek zwraca element znajdujący się na wierzchu stosu, nie usuwa go",
						"metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, metoda peek zwraca element znajdujący się na wierzchu stosu, nie usuwa go",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt2 -400/ex26
						19L,
						"Co to znaczy, że strumienie są leniwie inicjowane (ang. laziness-seeking)",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę terminalną",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę nieterminalną",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę stream",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę filter",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę terminalną",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt3 -400/ex27
						20L,
						"metoda offer() interfejsu deque",
						"wstawia określony element na początku kolejki, jeśli można to zrobić natychmiast bez naruszania ograniczeń pojemności, zwracając true po sukcesie i false jeśli aktualnie nie ma wolnego miejsca",
						"wstawia określony element na końcu kolejki, jeśli można to zrobić natychmiast bez naruszania ograniczeń pojemności, zwracając true po sukcesie i false jeśli aktualnie nie ma wolnego miejsca",
						"pobiera, ale nie usuwa, pierwszy element kolejki deque lub zwraca null, jeśli ta deque jest pusta",
						"pobiera i usuwa, pierwszy element kolejki deque lub zwraca null, jeśli ta deque jest pusta",
						"wstawia określony element na końcu kolejki, jeśli można to zrobić natychmiast bez naruszania ograniczeń pojemności, zwracając true po sukcesie i false jeśli aktualnie nie ma wolnego miejsca",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt4 -400/ex28
						21L,
						"metody element()i peek()…",
						"zwracają i usuwają, ostatni element kolejki",
						"zwracają, ale nie usuwają, ostatni element kolejki",
						"zwracają i usuwają, pierwszy element kolejki",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove()zwraca null, a poll()  zgłasza wyjątek",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove()zwraca null, a poll()  zgłasza wyjątek",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt5 -400/ex29
						22L,
						"metoda add() w interfejsie Queue",
						"nie występuje",
						"występuje i jest równoznaczna z metodą offer()",
						"wstawia określony element do kolejki, zwracając true po pomyślnym zakończeniu i wyrzucając, IllegalStateExceptionjeśli gdy aktualnie nie ma dostępnego miejsca w kolejce",
						"wstawia określony element do kolejki, zwracając true po pomyślnym zakończeniu i zwracając false gdy aktualnie nie ma dostępnego miejsca w kolejce",
						"wstawia określony element do kolejki, zwracając true po pomyślnym zakończeniu i wyrzucając, IllegalStateExceptionjeśli gdy aktualnie nie ma dostępnego miejsca w kolejce",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt6 -400/e27->30
						23L,
						"Metody remove()i poll()…",
						"metoda remove() usuwa pierwszy element kolejki, a poll() zwraca pierwszy element kolejki i następnie usuwa go",
						"metoda remove() usuwa pierwszy element kolejki, a poll() zwraca pierwszy element kolejki nie usuwając go",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove() zgłasza wyjątek, a poll() zwraca null",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove()zwraca null, a poll()  zgłasza wyjątek",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove() zgłasza wyjątek, a poll() zwraca null",
						"kolekcje mapy strumienie",
						400),
				///////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/e31
						24L,
						"W klasie Collections dostępna jest metoda suffle, która…",
						"sortuje elementy listy i odwraca ich kolejność",
						"działa odwrotnie do sortowania -tasuje elementy listy",
						"losuje elementy listy",
						"dzieli elementy na grupy",
						"działa odwrotnie do sortowania -tasuje elementy listy",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt2 -500/e32
						25L,
						"Metoda filter dostępna na strumieniach…",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true i jest to metoda terminalna",
						"zwraca strumień ograniczony do zadanej liczby elementów",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true",
						"zwraca listę zawierającą tylko te elementy dla których filtr zwrócił wartość true",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt3 -500/e33
						25L,
						"Metoda map dostępna na strumieniach…",
						"powoduje że, każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu",
						"powoduje że wskazany element strumienia może zostać zmieniony na element innego typu",
						"powoduje że każdy z elementów może zostać zmieniony do innego typu, nowe obiekty zawarte są w liście",
						"pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementam",
						"powoduje że, każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt4 -500/e34
						27L,
						"Metoda peek dostępna na strumieniach…",
						"pozwala przeprowadzić operację na wybranym elemencie w strumieniu, zwraca strumień zawierający ten element",
						"zwraca strumień ograniczony do zadanej liczby elementów, pozostałe są ignorowane",
						"powoduje że wskazany element strumienia może zostać zmieniony na element innego typu",
						"pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementami",
						"pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementami",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt5 -500/e35
						28L,
						"Metoda collect dostępna na strumieniach…",
						"pozwala na utworzenie nowego strumienia na podstawie elementów listy",
						"pozwala na utworzenie nowego typu na podstawie elementów strumienia, przy pomocy tej metody można na przykład utworzyć listę",
						"zwraca flagę informującą czy wszystkie elementy spełniają warunek",
						"zwraca liczbę elementów w strumieniu",
						"pozwala na utworzenie nowego typu na podstawie elementów strumienia, przy pomocy tej metody można na przykład utworzyć listę",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt6 -500/e36
						29L,
						"Metoda count dostępna na strumieniach…",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true i jest to metoda terminalna",
						"powoduje że wskazany element strumienia może zostać zmieniony na element innego typu",
						"zwraca flagę informującą czy wszystkie elementy spełniają warunek",
						"zwraca liczbę elementów w strumieniu",
						"zwraca liczbę elementów w strumieniu",
						"kolekcje mapy strumienie",
						500),
				//

				////////////////////////////////////////////////////////////////////////////////////////
				// KATEGORIA GIT
				//////////////////////////////////////////////////////////////////////////////////////// 100/////////////////////////////////////////////////////////////////
				///////////////////////////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100/e39
						30L,
						"komenda git init",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"GIT",
						100),
				new QuestionsData(
						// pyt2 -100/e40
						31L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						100),
				new QuestionsData(
						// pyt3 -100/e41
						32L,
						"komenda git status",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"GIT",
						100),
				new QuestionsData(
						// pyt4 -100/e42
						33L,
						"komenda git add .",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"akceptuje wszystkie wprowadzone zmiany i oznacza je jako staged, jest niezbędna gdy wprowadzisz zmiany, dodasz nowy plik, usuniesz, lub zmodyfikujesz go",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"akceptuje wszystkie wprowadzone zmiany i oznacza je jako staged, jest niezbędna gdy wprowadzisz zmiany, dodasz nowy plik, usuniesz, lub zmodyfikujesz go",
						"GIT",
						100),
				new QuestionsData(
						// pyt5 -100/e43
						34L,
						"komenda git commit -m",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest  zapisać zmiany",
						"akceptuje wszystkie wprowadzone zmiany i oznacza je jako staged, jest niezbędna gdy wprowadzisz zmiany, dodasz nowy plik, usuniesz, lub zmodyfikujesz go",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest  zapisać zmiany",
						"GIT",
						100),
				new QuestionsData(
						// pyt6 -100/e44!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
						35L,
						"komenda git status",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"GIT",
						100),
				// KATEGORIA GIT
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e46
						36L,
						"komenda git push",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git push origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git push origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha z wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha z zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git push origin nazwa_brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt2 -200/e47!!!!!!!!!!!!!!!!!111
						37L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt3 -200/e48!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						38L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt4 -200/e49
						39L,
						"czym jest system kontroli wersji?",
						"to oprogramowanie, które pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  Git jest najbardziej popularnym systemem kontroli wersji",
						"to oprogramowanie, które pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  GitHub jest najbardziej popularnym systemem kontroli wersji",
						"to portal internetowy, który pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  GitHub jest najbardziej popularnym systemem kontroli wersji",
						"to oprogramowanie, które  tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"to oprogramowanie, które pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  Git jest najbardziej popularnym systemem kontroli wersji",
						"GIT",
						200),
				new QuestionsData(
						// pyt5 -200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
						40L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt6 -200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						41L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				// KATEGORIA GIT
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
						42L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt2 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						43L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt3 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						44L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt4 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						45L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt5 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						46L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt6 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						47L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				// KATEGORIA GIT
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400!!!!!!!!!!!!!!!!!!!!!!!!!!!
						48L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt2 -400!!!!!!!!!!!!!!!!!!!!!!
						49L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt3 -400!!!!!!!!!!!!!!!!!!!!!!!!
						50L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt4 -400!!!!!!!!!!!!!!!!!!!!
						51L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt5 -400!!!!!!!!!!!!!!!!!!!
						52L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt6 -400!!!!!!!!!!!!!!!!!!
						53L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				/// KATEGORIA GIT
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						54L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt2 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						55L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						56L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt4 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						57L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt5 -500!!!!!!!!!!!!!!!!!!!!!!!!!!
						58L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt6 -500!!!!!!!!!!!!!!!!!!!
						59L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				////////////////////////////////////////////////////////////
				//////////// Wątki////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100/e75
						60L,
						"Metoda void lock()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwalnia blokadę po wykonaniu wątku",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"Wątki",
						100),
				new QuestionsData(
						// pyt2 -100/e76
						61L,
						"metoda void unlock()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwalnia blokadę",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"zwalnia blokadę",
						"Wątki",
						100),
				new QuestionsData(
						// pyt3 -100/e77
						62L,
						"ReentrantLock(boolean fair)",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwalnia blokadę",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"Wątki",
						100),
				new QuestionsData(
						// pyt4 -100/e78
						63L,
						"Condition newCondition()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwraca obiekt warunku związany z blokadą ",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"zwraca obiekt warunku związany z blokadą ",
						"Wątki",
						100),
				new QuestionsData(
						// pyt5 -100/e79
						64L,
						"Metoda void signalAll()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwraca obiekt warunku związany z blokadą ",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"Wątki",
						100),
				new QuestionsData(
						// pyt6 -100/e80
						65L,
						"Metoda void signal()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwraca obiekt warunku związany z blokadą ",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku ",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku ",
						"Wątki",
						100),
				// Wątki
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e82
						66L,
						"metoda void await()",
						"zwraca obiekt warunku związany z blokadą",
						"umieszcza wątek w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"umieszcza wątek w kolejce oczekujących do warunku",
						"Wątki",
						200),
				new QuestionsData(
						// pyt2 -200/e83
						67L,
						"Thread(Runnable target)",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"umieszcza wątek w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"Wątki",
						200),
				new QuestionsData(
						// pyt3 -200/e84
						68L,
						"Metoda thread.start()",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"uruchamia wątek, powodując wywołanie metody run()",
						"Wątki",
						200),
				new QuestionsData(
						// pyt4 -200/e85
						69L,
						"Metoda static void sleep(long millis)",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"zatrzymuje wykonywanie bieżącego wątku  na określony czas ",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"zatrzymuje wykonywanie bieżącego wątku  na określony czas ",
						"Wątki",
						200),
				new QuestionsData(
						// pyt5 -200/e86
						70L,
						"Metoda void notifyAll()",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"odblokowuje wszystkie wątki, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku.",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku.",
						"Wątki",
						200),
				new QuestionsData(
						// pyt6 -200/e87
						71L,
						"Metoda void notify()",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"odblokowuje jeden losowo wybrany wątek spośród tych, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku. ",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"odblokowuje jeden losowo wybrany wątek spośród tych, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku. ",
						"Wątki",
						200),
				// Wątki
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300/e89
						72L,
						"W interfejsie Future<V> znajdują się następujące metody:",
						"V call(); V get(); V get(long timeout, TimeUnit unit)",
						"V get(); V get(long timeout, TimeUnit unit); void cancel(boolean mayInterrupt); boolean isCancelled(); boolean isDone()",
						"V call() boolean isCancelled(); boolean isDone()",
						"V call(); void cancel(boolean mayInterrupt)",
						"V get(); V get(long timeout, TimeUnit unit); void cancel(boolean mayInterrupt); boolean isCancelled(); boolean isDone()",
						"Wątki",
						300),
				new QuestionsData(
						// pyt2 -300/e90
						73L,
						"Metoda V get() w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt3 -300/e91
						74L,
						"Metoda boolean cancel(boolean mayInterrupt) w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt4 -300/e92
						75L,
						"Metoda   boolean isCancelled()    w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt5 -300/e93
						76L,
						"Metoda     boolean isDone()    w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt6 -300/e94
						77L,
						"Metoda     V call()     w interfejsie  Callable<V>",
						"Uruchamia zadanie, które zwraca wynik. Na przykład interfejs Callable<Integer> reprezentuje asynchroniczne działania, których wynikiem jest obiekt typu Integer.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Uruchamia zadanie, które zwraca wynik. Na przykład interfejs Callable<Integer> reprezentuje asynchroniczne działania, których wynikiem jest obiekt typu Integer.",
						"Wątki",
						300),
				// Wątki
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/e96
						78L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt2 -400!!!!!!!!!!!!!!!!!!!!!
						79L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt3 -400!!!!!!!!!!!
						80L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt4 -400!!!!!!!!!!!!!!!!!!!
						81L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt5 -400!!!!!!!!!!!!!!!!!!!!
						82L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt6 -400!!!!!!!!!!!!!!
						83L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				/// Wątki
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/e103
						84L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt2 -500!!!!!!!!!!!!!!!!!
						85L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!!!!!!!!!!!
						86L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt4 -500!!!!!!!!!!!!!!!!
						87L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt5 -500!!!!!!!!!!!!!!!
						88L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt6 -500!!!!!!!!!!
						89L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"GIT",
						500),
				////////////////////////////////////////////////////////////
				//////////// Podstawowe elementy języka
				//////////////////////////////////////////////////////////// java////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100
						90L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. Nie jest prawidłowa",
						"C++",						
						"Podstawowe elementy języka Java",
						100),
				new QuestionsData(
						// pyt2 -100!!!!!!!!!!!!!!!!
						91L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						"\"\\t\"",
						"\"\\n\"",
						"\"\\r\"",
						"żaden z powyższych",
						"\"\\n\"",						
						"Podstawowe elementy języka Java",
						100),
				new QuestionsData(
						// pyt3 -100!!!!!!!!!!!!!!!!
						92L,
						"Jaka jest wartość wyrażenia 2.32+\"2.68\"?",
						"String \"2.322.68\"",
						"double 5.0",
						"int 5",
						"String \"5\"",
						"String \"2.322.68\"",
						"Podstawowe elementy języka Java",
						100),
				new QuestionsData(
						// pyt4 -100!!!!!!!!!!!!!!
						93L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",						
						"Podstawowe elementy języka Java",
						100),
				new QuestionsData(
						// pyt5 -100!!!!!!!!!!!!!
						94L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",						
						"Podstawowe elementy języka Java",
						100),
				new QuestionsData(
						// pyt6 -100!!!!!!!!!!!
						95L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",						
						"Podstawowe elementy języka Java",
						100),
				// Podstawowe elementy języka Java
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e.112
						96L,
						"Jakie słowo kluczowe opisuje stałe w Javie?",
						"final ",
						"Final",
						"const",
						"Const",
						"final ",						
						"Podstawowe elementy języka Java",
						200),
				new QuestionsData(
						// pyt2 -200!!!!!!!!!!!!!!
						97L,
						"Który z podanych identyfikatorów jest poprawny?",
						"double 314ToLiczbaPi",
						"double promien kola",
						"int liczba#pracownikow",
						"int $wynagrodzenieMiesieczne",
						"int $wynagrodzenieMiesieczne",						
						"Podstawowe elementy języka Java",
						200),
				new QuestionsData(
						// pyt3 -200!!!!!!!!!!!!
						98L,
						"Który z podanych identyfikatorów jest poprawny?",
						"double _pi",
						"String true",
						"int 007",
						"String null",
						"double _pi",						
						"Podstawowe elementy języka Java",
						200),
				new QuestionsData(
						// pyt4 -200!!!!!!!!!!!!!
						99L,
						"Ciało której pętli wykona się chociaż raz?",
						"do..while",
						"while ",
						"for ",
						"wszystkie",
						"do..while",						
						"Podstawowe elementy języka Java",
						200),
				new QuestionsData(
						// pyt5 -200!!!!!!!!!
						100L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno Math.sqrt(1) jak i Math.pow(1,1)",
						"zarówno Math.sqrt(1) jak i Math.pow(1,1)",						
						"Podstawowe elementy języka Java",
						200),
				new QuestionsData(
						// pyt6 -200!!!!!!!!!!!!
						101L,
						"Który z poniższych typów NIE jest referencją:",
						"Double",
						"Character",
						"int[]",
						"double (bo to typ prymitywny)",
						"double (bo to typ prymitywny)",						
						"Podstawowe elementy języka Java",
						200),
				// Podstawowe elementy języka Java
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300/e114
						102L,
						"Która z poniższych sygnatur (pomijamy brak ciała metod) metod jest prawidłowa?",
						"public static void metoda(wiadomosc String)",
						"public static void metoda",
						"public static void metoda(int byte, char znak)",
						"public static void metoda()",
						"public static void metoda()",						
						"Podstawowe elementy języka Java",
						300),
				new QuestionsData(
						// pyt2 -300!!!!!!!!!
						103L,
						"Jaka jest widoczność modyfikator dostępu protected ?",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",						
						"Podstawowe elementy języka Java",
						300),
				new QuestionsData(
						// pyt3 -300!!!!!!!!
						104L,
						"Parametrem funkcji main(), od której rozpoczyna się uruchamianie programu jest:",
						"Dowolny ciąg deklaracji zmiennych oddzielonych przecinkami",
						"Tablica String[]",
						"String",
						"Tablica Object[]",
						"Tablica String[]",						
						"Podstawowe elementy języka Java",
						300),
				new QuestionsData(
						// pyt4 -300!!!!!!!!!!!
						105L,
						"Który z poniższych typów jest klasą potomną Object:",
						"Żaden",
						"double[]",
						"void",
						"int",
						"double[]",						
						"Podstawowe elementy języka Java",
						300),
				new QuestionsData(
						// pyt5 -300!!!!!!!!!!!
						106L,
						"Który z poniższych typów jest klasą potomną Object:",
						"Żaden",
						"double[]",
						"void",
						"int",
						"double[]",						
						"Podstawowe elementy języka Java",
						300),
				new QuestionsData(
						// pyt6 -300!!!!!!!!!!!!
						107L,
						"Wskaż poprawny sposób pobrania rozmiaru tablicy arr?",
						"arr.length()",
						"arr.length",
						"arr.size",
						"arr.size()",
						"arr.length",						
						"Podstawowe elementy języka Java",
						300),
				// Podstawowe elementy języka Java
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/e119
						108L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",						
						"Podstawowe elementy języka Java",
						400),
				new QuestionsData(
						// pyt2 -400!!!!!!!
						109L,
						"Która z poniższych deklaracji tablicy jest niepoprawna?",
						"Integer[] tab = new int[]{1,2,3};",
						"Integer[] tab = {1,2,3,}",
						"int tab[] = {1,2,3};",
						"wszystkie są poprawne",
						"Integer[] tab = new int[]{1,2,3};",						
						"Podstawowe elementy języka Java",
						400),
				new QuestionsData(
						// pyt3 -400!!!!!!!!!!!!
						110L,
						"Który z poniższych fragmentów kodu sprawdza, czy obiekt wskazywany przez referencję xyz należy do klasy XYZ",
						"if(XYZ classof xyz)",
						"if(xyz instanceof XYZ)",
						"if{ (XYZ)zyx != null)",
						"if(xyz: XYZ)",
						"if(xyz instanceof XYZ)",						
						"KATEGORIA:Podstawowe elementy języka Java",
						400),
				new QuestionsData(
						// pyt4 -400!!!!!!!!!!
						111L,
						"Aby sprawdzić, czy dwa obiekty typu String mają taką samą zawartość należy:",
						"Użyć operatora ==",
						"Użyć metody String.strcmp()",
						"Użyć metody equals()",
						"Użyć operatora =",
						"Użyć metody equals()",						
						"Podstawowe elementy języka Java",
						400),
				new QuestionsData(
						// pyt5 -400!!!!!!!!!
						112L,
						"Jeśli nie napiszemy żadnego modyfikatora przed nazwą klasy to wtedy domyślnie:",
						"Klasa będzie prywatna",
						"Klasa będzie publiczna",
						"Klasa będzie widoczna tylko w obrębie pakietu",
						"Klasa będzie widoczna i dostępna w obrębie pakietu oraz dla wszystkich podklas",
						"Klasa będzie widoczna tylko w obrębie pakietu",						
						"Podstawowe elementy języka Java",
						400),
				new QuestionsData(
						// pyt6 -400!!!!!!!!
						113L,
						"Jaki wyjątek zostanie rzucony w przypadku odwołania się do indeksu z poza zakresu?",
						"NullPointerException",
						"IndexOutOfBoundsException",
						"SQLException",
						"IllegalArgumentException",
						"IndexOutOfBoundsException",						
						"Podstawowe elementy języka Java",
						400),
				/// Podstawowe elementy języka Java
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/e121
						114L,
						"Które z poniższych stwierdzeń jest NIEprawdziwe:",
						"Każda metoda zadeklarowana wewnątrz interfejsu jest publiczna",
						"W interfejsach nie można deklarować pól",
						"Każda zmienna zadeklarowana wewnątrz interfejsu jest finalna i statyczna",
						"Każda metoda zadeklarowana wewnątrz interfejsu jest abstrakcyjna",
						"W interfejsach nie można deklarować pól",						
						"Podstawowe elementy języka Java",
						500),
				new QuestionsData(
						// pyt2 -500!!!!!!!!!
						115L,
						"Które z poniższych stwierdzeń jest NIEprawdziwe:",
						"Interfejs może dziedziczyć po interfejsie. Dziedziczone są wówczas zdefiniowane w nim stałe i metody",
						"Wewnątrz interfejsu można zadeklarować klasę lub interfejs",
						"Klasa może implementować wiele interfejsów",
						"Klasa implementująca jakiś interfejs nie może dziedziczyć po innej klasie",
						"Klasa implementująca jakiś interfejs nie może dziedziczyć po innej klasie",						
						"Podstawowe elementy języka Java",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!!!!!
						116L,
						"Które z poniższych zdań jest NIEprawdziwe:",
						"Klasa, która nie jest publiczna jest widoczna wyłącznie wewnątrz pakietu, do którego należy",
						"W języku Java możliwe jest dziedziczenie wielobazowe, ale nie zaleca się jego stosowania",
						"Klasa Object jest nadklasą każdej klasy (poza samą sobą)",
						"wszystkie są poprawne",
						"wszystkie są poprawne",						
						"Podstawowe elementy języka Java",
						500),
				new QuestionsData(
						// pyt4 -500!!!!!!!!
						117L,
						"Wyjątki są…",
						"Obiektami, które opisują błędną sytuację w kodzie",
						"Podklasami klasy Throwable",
						"Związane ze słowami kluczowymi: try, catch, finally, throw, throws",
						"Wszystkie powyższe odpowiedzi są poprawne",
						"Wszystkie powyższe odpowiedzi są poprawne",						
						"Podstawowe elementy języka Java",
						500),
				new QuestionsData(
						// pyt5 -500!!!!!!!!
						118L,
						"Która kombinacja modyfikatorów jest dopuszczalna?",
						"abstract final",
						"static synchronized",
						"abstract synchronized",
						"private abstract",
						"static synchronized",
						"Podstawowe elementy języka Java",
						500),
				new QuestionsData(
						// pyt6 -500!!!!!!!!!
						119L,
						"Które ze stwierdzeń odnoszących się do wyjątków jest NIEprawdziwe:",
						"Po wygenerowaniu wyjątku program kończy działanie",
						"Wyjątki użytkownika powinny być potomkami klasy Exception",
						"Wyjątki typu RuntimeException() (i klas potomnych) generowane są poprzez maszynę wirtualną, np. w wyniku sprawdzania zabezpieczeń",
						"Obiekty wyjątków przenoszą informację o stanie stosu (np. w momencie ich generacji)",
						"Po wygenerowaniu wyjątku program kończy działanie",
						"Podstawowe elementy języka Java",
						500),
				////////////////////////////////////////////////////////////
				//////////// JavaFX, Swing, AWT////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100/e115
						120L,
						"Który zapis jest poprawny?",
						"JButton jButton = new JButton (\"Tekst\");",
						"JButton jButton = JButton (\"Tekst\");",
						"JButton jButton = new JButton;",
						"JButton jButton = JButton();",
						"JButton jButton = new JButton (\"Tekst\");",
						"JavaFX, Swing, AWT",
						100),
						
				new QuestionsData(
						// pyt2 -100!!!!!!!!!!!!
						121L,
						"Przyjmijmy, że JFrame frame = new JFrame(). W jaki sposób możemy ustawić rozmiar frame?",
						"frame.setSize(100, 100)",
						"frame.setDimension(100, 100)",
						"frame.setBounds(100, 100)",
						"frame.setLocation(100, 100)",
						"frame.setSize(100, 100)",
						"JavaFX, Swing, AWT",
						100),						
				new QuestionsData(
						// pyt3 -100!!!!!!!!
						122L,
						"Która z podanych poniżej bibliotek umożliwia tworzenie graficznego interfejsu użytkownika?",
						"AWT",
						"Swing",
						"JavaFX",
						"Wszystkie wymienione",
						"Wszystkie wymienione",
						"JavaFX, Swing, AWT",
						100),
						
				new QuestionsData(
						// pyt4 -100!!!!!!
						123L,
						"Dzieli powierzchnię na pięć regionów i rozkłada w nich węzły. Jakiej klasy dotyczy ten opis?",
						"Pane",
						"AnchorPane",
						"BorderPane",
						"FlowPane",
						"BorderPane",
						"JavaFX, Swing, AWT",
						100),
						
				new QuestionsData(
						// pyt5 -100!!!!!!!!
						124L,
						"Do czego może być wykorzystywana technologia JavaFX?",
						"Do tworzenia aplikacji deskopowych",
						"Do tworzenia aplikacji dla urządzeń mobilnych.",
						"Do tworzenia aplikacji internetowych.",
						"Wszystkie odpowiedzi są poprawne.",
						"Wszystkie odpowiedzi są poprawne.",
						"JavaFX, Swing, AWT",
						100),
						
				new QuestionsData(
						// pyt6 -100!!!!!!!!
						125L,
						"Jaka klasa jest parametrem metody start()? [JavaFX]",
						"Stage",
						"Scene",
						"Window",
						"Canvas",
						"Stage",
						"JavaFX, Swing, AWT",
						100),
						
				// JavaFX, Swing, AWT
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e.118
						126L,
						"Jaki jest domyślny zarządca dla kontenera typu JFrame?",
						"FlowLayout",
						"CardLayout",
						"BoxLayout",
						"BorderLayout",
						"BorderLayout",
						"JavaFX, Swing, AWT",
						200),
						
				new QuestionsData(
						// pyt2 -200!!!!!!!!!
						127L,
						"Jaki jest domyślny zarządca dla kontenera typu JPanel?",
						"FlowLayout",
						"CardLayout",
						"BoxLayout",
						"BorderLayout",
						"FlowLayout",
						"JavaFX, Swing, AWT",
						200),
						
				new QuestionsData(
						// pyt3 -200!!!!!!!!
						128L,
						"Co robi metoda pack() z klasy JFrame?",
						"dopasowuje rozmiar okna do rozmiaru komponentów.",
						"dopasowuje rozmiar komponentów do rozmiaru okna",
						"dopasowuje rozmiar komponentów do rozmiaru sceny",
						"dopasowuje rozmiar sceny do rozmiaru komponentów.",
						"dopasowuje rozmiar okna do rozmiaru komponentów.",
						"JavaFX, Swing, AWT",
						200),
						
				new QuestionsData(
						// pyt4 -200!!!!!!!!!!
						129L,
						"Który z układów pozwala na umieszczanie elementów w wierszach i kolumnach?",
						"FlowPane",
						"GridPane",
						"BorderPane",
						"StackPane",
						"GridPane",
						"JavaFX, Swing, AWT",
						200),
						
				new QuestionsData(
						// pyt5 -200!!!!!!!!!!!
						130L,
						"Który zapis nie jest poprawny?",
						"Color color1 = new Color(0.4, 0.6, 1.0);",
						"Color color1 = Color.DARKORANGE;",
						"Color color1 = new Color(256, 50, 60);",
						"Color color1 = new Color.rgb(256, 50, 60);",
						"Color color1 = new Color(256, 50, 60);",
						"JavaFX, Swing, AWT",
						200),
						
				new QuestionsData(
						// pyt6 -200!!!!!!!
						131L,
						"Który z podanych konstruktrów jest poprawny?",
						"FlowPane()",
						"FlowPane(double hgap, double vgap)",
						"FlowPane(Orientation orientation)",
						"Wszystkie odpowiedzi są poprawne.",
						"Wszystkie odpowiedzi są poprawne.",
						"JavaFX, Swing, AWT",
						200),
						
				// JavaFX, Swing, AWT
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300/e116
						132L,
						"Jaki argument przyjmie metoda setDefaultCloseOperation(arg),w przypadku gdy chcemy zamknąć aplikację po zamknięciu okna?",
						"DO_NOTHING_ON_CLOSE",
						"HIDE_ON_CLOSE",
						"DISPOSE_ON_CLOSE",
						"EXIT_ON_CLOSE",
						"EXIT_ON_CLOSE",
						"JavaFX, Swing, AWT",
						300),
						
				new QuestionsData(
						// pyt2 -300!!!!!!
						133L,
						"Przyjmijmy, że JButton b1= new JButton(\"button 1\"). Przy wywołaniu b1.setBounds(10,10,100,40) otrzymamy przycisk: ",
						"którego lewy, górny narożnik znajduje się w punkcie o współrzędnych x=10, y=10. Natomiast prawy dolny narożnik znajduje się w punkcie o współrzędnych x=100, y=40.",
						"którego lewy, dolny narożnik znajduje się w punkcie o współrzędnych x=10, y=10. Natomiast prawy, górny narożnik znajduje się w punkcie o współrzędnych x=100, y=40.",
						"o szerokości=100, wysokosc=40, którego lewy, górny narożnik znajduje się w punkcie o współrzędnych x=10, y=10. ",
						"o szerokości=100, wysokosc=40, którego lewy, dolny narożnik znajduje się w punkcie o współrzędnych x=10, y=10. ",
						"o szerokości=100, wysokosc=40, którego lewy, górny narożnik znajduje się w punkcie o współrzędnych x=10, y=10. ",
						"JavaFX, Swing, AWT",
						300),
						
				new QuestionsData(
						// pyt3 -300!!!!!!!!
						134L,
						"Która z metod zwraca referencję do obiektu –źródła zdarzenia? ",
						"getSource()",
						"getActionSource()",
						"getEventSource()",
						"getEventObject()",
						"getSource()",
						"JavaFX, Swing, AWT",
						300),
						
				new QuestionsData(
						// pyt4 -300!!!!!
						135L,
						"Zapis HBox myHBox = new HBox(5), oznacza, że:",
						"odstęp między kolejnymi dziećmi będzie wynosił 5 pikseli",
						"myHBox będzie zawierał 5 dzieci ułożonych w poziomej linii od lewej do prawej",
						"myHBox będzie zawierał 5 dzieci ułożonych w pojedynczej kolumnie od góry do dołu",
						"margines zewnętrzny otaczający myHBox będzie wynosił 5 pikseli",
						"odstęp między kolejnymi dziećmi będzie wynosił 5 pikseli",
						"JavaFX, Swing, AWT",
						300),
				new QuestionsData(
						// pyt5 -300!!!
						136L,
						"Przyjmijmy, że VBox vbox = new VBox() oraz Label label = new Label(\"this is VBox example\"). Który z poniższych zapisów jest poprawny?",
						"vbox.getChildren().add(label);",
						"vbox.add(label);",
						"vbox.getChildren(label);",
						"vbox.add.getChildren(label)",
						"vbox.getChildren().add(label);",
						"JavaFX, Swing, AWT",
						300),
				new QuestionsData(
						// pyt6 -300!!!!!!
						137L,
						"Ile i jakie stany posiada CheckBox?",
						"3 stany: checked, unchecked i undefined",
						"2 stany: checked i unchecked",
						"3 stany: selected, unselected i undefined",
						"2 stany: selected i unselected",
						"3 stany: checked, unchecked i undefined",
						"JavaFX, Swing, AWT",
						300),
				// JavaFX, Swing, AWT
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/e.120
						138L,
						"Co zwraca metoda getKeyChar()?",
						"zwraca znak klawisza",
						"zwraca kod klawisza",
						"zwraca wartość true/false",
						"sprawdza czy klawisz jest funkcyjny ",
						"zwraca znak klawisza",
						"JavaFX, Swing, AWT",
						400),
						
				new QuestionsData(
						// pyt2 -400!!!!
						139L,
						"Jaką metodę posiada interfejs KeyListener?",
						"keyTyped",
						"keyPressed",
						"keyReleased",
						"wszystkie wymienione",
						"wszystkie wymienione",
						"JavaFX, Swing, AWT",
						400),
						
				new QuestionsData(
						// pyt3 -400!!!!
						140L,
						"Który z podanych interfejsów obsługuje zdarzenie od naciśnięcia klawiszy myszy?",
						"MouseListener",
						"MouseMotionListener",
						"MouseEvent",
						"MouseFocusListener",
						"MouseListener",
						"JavaFX, Swing, AWT",
						400),
						
				new QuestionsData(
						// pyt4 -400!!!
						141L,
						"Który z podanych konstruktrów NIE jest poprawny?",
						"Image(String url)",
						"Image(String url, boolean backgroundLoading)",
						"Image(InputStream is)",
						"Image(InputStream is, boolean preserveRatio, boolean smooth)",
						"Image(InputStream is, boolean preserveRatio, boolean smooth)",
						"JavaFX, Swing, AWT",
						400),
						
				new QuestionsData(
						// pyt5 -400!!!!
						142L,
						"Który z podanych konstruktrów jest poprawny?",
						"WritableImage(int width, int height)",
						"WritableImage(PixelReader reader, int width, int height)",
						"WritableImage(PixelReader reader, int x, int y, int width, int height)",
						"Wszystkie odpowiedzi są poprawne.",
						"Wszystkie odpowiedzi są poprawne.",
						"JavaFX, Swing, AWT",
						400),
						
				new QuestionsData(
						// pyt6 -400!!!!
						143L,
						"Które stwierdzenie jest fałszywe?",
						"Metoda init() jest wywoływana na samym początku działania aplikacji.",
						"Jeśli aplikacja nie potrzebuje żadnych czynności inicjalizacyjnych, to metody init() nie trzeba przesłaniać.",
						"Metody init() nie można używać do tworzenia obiektu sceny ani do jej konstruowania.",
						"Metody init() należy użyć do tworzenia obiektu sceny i do jej konstruowania.",
						"Metody init() należy użyć do tworzenia obiektu sceny i do jej konstruowania.",
						"JavaFX, Swing, AWT",
						400),
						
				/// java
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/
						144L,
						"Który z podanych zapisów umożliwia centrowanie okna w obszarze pulpitu?  ",
						"JFrame.setLocationRelativeTo(null)  ",
						"JFrame.setLocationRelativeTo(Center)  ",
						"JFrame.setLocation(null)  ",
						"JFrame.setLocation(Center)  ",
						"JFrame.setLocationRelativeTo(null)  ",
						"JavaFX, Swing, AWT ",
						500),
						
				new QuestionsData(
						// pyt2 -500!!!!
						145L,
						"Jakie metody posiada interfejs ActionListener? ",
						"1 metodę tj. actionEvent ",
						"1 metodę tj. actionPerformed",
						"3 metody tj. actionEvent,  actionCommand oraz actionPerformed",
						"1 metodę tj. actionCommand",
						"1 metodę tj. actionPerformed",
						"JavaFX, Swing, AWT",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!
						146L,
						"Jaki jest model obsługi zdarzeń w bibliotece Swing?",
						"Delegacyjny",
						"Globalna kolejka zdarzeń w pętli głównej programu oraz rozpoznanie zdarzenia po typie",
						"Główna pętla i funkcje callback",
						"Globalna kolejka zdarzeń w pętli głównej programu oraz funkcja callback",
						"Delegacyjny",
						"JavaFX, Swing, AWT",
						500),
						
				new QuestionsData(
						// pyt4 -500!!!
						147L,
						"Która z podanych niżej klas NIE dziedziczy po klasie Control?",
						"Slider",
						"Spinner",
						"Menu",
						"ScrollPane",
						"Menu",
						"JavaFX, Swing, AWT",
						500),

				new QuestionsData(
						// pyt5 -500!!!!
						148L,
						"Które stwierdzenie jest fałszywe?",
						"Klasa Canvas dziedziczy po Node.",
						"Canvas jest powierzchnią przeznaczoną do rysowania za pomocą komend języka Java dostarczanych przez klasę GraphicsContext.",
						"Klasa udostępnia metodę getGraphicsContext()",
						"Do utworzenia obiektu klasy Canvas służą 2 konstruktory: Canvas() Canvas(int width, int heigh);",
						"Klasa udostępnia metodę getGraphicsContext()",
						"JavaFX, Swing, AWT",
						500),

				new QuestionsData(
						// pyt6 -500!!!!
						149L,
						"Jakie klasy pozwalają nam na wczytywanie treści ze stron internetowych w JavaFX?",
						"WebView i WebEngine",
						"WebPorts i WebEngine",
						"WebView i WebPorts",
						"WebView, WebEngine i WebPorts",
						"WebView i WebEngine",
						"JavaFX, Swing, AWT",
						500)

		));
	}

}