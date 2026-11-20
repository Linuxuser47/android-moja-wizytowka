# Moja wizytówka – pierwsza aplikacja na Androida

**Autor:** Alex Nowak <!-- ZMIEŃ: imię i nazwisko lub pseudonim -->
**Klasa:** 3TP <!-- ZMIEŃ -->
**Kurs:** [Android Basics with Compose – UNIT 1: Your first Android app](https://developer.android.com/courses/android-basics-compose/unit-1)

## Cel projektu

Celem projektu jest samodzielne przerobienie UNIT 1 kursu Google *Android Basics with Compose*: nauka podstaw języka Kotlin, przygotowanie środowiska Android Studio, zbudowanie prostych aplikacji w Jetpack Compose i wykonanie własnej aplikacji-wizytówki. Każdy etap pracy jest zapisany w osobnym folderze i udokumentowany commitami.

## Struktura repozytorium

```
android-moja-wizytowka/
├── etap-1/                      Podstawy Kotlina
│   ├── Uczen.kt                 program: dane ucznia + funkcja licząca godziny
│   └── cwiczenia/               ćwiczenia z pathway „Introduction to Kotlin”
├── etap-2/
│   └── MojaKlasa/               aplikacja „Moja Klasa” (Text, Column, @Composable, @Preview)
├── etap-3/
│   ├── MojeZainteresowania/     aplikacja „Moje Zainteresowania” (Image, Row, Column, Modifier)
│   └── cwiczenia/               Practice: Compose Basics
│       ├── ComposeArticle/
│       ├── TaskManager/
│       └── ComposeQuadrant/
├── etap-4/
│   └── MojaWizytowka/           projekt końcowy – wizytówka
├── screenshots/                 zrzuty ekranu i potwierdzenia quizów
├── .gitignore
└── README.md
```

## Daty i wyniki etapów

| Etap | Temat | Data oddania | Wynik | Link do folderu |
|---|---|---|---|---|
| 1 | Podstawy języka Kotlin | RRRR-MM-DD | — / 10 | [etap-1](etap-1) |
| 2 | Pierwsza aplikacja i tekst | RRRR-MM-DD | — / 10 | [etap-2](etap-2) |
| 3 | Obrazy i układy Compose | RRRR-MM-DD | — / 10 | [etap-3](etap-3) |
| 4 | Projekt końcowy – Moja wizytówka | RRRR-MM-DD | — / 10 | [etap-4](etap-4) |

<!-- Wpisz datę w dniu oddania etapu, a wynik – gdy nauczyciel go poda. -->

## Ukończone materiały i quizy

### Pathway 1 – Introduction to Kotlin
- [ ] Before you begin
- [ ] Your first program in Kotlin
- [ ] Create and use variables in Kotlin
- [ ] Create and use functions in Kotlin
- [ ] Practice Problems: Kotlin Basics
- [ ] **Quiz: Introduction to Kotlin** – wynik: ______ <!-- np. zaliczony, odznaka zdobyta RRRR-MM-DD -->

### Pathway 2 – Set up Android Studio
- [ ] Download and install Android Studio
- [ ] Create your first Android app
- [ ] Run your first app on the Android Emulator
- [ ] How to connect your Android device
- [ ] **Quiz: Set up Android Studio** – wynik: ______

### Pathway 3 – Build a basic layout
- [ ] Build a simple app with text composables
- [ ] Add images to your Android app
- [ ] Practice: Compose Basics (Compose article, Task manager, Compose quadrant)
- [ ] Project: Create a business card app
- [ ] **Quiz: Build a basic layout** – wynik: ______

> Odpowiedzi do quizów nie są publikowane – w repozytorium są tylko potwierdzenia ukończenia (odznaki).

---

## Etap 1 – Podstawy języka Kotlin

**Co zrobiłem/am:**
- `etap-1/Uczen.kt` – program przedstawiający ucznia (imię, klasa, kierunek). Dane niezmienne są w `val`, a klasa i rok nauki w `var` – program pokazuje zmianę ich wartości.
- Funkcja `obliczLacznaLiczbeGodzin(godzinWTygodniu, liczbaTygodni)` zwraca łączną liczbę godzin. Wywołana dla dwóch zestawów danych: 2 h × 4 tygodnie = 8 h oraz 6 h × 18 tygodni = 108 h.
- `etap-1/cwiczenia/` – ćwiczenia z codelabów (pierwszy program, zmienne, funkcje) i 10 zadań z *Practice Problems: Kotlin Basics*.

**Uruchomienie:** otwórz [Kotlin Playground](https://play.kotlinlang.org), wklej zawartość pliku `.kt` i kliknij **Run**.

**Wynik programu i potwierdzenie quizu:**

![Wynik programu Uczen.kt](screenshots/etap1-wynik-programu.png)
![Quiz Introduction to Kotlin](screenshots/etap1-quiz-kotlin.png)

<!-- ETAP-2 START – usuń tę linię na etapie 2

## Etap 2 – Pierwsza aplikacja i tekst

**Co zrobiłem/am:** aplikacja `etap-2/MojaKlasa` wyświetla nazwę szkoły, klasę, nazwę kierunku i jego krótki opis.
- Własna funkcja `@Composable fun MojaKlasa(szkola: String, klasa: String, kierunek: String, opisKierunku: String)` wywoływana z parametrami tekstowymi.
- Cztery elementy `Text` w `Column`, odstępy przez `Modifier.padding`, rozmiary tekstu 34 / 26 / 20 / 17 sp.
- Podgląd `@Preview` (`MojaKlasaPreview`).
- Teksty zapisane w `res/values/strings.xml`.

**Uruchomienie:** Android Studio → **File → Open** → wybierz folder `etap-2/MojaKlasa` → poczekaj na *Gradle Sync* → wybierz emulator → **Run ▶**.

![Aplikacja Moja Klasa](screenshots/etap2-moja-klasa.png)
![Quiz Set up Android Studio](screenshots/etap2-quiz-android-studio.png)

ETAP-2 KONIEC – usuń tę linię na etapie 2 -->

<!-- ETAP-3 START – usuń tę linię na etapie 3

## Etap 3 – Obrazy i układy Compose

**Co zrobiłem/am:** aplikacja `etap-3/MojeZainteresowania` – ekran z grafiką z zasobów (`res/drawable/zainteresowania.xml`), nagłówkiem, opisem i dwoma polami z umiejętnościami obok siebie.
- `Image` + `painterResource`, `Text`, `Column`, `Row`.
- Pola umiejętności to osobna funkcja `PoleUmiejetnosci`, każde z `Modifier.weight(1f)`, tłem i zaokrąglonymi rogami.
- Ekran można przewijać (`verticalScroll`), więc treść jest czytelna także na małym telefonie.

**Ćwiczenia Practice: Compose Basics** (folder `etap-3/cwiczenia`): `ComposeArticle`, `TaskManager`, `ComposeQuadrant`.

**Uruchomienie:** Android Studio → **File → Open** → wybierz folder projektu (np. `etap-3/MojeZainteresowania`) → **Run ▶**.

![Moje Zainteresowania](screenshots/etap3-moje-zainteresowania.png)
![Compose article](screenshots/etap3-compose-article.png)
![Task manager](screenshots/etap3-task-manager.png)
![Compose quadrant](screenshots/etap3-compose-quadrant.png)

ETAP-3 KONIEC – usuń tę linię na etapie 3 -->

<!-- ETAP-4 START – usuń tę linię na etapie 4

## Etap 4 – Projekt końcowy: Moja wizytówka

**Co zrobiłem/am:** aplikacja `etap-4/MojaWizytowka` – wizytówka z awatarem, imieniem, kierunkiem kształcenia, hasłem o zainteresowaniach zawodowych i danymi kontaktowymi (telefon, e-mail, GitHub – dane fikcyjne).
- Kod podzielony na funkcje `@Composable`: `Wizytowka`, `DaneOsoby`, `Kontakt`, `KontaktWiersz`.
- Użyte elementy: `Text`, `Image`, `Icon`, `Column`, `Row`, `Spacer`, `HorizontalDivider`, `Modifier` (padding, size, clip, border, weight, background).
- Własna paleta kolorów (granat `#0B1F33` + bursztyn `#FFB547`), jasne ikony paska stanu na ciemnym tle.

**Uruchomienie:** Android Studio → **File → Open** → `etap-4/MojaWizytowka` → **Run ▶**.

![Moja wizytówka](screenshots/etap4-wizytowka.png)
![Quiz Build a basic layout](screenshots/etap4-quiz-basic-layout.png)
![Odznaki UNIT 1](screenshots/etap4-odznaki-unit1.png)

ETAP-4 KONIEC – usuń tę linię na etapie 4 -->

---

## Jak uruchomić aplikacje

1. Zainstaluj [Android Studio](https://developer.android.com/studio) i utwórz emulator (Device Manager → *Create Virtual Device*) albo podłącz telefon z włączonym debugowaniem USB.
2. **File → Open** i wskaż folder konkretnego projektu (ten, w którym jest `settings.gradle.kts`), np. `etap-4/MojaWizytowka`.
3. Poczekaj, aż skończy się *Gradle Sync* (przy pierwszym otwarciu Android Studio pobiera potrzebne pliki).
4. Wybierz urządzenie na pasku narzędzi i kliknij **Run ▶**.

Programy z etapu 1 uruchamia się w [Kotlin Playground](https://play.kotlinlang.org).

## Własne zmiany

- **Etap 1:** własne dane ucznia, osobna funkcja `przedstawUcznia()`, pokazanie zmiany wartości `var`, dwa różne zestawy danych dla funkcji liczącej godziny.
- **Etap 2:** cztery teksty zamiast trzech (osobno nazwa i opis kierunku), własne rozmiary i kolory tekstu, teksty w `strings.xml`.
- **Etap 3:** własna grafika wektorowa (laptop z kodem i smartfon), pola umiejętności z podpisem „Umiejętność”, przewijanie ekranu. W ćwiczeniach: teksty w `strings.xml`, przewijanie artykułu, stały rozmiar obrazka w Task manager.
- **Etap 4:** własny projekt wizytówki: kolory, awatar, trzy dane kontaktowe z ikonami, linia oddzielająca, podział na funkcje.

## Napotkane problemy i rozwiązania

<!-- Zostaw tylko to, co Cię naprawdę spotkało, i dopisz własne problemy. -->

| Problem | Rozwiązanie |
|---|---|
| Przykład: Gradle Sync kończył się błędem o wersji JDK | Ustawienie *Gradle JDK* na wersję 17/21 w Settings → Build Tools → Gradle |
| Przykład: emulator nie chciał się uruchomić | Włączenie wirtualizacji w BIOS / wybranie innego obrazu systemu |
| | |

## Źródła grafik i pomocy

- Kurs Google [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course) – materiały, codelaby i treść ćwiczeń.
- Obrazy w ćwiczeniach `bg_compose_background.png` i `ic_task_completed.png` – z repozytorium kursu [google-developer-training/basic-android-kotlin-compose-training-practice-problems](https://github.com/google-developer-training/basic-android-kotlin-compose-training-practice-problems) (licencja Apache 2.0).
- Ikony telefonu, e-maila i kodu w wizytówce – [Material Icons](https://fonts.google.com/icons) (Google, licencja Apache 2.0).
- Grafika „laptop i smartfon”, awatar i ikona aplikacji – grafiki wektorowe (XML) przygotowane z pomocą AI.
- **Użycie AI:** przy pisaniu kodu, przygotowaniu grafik wektorowych i dokumentacji korzystałem/am z asystenta AI **Claude** (Anthropic). Aplikacje samodzielnie uruchomiłem/am, sprawdziłem/am i dostosowałem/am do swoich danych.
